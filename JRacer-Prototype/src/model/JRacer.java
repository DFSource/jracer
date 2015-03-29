/*
 * JRacer is a clone of a popular game, TRON LightCycles.
 * Full tutorial on building this game available @ youtube.com/devfactor 
 * Learn More @ devfactor.io
 */

package model;

import java.awt.Color;
import java.awt.Point;
import java.util.List;

/**
 * JRacer is a game object representing a "light cycle".
 * 
 * @author DevFactor
 * @version 03/16/2015
 */
public class JRacer {
	/** JRacer current x coordinate. */
	private int myX;
	/** JRacer current y coordinate. */
	private int myY;
	// we may also want a direction in the future so we know how to
	// draw the game sprite (we won't start with sprites though)
	// instead start with generic object (no directions)
	private Color myColor;
	// JRacers also leave a 'trail'
	/** The trail. Note that Java's built in point is mutable. */
	private List<Point> myTrail;

	/**
	 * Build a new JRacer object. JRacer represents a light cycle on the game
	 * board.
	 * 
	 * @param theColor the color of this JRacer.
	 */
	public JRacer(final Color theColor) {
		// set up starting coordinates for the human player.
		myX = 10;
		myY = 10;
		myColor = theColor;
	}

	// each time we change the coordinates, we must add the previous coordinates
	// to the 'trail'

	public int getMyX() {
		return myX;
	}

	/**
	 * Set new x coordinate.
	 * 
	 * @param myX the new x coordinate.
	 */
	public void setMyX(int myX) {
		this.myX = myX;
		myTrail.add(new Point(myX, myY));
	}

	public int getMyY() {
		return myY;
	}

	/**
	 * Set new y coordinate.
	 * 
	 * @param myY the new y coordinate.
	 */
	public void setMyY(int myY) {
		this.myY = myY;
		myTrail.add(new Point(myX, myY));
	}

	public Color getMyColor() {
		return myColor;
	}

	public void setMyColor(Color myColor) {
		this.myColor = myColor;
	}

}
