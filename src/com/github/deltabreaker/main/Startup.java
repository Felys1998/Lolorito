package com.github.deltabreaker.main;

import com.github.deltabreaker.gui.GUIMain;

public class Startup {

	public static void main(String[] args) {
		try {
			new Thread(new CommandManager(System.in)).start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if((args.length > 0 && !args[0].equals("-nogui")) || args.length == 0) {
			FileManager.loadCSVData(Startup.class.getClassLoader().getResourceAsStream("Item.txt"));
			new GUIMain();
		}
	}

}
