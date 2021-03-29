import java.awt.Dimension;
import java.awt.*;
import java.awt.Color;



public class GameFrame extends JFrame{
	private JPanel panel;
	public GameFrame() {
		super.("2048");
		panel= new JPanel();
		panel.setBackground(Color.LIGHT_GREY);
		this.add(panel);
	}
	public static void main (String[] args) {
		GameFrame frame=new GameFrame();   
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
		mainFrame.setVisible(true);
		
		
		
	}
}

