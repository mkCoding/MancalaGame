package com.mike.kalah;

import java.io.IOException;
import java.util.ArrayList;

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
	ArrayList<Integer> player1Arr;
	ArrayList<Integer> player2Arr;
	
	public MyServlet(){
		super();
		kb = new KalahBoard();
		player1 = new Player();
		player2 = new Player();
		player1Arr = new ArrayList<Integer>();
		player2Arr = new ArrayList<Integer>();
	}
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		//after submit set player pot to new number after submit
		request.setAttribute("myAttr1", request.getParameter("player1Pot01"));
		request.setAttribute("myAttr2", request.getParameter("player1Pot02"));
		request.setAttribute("myAttr3", request.getParameter("player1Pot03"));
		request.setAttribute("myAttr4", request.getParameter("player1Pot04"));
		request.setAttribute("myAttr5", request.getParameter("player1Pot05"));
		request.setAttribute("myAttr6", request.getParameter("player1Pot06"));
		
				
		/*
		 *keep track of player Store
		 *keep track of player pots
		 *keep track of extra move of player
		 *keep track of player turn
		*/
		
		if(request.getParameter("player").equals("player1")){
			player1.getKalahStoneCount();
			player1Arr.clear();
//			for(int i = 1; i <= 6;i++){
//				player1Arr.add(Integer.parseInt(request.getAttribute("myAttr"+i).toString()));
//			}
			
			player1Arr.add(Integer.parseInt(request.getParameter("player1Pot01")));
			player1Arr.add(Integer.parseInt(request.getParameter("player1Pot02")));
			player1Arr.add(Integer.parseInt(request.getParameter("player1Pot03")));
			player1Arr.add(Integer.parseInt(request.getParameter("player1Pot04")));
			player1Arr.add(Integer.parseInt(request.getParameter("player1Pot05")));
			player1Arr.add(Integer.parseInt(request.getParameter("player1Pot06")));
			
			
			//player1.moveStones(player1Arr, selectedPot);
		}else if(request.getParameter("player").equals("player2")){
			player2.getKalahStoneCount();
		}
		
		
		
			
		//redirect to the same page after submit of a particular player
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
