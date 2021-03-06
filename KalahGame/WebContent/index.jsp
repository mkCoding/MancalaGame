<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mancala Game</title>
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="playerStyle.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>
<body  onload =  "if (location.search.length < 1){ document.getElementById('form').submit()}">
	<h1>Mancala Game</h1>

	<p class="one"></p>
	<hr size="10" noshade>
	<div>
		<div class="vertical-line-left" />
		<div class="vertical-line-right" />
		<div class="vertical-line-one" />
		<div class="vertical-line-two" />
		<div class="vertical-line-three" />
		<div class="vertical-line-four" />
		<div class="vertical-line-five" />
	</div>
	
	<label id="player1Kalah">0</label>
	<label id="player2Kalah">0</label>
	
	
	
	<!-- Labels for each pot Player 1-->
	<label id="player1Pot01" class="player1">${myAttr1}</label>
	<label id="player1Pot02" class="player1">${myAttr2}</label>
	<label id="player1Pot03" class="player1">${myAttr3}</label>
	<label id="player1Pot04" class="player1">${myAttr4}</label>
	<label id="player1Pot05" class="player1">${myAttr5}</label>
	<label id="player1Pot06" class="player1">${myAttr6}</label>
	
	
	<!-- Labels for each pot Player 1-->
	<label id="player2Pot01" class="player2">6</label>
	<label id="player2Pot02" class="player2">6</label>
	<label id="player2Pot03" class="player2">6</label>
	<label id="player2Pot04" class="player2">6</label>
	<label id="player2Pot05" class="player2">6</label>
	<label id="player2Pot06" class="player2">6</label>
	
	
	
	
	<form action="MyServlet" id="form" method="get">

		<!-- Player 1 submittal of Pots and current Kalah/Store -->

		<input type="hidden" class="player1KalahSubmit" name="player1Kalah" value="0"/>
		<input type="hidden" id="number1" class="player1Pot01" name="player1Pot01" value="6"/>
		<input type="hidden" id="number2" class="player1Pot02" name="player1Pot02" value="6"/>
		<input type="hidden" id="number3" class="player1Pot03" name="player1Pot03" value="6"/>
		<input type="hidden" id="number4" class="player1Pot04" name="player1Pot04" value="6"/>
		<input type="hidden" id="number5" class="player1Pot05" name="player1Pot05" value="6"/>
		<input type="hidden" id="number6" class="player1Pot06" name="player1Pot06" value="6"/>
	
		<input class="p1" type="radio" name="player" id="p1Radio" value="player1"> Player 1<br>
		<input class="p2" type="radio" name="player" id="p2Radio" value="player2"> Player 2<br>
		<input type="submit" id="mySubmit" value="Submit">
	</form>
	



	<script type="text/javascript">
	
	
	$("#p1Radio").prop("checked", true)
	
	$(document).ready(function(){
		
		
	/*the below radio button methods will allow switching 
	 *between Player 1 and Player 2
	*/
	$("form > input.p1").click(function() {
		 
		// Player 1 - This will allow the user to only select pots with stones count > 0
		$(".player1").hover(function() {
			
			if(($('.player1').text()!="0") && (document.getElementById('p1Radio').checked) && !(document.getElementById('p2Radio').checked))
				{
					  $(this).css({ 'cursor': 'pointer' });
				}else{
					 $(this).css({ 'cursor': 'default' });
				}
				
		});
	
		});
	
	$("form > input.p2").click(function() {
		// Player 2 - This will allow the user to only select pots with stones count > 0
		$(".player2").hover(function() {
			
			if(($('.player2').text()!="0") && (document.getElementById('p2Radio').checked) && !(document.getElementById('p1Radio').checked))
				{
					  $(this).css({ 'cursor': 'pointer' });
				}else{
					$(this).css({ 'cursor': 'default' });
				}
		});
		});
	

	
	//only grab labels related to player 1
	var labels = document.getElementsByClassName('player1');
	var hiddenIndex = document.getElementsByTagName('input');
	
	for(var i = 0;i < labels.length; i++){
		labels[i].addEventListener("click",function(){
			
			var currentPotValCounter = parseInt($(this).text());
			// currentPotValCounter++; //<----increment every pot for player 1
			$(this).text(0);
			
			//if id of label == name attribute of input
			var labelId = $(this).attr('id');
			//var inputId = $('.player1Submit01').attr('id');
			var inputId = $("."+labelId).attr('id');
			
			$('#' + inputId).val(0);
			
		
			// var id = $(this).attr('id');
			//alert(id +" --> " + currentPotValCounter);
			
		});
	}
	
	
	/*$(".player1").click(function() {
			var currentPotValCounter = parseInt($(this).text());
			currentPotValCounter++;
			$(this).text(currentPotValCounter);	  
			$('#number1').val(currentPotValCounter);
	});*/
	

		 $(".player2").click(function() {
				var currentPotValCounter = parseInt($(this).text());
				currentPotValCounter++;
				$(this).text(currentPotValCounter);	 
		});
	
	
	
	
	
	});
	
	
	
	
	</script>
</body>
</html>