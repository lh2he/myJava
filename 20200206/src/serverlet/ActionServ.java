package serverlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dao.UserDaoImpl;
import entity.User;


/**
 * Servlet implementation class ActionServ
 */
@WebServlet("/ActionServ")
public class ActionServ extends HttpServlet {   
	private UserDao userDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActionServ() {
    	userDao = new UserDaoImpl();
        // TODO Auto-generated constructor stub
    }

    @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String parameter = req.getParameter("username");
    	String parameter2 = req.getParameter("password");
    	System.out.println(parameter);
    	System.out.println(parameter2);
    	// 简单做个判断
    	if(null == parameter || parameter.length() == 0) {
    		System.out.println("用户名为空");
    		//return;
    	}
    	if(null ==  parameter2 || parameter2.length() == 0) {
    		System.out.println("密码为空");
    		//return;
    	}
    	// 调用dao的方法
    	User user = new User(null, parameter, parameter2, null);
    	int addOneUser = userDao.addOneUser(user);
    	if(0 != addOneUser) {
    		// 转发到其他页面
    		req.getRequestDispatcher("login.jsp").forward(req, resp);
    	}
    	System.out.println("注册失败...");
		//停留在当前页面
		// 重定向
		resp.sendRedirect("index.jsp");
	}
}
