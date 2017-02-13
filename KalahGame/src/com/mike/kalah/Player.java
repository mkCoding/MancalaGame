package com.mike.kalah;

import java.util.ArrayList;

public class Player {
	public int kalahStoneCount;
	//6Pots per player
	
	public Player(){
		kalahStoneCount = 0;
	}
	
	/*
	 * every place the player could potentially drop a stone is sored in playerArr.
	 * if the player select a pot, the pot position will be recorded.
	 * the position selected will match up with the position of the array.
	 * 
	 * the selected position the user has chosen will be set to 0 while at the same
	 * time other elements in the array are incremented by 1 
	 */
	public void moveStones(ArrayList<Integer> playerArr, int selectedPot){
		
	}
	public void chooseAPot(int potToChoose){
		
	}

	public int getKalahStoneCount() {
		return kalahStoneCount;
	}

	public void setKalahStoneCount(int kalahStoneCount) {
		this.kalahStoneCount = kalahStoneCount;
	}

}
