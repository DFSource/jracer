/*
 * JRacer is a clone of a popular game, TRON LightCycles.
 * Full tutorial on building this game available @ youtube.com/devfactor 
 * Learn More @ devfactor.io
 */

package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

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
	private int myTimerDelay;
	private final Timer myTimer;

	public GamePanel() {
		super(); // good practice
		// dimension is comprised of an X and a Y coordinate (its a box).
		this.setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
		this.setVisible(true);
		this.setBackground(Color.BLACK); // black for testing, white for live.
		myTimerDelay = 1000; // for now. this is 1 second.
		myTimer = new Timer(myTimerDelay, gameTimer);
		myTimer.start(); // starts the timer.
		// restart restarts, stop stops.
	}
	
	public void paintComponent(Graphics g) {
	    // Let UI Delegate paint first, which 
	    // includes background filling since 
	    // this component is opaque.

	    super.paintComponent(g);    
	    g.setColor(Color.RED);
	    g.drawRect(10, 10, 10, 10);
	}  
	
	public void redraw() {
		this.repaint();
		System.out.println("Screen has been redrawn");
	}

	ActionListener gameTimer = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent theEvent) {
			redraw();
		}
	};

}
