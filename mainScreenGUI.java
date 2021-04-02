import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mainScreenGUI {
    Board board;

    JFrame frame;
    JPanel mainPanel;
    JPanel menuPanel;
    JButton newGameButton;
    JButton leaderboardButton;

    public mainScreenGUI(Board board){
        this.board = board;

        frame = new JFrame("2048");
        frame.setPreferredSize(new Dimension(500, 640));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        menuPanel = new JPanel();
        menuPanel.setLayout(null);
        menuPanel.setBackground(Color.white);
        
        ImageIcon newGame = new ImageIcon("Images/NewGame.png");
        Image temp1 = newGame.getImage() ;  
        Image newimg1 = temp1.getScaledInstance(90, 30, java.awt.Image.SCALE_SMOOTH);  
        newGame = new ImageIcon(newimg1);
        newGameButton = new JButton(newGame);
        newGameButton.setBounds(250, 132, 90, 30);
        
        ImageIcon leaderboard = new ImageIcon("Images/Leaderboard.png");
        Image temp2 = leaderboard.getImage() ;  
        Image newimg2 = temp2.getScaledInstance(90, 30, java.awt.Image.SCALE_SMOOTH);  
        leaderboard = new ImageIcon(newimg2);
        leaderboardButton = new JButton(leaderboard);

        menuPanel.add(newGameButton);
        menuPanel.add(leaderboardButton);

        mainPanel.add(menuPanel);

        board.setPreferredSize(new Dimension(390, 390));
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
