/*
 * JRacer is a clone of a popular game, TRON LightCycles.
 * Full tutorial on building this game available @ youtube.com/devfactor 
 * Learn More @ devfactor.io
 */

package model;

import java.awt.Color;



/**
 * The Board Class is responsible for doing the bulk of the back-end work. 
 * It does not display any data, but represents the game board and current game objects.
 * 
 * @author DevFactor
 * @version 03/16/2015
 */
public class Board {
	/**
	 * We need to store a representation of the data.
	 * A 2D Array or ArrayList should do the trick.
	 */
	private char[][] myBoardData = new char[20][20];
	
	/**
	 * We also need a JRacer object representing the current player.
	 */
	private JRacer myHuman;
	
	
	/**
	 * Instantiate a new board object.
	 */
	public Board() {
		myHuman = new JRacer(Color.RED); // placeholder color
	}
	
	
	/**
	 * Return a string representation of the game for debugging.
	 */
	public String toString() {
		StringBuilder str = new StringBuilder();
		char[][] tempBoard = getBoardData();
		for (int i = 0; i < tempBoard.length; i++){
			for (int o = 0; o < tempBoard[i].length; o++) {
			str.append(tempBoard[i][o]);
			}
			str.append("\n");
		}
		
		return str.toString();
	}
	
	
	public char[][] getBoardData() {
		int x = myHuman.getMyX();
		int y = myHuman.getMyY();
		
		for (int i = 0; i < myBoardData.length; i++){
			for (int o = 0; o < myBoardData[i].length; o++) {
				if (x == o && y == i) {
					myBoardData[i][o] = 'h'; // human
				} else {
					myBoardData[i][o] = 'b'; // blank
				}
//				System.out.print(myBoardData[i][o]);
			}
//			System.out.println();
		}
		
		return myBoardData;
		
		
	}
	


}
