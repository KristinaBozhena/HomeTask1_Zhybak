package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/authorization" })
public class HomeTask1_Zhybak extends HttpServlet {
	public String form;
	public String namaOfUser = "kristina";
	public String passwordOfUser = "IRA2016";
	
	{
		form = "<form method = \"post\">"
				+ "Sing in: "
				+ "<p><label>Usename<input type = \"text\" name = \"user\"></p>"
				+ "<p><label>Password<input type = \"password\"  name = \"password\"></p>"
				+ "<input type = \"submit\">"+"</form>";
				
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		resp.getWriter().println(form);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		String responce = "You data are correct.";
		String user = req.getParameter("user");
		String password = req.getParameter("password");
		String letter = "Congratulation!!! You must know that life is beautiful :)";
		if(user.equals(namaOfUser)&&password.equals(passwordOfUser)){
			
		}
		else{
			responce = "You data are wrong. Please try again!";
			letter = " ";
		}
		resp.getWriter().println(responce);
		resp.getWriter().println(letter);
		
	}
	}