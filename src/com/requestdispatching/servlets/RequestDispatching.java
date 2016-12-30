package com.requestdispatching.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RequestDispatching")
public class RequestDispatching extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RequestDispatching() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname = request.getParameter("txtuname");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ResponseDispatching");
		dispatcher.forward(request, response);
	}

}
