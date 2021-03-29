import java.awt.Dimension;
import java.awt.*;
import java.awt.Color;
import javax.swing.*;



public class GameFrame extends JFrame{
	private JPanel panel;
	private JPanel panelGame;
	private JButton newGame;
	public GameFrame() {
		super("2048");
		panel= new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		this.add(panel);
		
		panelGame= new JPanel();
		panel.add(panelGame);
		panelGame.setPreferredSize(new Dimension (400,400));
		newGame= new JButton("New Game");
		panelGame.add(newGame);
	}
	public static void main (String[] args) {
		GameFrame frame=new GameFrame();   
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
		frame.setVisible(true);
		
		
		
		
		
	}
}

