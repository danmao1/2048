import java.awt.*;
import javax.swing.*;

public class Driver {
    public static void main(String args[]){
        Board board = new Board();

        JFrame frame = new JFrame("2048");
        frame.setPreferredSize(new Dimension(400, 450));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        JPanel menuPanel = new JPanel();
        JButton newGameButton = new JButton("New Game");
        JButton leaderboardButton = new JButton("Leaderboard");
        menuPanel.add(newGameButton);
        menuPanel.add(leaderboardButton);

        mainPanel.add(menuPanel);
        mainPanel.add(board);

        frame.add(mainPanel);

        frame.pack();
        frame.setVisible(true);
    }
}
