package view;

import model.*;
import controller.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;


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
    JLabel goalBanner;
    JButton newGameButton;
    JButton leaderboardButton;

    public mainScreenGUI(Board board){
        this.board = board;

        frame = new JFrame("2048");
        frame.setPreferredSize(new Dimension(500, 640));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(new Color(250, 248, 239));

        menuPanel = new JPanel();
        menuPanel.setLayout(null);
        menuPanel.setBackground(new Color(250, 248, 239));

		URL newPNG = this.getClass().getClassLoader().getResource("NewGame.png");
        
        ImageIcon newGame = new ImageIcon(newPNG);
        Image temp1 = newGame.getImage() ;  
        Image newimg1 = temp1.getScaledInstance(108, 36, java.awt.Image.SCALE_SMOOTH);  
        newGame = new ImageIcon(newimg1);
        newGameButton = new JButton(newGame);
        newGameButton.setBounds(250, 132, 108, 36);
        
        URL leaderboardPNG = this.getClass().getClassLoader().getResource("Leaderboard.png");
        ImageIcon leaderboard = new ImageIcon(leaderboardPNG);
        Image temp2 = leaderboard.getImage() ;  
        Image newimg2 = temp2.getScaledInstance(108, 36, java.awt.Image.SCALE_SMOOTH);  
        leaderboard = new ImageIcon(newimg2);
        leaderboardButton = new JButton(leaderboard);
        leaderboardButton.setBounds(375, 132, 108, 36);
        
        URL logoPNG = this.getClass().getClassLoader().getResource("LogoIcon.png");
        ImageIcon logo = new ImageIcon(logoPNG);
        Image temp3 = logo.getImage() ;  
        Image newimg3 = temp3.getScaledInstance(142, 142, java.awt.Image.SCALE_SMOOTH);
        ImageIcon logoScaled = new ImageIcon(newimg3);
        logoLabel = new JLabel(logoScaled);
        logoLabel.setBounds(18, 18, 142, 142);
        menuPanel.add(logoLabel);
        
        URL scorePNG = this.getClass().getClassLoader().getResource("ScoreIcon.png");
        ImageIcon scoreIcon = new ImageIcon(scorePNG);
        Image temp4 = scoreIcon.getImage() ;  
        Image newimg4 = temp4.getScaledInstance(108, 108, java.awt.Image.SCALE_SMOOTH);
        ImageIcon scoreScaled = new ImageIcon(newimg4);
        scoreImageLabel = new JLabel(scoreScaled);
        scoreImageLabel.setBounds(250, 18, 108, 108);
        menuPanel.add(scoreImageLabel);

        bestScoreLabel = new JLabel("20953");
        bestScoreLabel.setForeground(Color.white);
        bestScoreLabel.setBounds(415, 70, 100, 30);
        menuPanel.add(bestScoreLabel);
        
        URL bestScorePNG = this.getClass().getClassLoader().getResource("BestIcon.png");
        ImageIcon bestScoreIcon = new ImageIcon(bestScorePNG);
        Image temp5 = bestScoreIcon.getImage();
        Image newimg5 = temp5.getScaledInstance(108, 108, java.awt.Image.SCALE_SMOOTH);
        ImageIcon bestScaled = new ImageIcon(newimg5);
        bestScoreImageLabel = new JLabel(bestScaled);
        bestScoreImageLabel.setBounds(375, 18, 108, 108);
        menuPanel.add(bestScoreImageLabel);

        goalBanner = new JLabel("Join tiles together to get the 2048 tile!");
        goalBanner.setFont(new Font("Verdona", Font.BOLD, 18));
        goalBanner.setForeground(new Color(74, 72, 64));
        goalBanner.setBounds(53, 185, 400, 20);

        menuPanel.add(newGameButton);
        menuPanel.add(leaderboardButton);
        menuPanel.add(goalBanner);

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
