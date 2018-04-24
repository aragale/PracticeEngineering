package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.Json;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(Json.login(username, password) == true){
			session.setAttribute("username", username);
			session.setAttribute("isLogedin", "yes");
			request.setAttribute("url", "home.jsp");
			request.setAttribute("text", "用户\"" + username + "\"登录成功！");
			request.getRequestDispatcher("/result.jsp").forward(request,response);
		}else {
			session.setAttribute("url", "login.jsp");
			request.setAttribute("text", "登录失败,请重试!");
			request.getRequestDispatcher("/result.jsp").forward(request,response);
		}
	}

}
