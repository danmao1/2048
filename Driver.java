package team4;

import java.awt.*;
import javax.swing.*;

public class Driver {
    public static void main(String args[]){
        Board board = new Board();
        mainScreenGUI ui = new mainScreenGUI(board);
        Controller controller = new Controller(board);


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
