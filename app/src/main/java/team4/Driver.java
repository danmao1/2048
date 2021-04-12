package team4;
import model.*;
import view.*;
import controller.*;

import java.awt.*;
import javax.swing.*;

public class Driver {
    public static void main(String args[]){
        Board board = new Board();
        Controller controller = new Controller(board);
        mainScreenGUI ui = new mainScreenGUI(board, controller);
        
        controller.startNewGame();

        System.out.println(board.getValue(2, 2));
        board.setValue(8, 2, 2);
        System.out.println(board.getValue(2, 2));


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

    }
}
