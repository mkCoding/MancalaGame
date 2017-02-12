package com.mike.kalah;

import java.util.ArrayList;

public class KalahBoard {
	
	/*
	 * these array list consist of the total number of kalah and pots objects in
	 * the game
	 */

	ArrayList<Kalah> kalahArr;
	ArrayList<Pots> potsArr;
	
	public KalahBoard(){
		kalahArr = new ArrayList<Kalah>();
		potsArr = new ArrayList<>();
		populateKalahArr();
		populatePotsArr();
	}

	
	public ArrayList<Kalah> getKalahArr() {
		return kalahArr;
	}

	public void setKalahArr(ArrayList<Kalah> kalahArr) {
		this.kalahArr = kalahArr;
	}

	public ArrayList<Pots> getPotsArr() {
		return potsArr;
	}

	public void setPotsArr(ArrayList<Pots> potsArr) {
		this.potsArr = potsArr;
	}

	public void populateKalahArr(){
		for(int i = 0; i < 2;i++){
			this.kalahArr.add(new Kalah());
		}
	}
	
	public void populatePotsArr(){
		for(int i = 0; i < 12;i++){
			this.potsArr.add(new Pots());
		}
	}
	

}
