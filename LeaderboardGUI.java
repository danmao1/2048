import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LeaderboardGUI {
    
    JFrame frame;
    JPanel mainPanel;

    JLabel title;

    int width = 125;
    int height = 58;
    int xCoord = 121;
    int yCoord = 228;

    JLabel bestRect;
    JLabel secondRect;
    JLabel thirdRect;
    JLabel fourthRect;
    JLabel fifthRect;

    JLabel best;
    JLabel second;
    JLabel third;
    JLabel fourth;
    JLabel fifth;

    public LeaderboardGUI(){
        frame = new JFrame("2048 Leaderboard");
        frame.setPreferredSize(new Dimension(500, 640));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(new Color(250, 248, 239));

        mainPanel.setBounds(0, 0, 500, 640);
        frame.add(mainPanel);

        ImageIcon first = new ImageIcon("Images/first.png");
        Image temp1 = first.getImage() ;  
        Image newimg1 = temp1.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);  
        ImageIcon firstScaled = new ImageIcon(newimg1);
        bestRect = new JLabel(firstScaled);
        bestRect.setBounds(xCoord, yCoord, width, height);
        mainPanel.add(bestRect);

        ImageIcon second = new ImageIcon("Images/second.png");
        Image temp2 = second.getImage() ;  
        Image newimg2 = temp2.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);  
        ImageIcon secondScaled = new ImageIcon(newimg2);
        secondRect = new JLabel(secondScaled);
        secondRect.setBounds(xCoord, yCoord + 74, width, height);
        mainPanel.add(secondRect);

        ImageIcon third = new ImageIcon("Images/third.png");
        Image temp3 = third.getImage() ;  
        Image newimg3 = temp3.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);  
        ImageIcon thirdScaled = new ImageIcon(newimg3);
        thirdRect = new JLabel(thirdScaled);
        thirdRect.setBounds(xCoord, yCoord + 74 * 2, width, height);
        mainPanel.add(thirdRect);

        ImageIcon fourth = new ImageIcon("Images/fourth.png");
        Image temp4 = fourth.getImage() ;  
        Image newimg4 = temp4.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);  
        ImageIcon fourthScaled = new ImageIcon(newimg4);
        fourthRect = new JLabel(fourthScaled);
        fourthRect.setBounds(xCoord, yCoord + 74 * 3, width, height);
        mainPanel.add(fourthRect);

        ImageIcon fifth = new ImageIcon("Images/fifth.png");
        Image temp5 = fifth.getImage() ;  
        Image newimg5 = temp5.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);  
        ImageIcon fifthScaled = new ImageIcon(newimg5);
        fifthRect = new JLabel(fifthScaled);
        fifthRect.setBounds(xCoord, yCoord + 74 * 4, width, height);
        mainPanel.add(fifthRect);

        best = new JLabel("2048");
        best.setFon        
    }
}
