package team4;
import model.*;
import view.*;
import controller.*;

import java.awt.event.*;
public class Driver {
    public static void main(String args[]){
        BoardGUI boardGUI = new BoardGUI();
        LeaderboardGUI leaderboard = new LeaderboardGUI();
        Board board = new Board();
        Controller controller = new Controller(board);
        mainScreenGUI ui = new mainScreenGUI(boardGUI, controller, leaderboard);
        
        boardGUI.setFocusable(true);
        boardGUI.requestFocusInWindow();
        boardGUI.addKeyListener(controller);

        ui.addNewGameListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    controller.startNewGame();
                    boardGUI.requestFocusInWindow();
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
                    boardGUI.requestFocusInWindow();
                }
            }
        );
        
        controller.startNewGame();
    }
}
