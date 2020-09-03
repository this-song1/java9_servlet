package Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/sessiondemo2")
public class SessionDemo2 extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        // 获取 session
        HttpSession session = req.getSession();
        // 获取数据
        Object msg = session.getAttribute("msg");
        System.out.println(msg);
        // 期望客户端关闭后，session也能相同

    }
}
