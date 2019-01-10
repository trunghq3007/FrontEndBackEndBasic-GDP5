package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Constant;

@WebServlet("/logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute(Constant.Account.SAVE_ACCOUNT_INTO_SESSION, null);
		Cookie cookie = new Cookie(Constant.Account.SAVE_ACCOUNT_INTO_COOKIES, "");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/home.jsp");
		dispatcher.forward(request, response);
	}
}
