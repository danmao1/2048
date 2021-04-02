import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mainScreenGUI {
    Board board;

    JFrame frame;
    JPanel mainPanel;
    JPanel menuPanel; 
    JLabel logoLabel;
    JLabel scoreImageLabel;
    JLabel scoreLabel;
    JLabel bestScoreImageLabel;
    JLabel bestScoreLabel;
    JButton newGameButton;
    JButton leaderboardButton;

    public mainScreenGUI(Board board){
        this.board = board;

        frame = new JFrame("2048");
        frame.setPreferredSize(new Dimension(500, 640));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.white);

        menuPanel = new JPanel();
        menuPanel.setLayout(null);
        menuPanel.setBackground(Color.white);

        
        ImageIcon newGame = new ImageIcon("Images/NewGame.png");
        Image temp1 = newGame.getImage() ;  
        Image newimg1 = temp1.getScaledInstance(108, 36, java.awt.Image.SCALE_SMOOTH);  
        newGame = new ImageIcon(newimg1);
        newGameButton = new JButton(newGame);
        newGameButton.setBounds(250, 132, 108, 36);
        
        ImageIcon leaderboard = new ImageIcon("Images/Leaderboard.png");
        Image temp2 = leaderboard.getImage() ;  
        Image newimg2 = temp2.getScaledInstance(108, 36, java.awt.Image.SCALE_SMOOTH);  
        leaderboard = new ImageIcon(newimg2);
        leaderboardButton = new JButton(leaderboard);
        leaderboardButton.setBounds(375, 132, 108, 36);

        ImageIcon logo = new ImageIcon("Images/LogoIcon.png");
        Image temp3 = logo.getImage() ;  
        Image newimg3 = temp3.getScaledInstance(142, 142, java.awt.Image.SCALE_SMOOTH);
        ImageIcon logoScaled = new ImageIcon(newimg3);
        logoLabel = new JLabel(logoScaled);
        logoLabel.setBounds(18, 18, 142, 142);
        menuPanel.add(logoLabel);
        

        ImageIcon scoreIcon = new ImageIcon("Images/ScoreIcon.png");
        Image temp4 = scoreIcon.getImage() ;  
        Image newimg4 = temp4.getScaledInstance(108, 108, java.awt.Image.SCALE_SMOOTH);
        ImageIcon scoreScaled = new ImageIcon(newimg4);
        scoreImageLabel = new JLabel(scoreScaled);
        scoreImageLabel.setBounds(250, 18, 108, 108);
        menuPanel.add(scoreImageLabel);

        ImageIcon bestScoreIcon = new ImageIcon("Images/BestIcon.png");
        Image temp5 = bestScoreIcon.getImage();
        Image newimg5 = temp5.getScaledInstance(108, 108, java.awt.Image.SCALE_SMOOTH);
        ImageIcon bestScaled = new ImageIcon(newimg5);
        bestScoreImageLabel = new JLabel(bestScaled);
        bestScoreImageLabel.setBounds(375, 18, 108, 108);
        menuPanel.add(bestScoreImageLabel);


        menuPanel.add(newGameButton);
        menuPanel.add(leaderboardButton);

        menuPanel.setBounds(0, 0, 500, 208);
        mainPanel.add(menuPanel);

        board.setBounds(53, 208, 392, 392);
        mainPanel.add(board);

        frame.add(mainPanel);

        frame.pack();
        frame.setVisible(true);
    }

    public void addNewGameListener(ActionListener l){
        newGameButton.addActionListener(l);
    }

    public void addLeaderboardListener(ActionListener l){
        leaderboardButton.addActionListener(l);
    }
}
