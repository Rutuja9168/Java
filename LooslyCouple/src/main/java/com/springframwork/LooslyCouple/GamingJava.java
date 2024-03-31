package com.springframwork.LooslyCouple;

import com.springframwork.LooslyCouple.Game.GameRunner;
import com.springframwork.LooslyCouple.Game.Mario;
import com.springframwork.LooslyCouple.Game.Pavman;
import com.springframwork.LooslyCouple.Game.SuperContra;

public class GamingJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var mario=new Mario();
		var superContra=new SuperContra();
		var pacman=new Pavman();
        var gameRunner=new GameRunner(pacman );
        gameRunner.run();
	}

}
