package team4;
import model.*;
import view.*;
import controller.*;

import java.awt.event.*;
public class Driver {
    public static void main(String args[]){
        Board board = new Board();
        ObservableScore score = new ObservableScore();
        BoardGUI boardGUI = new BoardGUI(board);
        LeaderboardGUI leaderboardGUI = new LeaderboardGUI();
        Controller controller = new Controller(board, score);
        mainScreenGUI ui = new mainScreenGUI(controller, boardGUI, leaderboardGUI);
        
        boardGUI.setFocusable(true);
        boardGUI.requestFocusInWindow();
        boardGUI.addKeyListener(controller);

        ui.addNewGameListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    controller.startNewGame();
                    boardGUI.requestFocusInWindow();
                    ui.putBestScore();
                }
            }
        );

        ui.addLeaderboardListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    controller.showLeaderboard(leaderboardGUI);
                }
            }
        );

        ui.addBackListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    controller.showMainScreen(leaderboardGUI);
                    boardGUI.requestFocusInWindow();
                }
            }
        );
        
        controller.startNewGame();
        score.addScoreObserver(ui);
    }
}
