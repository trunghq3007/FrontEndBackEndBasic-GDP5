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
import javax.servlet.http.HttpSession;

import dao.Constant;
import service.AccountDAOImpl;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/login.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String remember = request.getParameter("remember");
		if (AccountDAOImpl.getInstance().validateAccount(username, password)) {
			HttpSession session = request.getSession();
			session.setAttribute(Constant.Account.SAVE_ACCOUNT_INTO_SESSION, username);
			if ("1".equals(remember)) {
				Cookie cookie = new Cookie(Constant.Account.SAVE_ACCOUNT_INTO_COOKIES, username);
				cookie.setMaxAge(24 * 60 * 60);
				response.addCookie(cookie);
			}
			response.sendRedirect(request.getContextPath() + "/home");
		} else {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter writer = response.getWriter();
			writer.print(Constant.Account.LOGIN_FAIL);
		}

	}

}
