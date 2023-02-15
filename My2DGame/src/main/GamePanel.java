package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;


// This is a subclass of JPanel so bassically this is a Jpanel class with a bit more extra functions 
public class GamePanel extends JPanel implements Runnable{
	
	// SCREEN SETTINGS
	
	// 16x16 tile ( 1 character and map tiles in this game )
	// is kind of a standard size for many 2d Game, and many character
	final int originalTileSize = 16;
	
	// realy is scale up scale number ( here is 48 )
	final int scale = 3;
	
	final int tileSize = originalTileSize * scale;
	final int maxScreenCol = 16;
	final int maxScreenRow = 12;
	final int screenWidth = tileSize * maxScreenCol; // 768 pixels
	final int screenHeight = tileSize * maxScreenRow; // 576 pixels
	
	// Thread started, it keeps your program running until you stop it
	// NEED IMPLEMENT Runnable
	Thread gameThread;
	
	public GamePanel() {
		// Set the side of this class ( JPanel )
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		
		// All of drawing from this component will be done in an offscreen painting buffer
		this.setDoubleBuffered(true);
	}

	public void startGameTheread() {
		
		// Passing GamePanel class to this thread's constructor, that's how you instantiate a thread
		gameThread = new Thread(this);
	}
	
	// NEED went implement Runnable, it use to create a Theread
	// So basically when start gameThread it automatically calls this run method
	@Override
	public void run() {
		
	}
	
	
}