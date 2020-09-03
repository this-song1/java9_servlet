package com.neusoft.web;


import com.neusoft.domain.PageBean;
import com.neusoft.domain.User;
import com.neusoft.service.UserService;
import com.neusoft.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/findUserByPageServlet")
public class FindUserByPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        // 获取参数
        String currentPage = req.getParameter("currentPage");
        String rows = req.getParameter("rows");
        // 判断
        if (currentPage == null || "".equals(currentPage)){
            currentPage = "1";
        }
        if (rows == null || "".equals(rows)){
            // 默认5条
            rows = "5";
        }
        // 获取条件查询参数
        // name = li &&  address =""   email = "
        Map<String, String[]> condition = req.getParameterMap();

        // service 进行查询
        UserService service = new UserServiceImpl();
        PageBean<User> pb = service.findUserByPage(currentPage, rows, condition);

        System.out.println("pb"+pb);
        // 存入
        req.setAttribute("pb", pb);
        req.setAttribute("condition", condition);
        // 返回页面
        req.getRequestDispatcher("/list.jsp").forward(req, resp);


    }
}