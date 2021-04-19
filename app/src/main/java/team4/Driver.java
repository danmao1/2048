package team4;
import model.*;
import view.*;
import controller.*;

import java.awt.event.*;
public class Driver {
    public static void main(String args[]){
        Board board = new Board();
        Controller controller = new Controller(board);
        mainScreenGUI ui = new mainScreenGUI(board, controller);
        LeaderboardGUI leaderboard = new LeaderboardGUI();

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
                    controller.showLeaderboard();
                }
            }
        );

        leaderboard.addBackListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    controller.showMainScreen(ui);
                    board.requestFocusInWindow();
                }
            }
        );
        
        controller.startNewGame();
    }
}
