package com.requestdispatching.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ResponseDispatching")
public class ResponseDispatching extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ResponseDispatching() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String myuname = request.getParameter("txtuname");
		PrintWriter out = response.getWriter();
		out.print("<p style='color:red;'><b>You have entered incorrect password<b></p>");


	}

}
