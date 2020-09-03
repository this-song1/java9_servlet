package com.neusoft.zonghe.web.servlet;

import com.neusoft.zonghe.dao.UserDao;
import com.neusoft.zonghe.dao.impl.UserDaoImpl;
import com.neusoft.zonghe.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/failServlet")
public class failServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
// 给页面一句话
        // 设置编码
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("登录失败， 用户名或者密码错误");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
       this.doGet(req,resp);
    }
}
