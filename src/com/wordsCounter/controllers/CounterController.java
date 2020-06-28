package com.wordsCounter.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wordsCounter.services.CounterService;

@SuppressWarnings("serial")
public class CounterController extends HttpServlet {
	
	private CounterService cs;
	
	public void init(ServletConfig config) {
		this.cs = new CounterService();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String text = request.getParameter("text");
		String filter = request.getParameter("filter");
		String lang = request.getParameter("lang");
		System.out.println(lang);
		PrintWriter writer =  response.getWriter();
		int numberC = this.cs.numberOfCharacters(text);
		long numberW = this.cs.numberOfWords(text,filter,lang);
		writer.write(Integer.toString(numberC)+" "+Long.toString(numberW));
	}

}
