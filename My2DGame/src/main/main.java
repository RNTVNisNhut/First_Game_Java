package main;

import javax.swing.JFrame;

public class main {
	public static void main(String[] args) {
		JFrame window = new JFrame();
		
		// set lest the window properly close when user clicks the close "x" ;
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("2D Adventure");
		
		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);
		
		window.pack();
		
		// the window will be displayed at the center of the screen
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
	}
}
