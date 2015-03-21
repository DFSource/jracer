/*
 * JRacer is a clone of a popular game, TRON LightCycles.
 * Full tutorial on building this game available @ youtube.com/devfactor 
 * Learn More @ devfactor.io
 */

package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * The GameBoard is responsible for managing the GUI.
 * 
 * @author DevFactor
 * @version 03/20/2015
 */
@SuppressWarnings("serial")
public class GameBoard extends JFrame{
	/** Draws the shapes. */
	private GamePanel myGamePanel;
	
	public GameBoard() {
		super("JRacer - www.devfactor.io");
		myGamePanel = new GamePanel();
		start();
	}
	
	public void start() {
		setVisible(true);
		buildGUI();
	}
	
	private void buildGUI() {
		//JPanel masterPanel = new JPanel();
		//masterPanel.add(myGamePanel);
		// leave master panel out for a while.
		//add(masterPanel);
		
		add(myGamePanel);
		pack(); // pack "resizes" the panel so things fit in it.
	}

}
