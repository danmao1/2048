package team4;
import model.*;
import view.*;
import controller.*;

import java.awt.event.*;
public class Driver {
    public static void main(String args[]){
        Board board = new Board();
        BoardGUI boardGUI = new BoardGUI(board);
        LeaderboardGUI leaderboard = new LeaderboardGUI();
        Controller controller = new Controller(board);
        mainScreenGUI ui = new mainScreenGUI(controller, boardGUI, leaderboard);
        
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
