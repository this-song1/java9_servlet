package com.neusoft.request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@WebServlet("/Demo2")
public class Demo2 extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 转发
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Demo3");
//        requestDispatcher.forward(req, resp);

        // 转发时存储数据到request域中
        req.setAttribute("msg", "hello");
        req.getRequestDispatcher("/Demo3").forward(req, resp);

//        req.getRequestDispatcher("http://www.baidu.com").forward(req, resp);
    }
}
