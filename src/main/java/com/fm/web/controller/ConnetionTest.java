package com.fm.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class ConnetionTest
 */
@WebServlet("/ConnetionTest")
public class ConnetionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConnetionTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// setup connection variables
			String user = "fmuser";
			String pass = "fmpassword";
			
			String jdbcUrl = "jdbc:mysql://localhost:3306/fm_life?useSSL=false";
			String driver = "com.mysql.cj.jdbc.Driver";
			
			// get connection to database
			try {
				PrintWriter out = response.getWriter();
				
				out.println("Connecting to database: " + jdbcUrl);
				
				Class.forName(driver);
				
				Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
				
				out.println("SUCCESS!!!");
				
				myConn.close();
				
			} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
