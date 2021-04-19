package team4;
import model.*;
import view.*;
import controller.*;

import java.awt.event.*;
public class Driver {
    public static void main(String args[]){
        Board board = new Board();
        LeaderboardGUI leaderboard = new LeaderboardGUI();
        Controller controller = new Controller(board);
        mainScreenGUI ui = new mainScreenGUI(board, controller, leaderboard);
        
        board.setFocusable(true);
        board.requestFocusInWindow();
        board.addKeyListener(controller);

        ui.addNewGameListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    controller.startNewGame();
                    board.requestFocusInWindow();
                }
            }
        );

        ui.addLeaderboardListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    controller.showLeaderboard(leaderboard);
                }
            }
        );

        ui.addBackListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    controller.showMainScreen(leaderboard);
                    board.requestFocusInWindow();
                }
            }
        );
        
        controller.startNewGame();
    }
}
