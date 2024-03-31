package com.springframwork.LooslyCouple.Game;

public class GameRunner {
	GameInter gameInter;
public GameRunner(GameInter gameInter) {
	this.gameInter=gameInter;
		
	}
	
public void run() {
	System.out.println("Game running");
	this.gameInter.down();
	this.gameInter.top();
	this.gameInter.left();
	this.gameInter.right();
}
}
