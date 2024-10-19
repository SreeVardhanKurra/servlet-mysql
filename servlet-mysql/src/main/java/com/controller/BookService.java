package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BookManager;


@WebServlet("/BookService")
public class BookService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BookManager BM = new BookManager();
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		
	
		 try {
			 
			 pw.print(BM.getDetails());
		 }
		 catch (Exception e) {

              pw.print(e.getMessage());
			 
			 
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
