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

        board.setFocusable(true);
        board.requestFocusInWindow();
        board.addKeyListener(controller);

        /*
        ui.addNewGameListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    controller.startNewGame();
                }
            }
        );

        ui.addLeaderboardListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    controller.
                }
            }
        );
        */

        controller.startNewGame();
    }
}
