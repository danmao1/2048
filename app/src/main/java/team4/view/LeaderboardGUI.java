package view;
import model.*;
import controller.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class LeaderboardGUI {
    
    public JFrame frame;
    JPanel mainPanel;

    JLabel title;

    int width = 180;
    int height = 58;
    int xCoord = 160;
    int yCoord = 190;
    
	JButton back;
	
    JLabel bestRect;
    JLabel secondRect;
    JLabel thirdRect;
    JLabel fourthRect;
    JLabel fifthRect;
	JLabel backRect;

    JLabel best;
    JLabel secondScore;
    JLabel thirdScore;
    JLabel fourthScore;
    JLabel fifthScore;
    
    
    

    public LeaderboardGUI(){
        frame = new JFrame("2048 Leaderboard");
        frame.setPreferredSize(new Dimension(500, 640));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(new Color(250, 248, 239));

        mainPanel.setBounds(0, 0, 500, 640);
        frame.add(mainPanel);
        
        
        
        URL backPNG = this.getClass().getClassLoader().getResource("Back.png");
        
        ImageIcon backImage = new ImageIcon(backPNG);
        Image tempBack = backImage.getImage() ;  
        Image newimgBack = tempBack.getScaledInstance(width -100, height-5, java.awt.Image.SCALE_SMOOTH);  
        ImageIcon backScaled = new ImageIcon(newimgBack);
        
        
        back = new JButton(backScaled);
        back.setBounds(xCoord - 140, yCoord-180, width-110 , height);
        mainPanel.add(back);

        
        
        title = new JLabel("LEADERBOARD");
        title.setFont(new Font("Sans Serif", Font.PLAIN, 50));
        title.setForeground(Color.BLACK);
        title.setBounds(xCoord -85 , (yCoord) -110, width+250, height);
        mainPanel.add(title);
        
        best = new JLabel("2048");
        best.setFont(new Font("Sans Serif", Font.PLAIN, 23));
        best.setForeground(Color.BLACK);
        best.setBounds(xCoord + 65, (yCoord), width, height);
        mainPanel.add(best);
        
        secondScore= new JLabel("2000");
        secondScore.setFont(new Font("Sans Serif", Font.PLAIN, 23));
        secondScore.setForeground(Color.BLACK);
        secondScore.setBounds(xCoord + 65, (yCoord)+74, width, height);
        mainPanel.add(secondScore);
        
        thirdScore = new JLabel("1500");
        thirdScore.setFont(new Font("Sans Serif", Font.PLAIN, 23));
        thirdScore.setForeground(Color.BLACK);
        thirdScore.setBounds(xCoord + 65, (yCoord)+74 * 2, width, height);
        mainPanel.add(thirdScore);
        
        fourthScore = new JLabel("900");
        fourthScore.setFont(new Font("Sans Serif", Font.PLAIN, 23));
        fourthScore.setForeground(Color.BLACK);
        fourthScore.setBounds(xCoord + 65, (yCoord)+74 * 3, width, height);
        mainPanel.add(fourthScore);
        
        fifthScore = new JLabel("900");
        fifthScore.setFont(new Font("Sans Serif", Font.PLAIN, 23));
        fifthScore.setForeground(Color.BLACK);
        fifthScore.setBounds(xCoord + 65, (yCoord)+74 * 4, width, height);
        mainPanel.add(fifthScore);

		URL firstPNG = this.getClass().getClassLoader().getResource("first.png");
        
       
        ImageIcon first = new ImageIcon(firstPNG);
        Image temp1 = first.getImage() ;  
        Image newimg1 = temp1.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);  
        ImageIcon firstScaled = new ImageIcon(newimg1);
        bestRect = new JLabel(firstScaled);
        bestRect.setBounds(xCoord, yCoord, width, height);
        mainPanel.add(bestRect);

        URL secondPNG = this.getClass().getClassLoader().getResource("second.png");

        ImageIcon second = new ImageIcon(secondPNG);
        Image temp2 = second.getImage() ;  
        Image newimg2 = temp2.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);  
        ImageIcon secondScaled = new ImageIcon(newimg2);
        secondRect = new JLabel(secondScaled);
        secondRect.setBounds(xCoord, yCoord + 74, width, height);
        mainPanel.add(secondRect);

        URL thirdPNG = this.getClass().getClassLoader().getResource("third.png");

        ImageIcon third = new ImageIcon(thirdPNG);
        Image temp3 = third.getImage() ;  
        Image newimg3 = temp3.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);  
        ImageIcon thirdScaled = new ImageIcon(newimg3);
        thirdRect = new JLabel(thirdScaled);
        thirdRect.setBounds(xCoord, yCoord + 74 * 2, width, height);
        mainPanel.add(thirdRect);

        URL fourthPNG = this.getClass().getClassLoader().getResource("forth.png");
        ImageIcon fourth = new ImageIcon(fourthPNG);
        Image temp4 = fourth.getImage() ;  
        Image newimg4 = temp4.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);  
        ImageIcon fourthScaled = new ImageIcon(newimg4);
        fourthRect = new JLabel(fourthScaled);
        fourthRect.setBounds(xCoord, yCoord + 74 * 3, width, height);
        mainPanel.add(fourthRect);

        URL fifthPNG = this.getClass().getClassLoader().getResource("fifth.png");
        ImageIcon fifth = new ImageIcon(fifthPNG);
        Image temp5 = fifth.getImage() ;  
        Image newimg5 = temp5.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);  
        ImageIcon fifthScaled = new ImageIcon(newimg5);
        fifthRect = new JLabel(fifthScaled);
        fifthRect.setBounds(xCoord, yCoord + 74 * 4, width, height);
        mainPanel.add(fifthRect);
        
        frame.pack();
    }
<<<<<<< HEAD
      
=======

    public void addBackListener(ActionListener l){
        back.addActionListener(l);
    }
>>>>>>> 03b56881ef5b9a96bafa6bd9218059797cb1bd2a

}
