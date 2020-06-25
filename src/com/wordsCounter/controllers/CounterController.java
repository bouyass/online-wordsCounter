package com.wordsCounter.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class CounterController extends HttpServlet{


	public void doGet(HttpServletResponse response, HttpServletRequest request) throws IOException {
	
		String text = request.getParameter("text");
		System.out.println(text);
		System.out.println("lyes");
        response.getWriter().write(text);
        		
	}
	
}
