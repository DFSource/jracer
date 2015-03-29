/*
 * JRacer is a clone of a popular game, TRON LightCycles.
 * Full tutorial on building this game available @ youtube.com/devfactor 
 * Learn More @ devfactor.io
 */

package view;

// import model.Board;

/**
 * JRacerMain will be responsible for only one thing: Getting this whole game
 * loop started.
 * 
 * @author DevFactor
 * @version 03/16/2015
 */
public class JRacerMain {
	/** Just for testing. */
	// private static Board myBoard;
	/** For production. */
	private static GameBoard myGameBoard;

	public static void main(String[] args) {
		// myBoard represents the game BACK END / LOGIC
		// myBoard = new Board();
		// System.out.println(myBoard);

		// myGameBoard represents the game FRONT END / GUI
		myGameBoard = new GameBoard();
		myGameBoard.start();

	}

}
