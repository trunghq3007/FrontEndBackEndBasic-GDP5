package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import service.UserService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] arrayCoolie = request.getCookies();
		
		boolean isLogin = false ;
		for (int i = 0; i < arrayCoolie.length; i++) {
			if(arrayCoolie[i].getName().equals("userName")) {
				isLogin = true;
			}
		}
		if(isLogin) {
			response.sendRedirect(request.getContextPath()+"/home");
			
			
		}else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/signin.jsp");
			
			dispatcher.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService userService = new UserService();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = userService.getUser(username, password);
		PrintWriter printWriter = response.getWriter();
		
		if(user == null) {
			
			request.setAttribute("messages","Đăng nhập thất bại");	
			response.sendRedirect(request.getContextPath()+"/login");
			
		}else {
			
	         Cookie cookieUserName = new Cookie("userName", username);
	         cookieUserName.setMaxAge(10 * 60 );
	         response.addCookie(cookieUserName);
	         response.sendRedirect(request.getContextPath()+"/home");
		}
		
	}

}
