/*
 * JRacer is a clone of a popular game, TRON LightCycles.
 * Full tutorial on building this game available @ youtube.com/devfactor 
 * Learn More @ devfactor.io
 */

package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

/**
 * The inner panel for displaying game objects.
 * 
 * @author DevFactor
 * @version 03/20/2015
 */
@SuppressWarnings("serial")
public class GamePanel extends JPanel {
	private static final int DEFAULT_WIDTH = 800;
	private static final int DEFAULT_HEIGHT = 600;
	
	public GamePanel() {
		super(); // good practice
		// dimension is comprised of an X and a Y coordinate (its a box).
		this.setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
		this.setVisible(true);
		this.setBackground(Color.BLACK); // black for testing, white for live.	
	}

}
