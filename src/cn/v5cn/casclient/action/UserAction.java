package cn.v5cn.casclient.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserAction extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6024846440502821711L;
	
	private static String casServerLogOutUrl = "";
	private static String redirectUrl = "";
	
	@Override
	public void init() throws ServletException {
		casServerLogOutUrl = this.getInitParameter("casServerLogOutUrl");
		redirectUrl = this.getInitParameter("redirectUrl");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect(casServerLogOutUrl + "?service=" + redirectUrl);
	}
}
