package com.wordsCounter.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wordsCounter.services.CounterService;

public class CounterController extends HttpServlet {
	
	private CounterService cs;
	
	public void init(ServletConfig config) {
		this.cs = new CounterService();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String text = request.getParameter("text");
		String filter = request.getParameter("filter");
		System.out.println(filter);
		PrintWriter writer =  response.getWriter();
		int numberC = this.cs.numberOfCharacters(text);
		int numberW = this.cs.numberOfWords(text,filter);
		writer.write(Integer.toString(numberC)+" "+Integer.toString(numberW));
	}

}
