
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;



public class GameBoard extends JPanel{
	
    public void paint(Graphics g) {
		
		for (int i=100; i<500;i++){
			
			for (int j=100; j<500;j+=500/4){
				int miniSquare=500/4;
				
				
				g.fillRect(i, j, miniSquare, miniSquare);
				g.setColor(Color.WHITE);
				

				
			}
		}
	}


	public static void main (String[] args) {
		
		int frameSize = 800;
	    

        
		JFrame mainFrame = new JFrame("2048");
        mainFrame.setSize(frameSize, frameSize);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setBackground(Color.LIGHT_GRAY);
		mainFrame.getContentPane().add(new GameBoard());
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	
	}
	
}

