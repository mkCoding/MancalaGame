package com.mike.kalah;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet
 */

public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("player").equals("player1")){
			//keep track of player Store
			//keep track of player pots
			//keep track of extra move of player
			//keep track of player turn
		}else if(request.getParameter("player").equals("player2")){
			
		}
	
//		request.getSession().setAttribute("radiovalue",request.getParameter("select"));
		
		HttpSession session = request.getSession();  
        session.setAttribute("savedPotNumber", request.getParameter("player1Pot01"));
        

		
		RequestDispatcher rd = request.getRequestDispatcher("anotherPage.jsp");
		rd.forward(request, response);
		
		System.out.println(request.getParameter("player1Kalah"));
		System.out.println(request.getParameter("player1Pot01")); //print current pot number after click submittal
		System.out.println(request.getParameter("player")); //prints the player selected
		
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
