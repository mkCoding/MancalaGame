package com.mike.kalah;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyServlet extends HttpServlet {

	public KalahBoard kb;
	public Player player1;
	public Player player2;
	
	public MyServlet(){
		super();
		kb = new KalahBoard();
		player1 = new Player();
		player2 = new Player();
	}
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 *keep track of player Store
		 *keep track of player pots
		 *keep track of extra move of player
		 *keep track of player turn
		*/
		
		if(request.getParameter("player").equals("player1")){
			player1.getKalahStoneCount();
		}else if(request.getParameter("player").equals("player2")){
			player2.getKalahStoneCount();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
		System.out.println(request.getParameter("player1Kalah"));
		System.out.println(request.getParameter("player1Pot01")); //print current pot number after click submittal
		System.out.println(request.getParameter("player")); //prints the player selected
		
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
