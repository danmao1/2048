import java.awt.*;
import javax.swing.*;

public class Driver {
    public static void main(String args[]){
        Board board = new Board();

        JFrame frame = new JFrame("2048");
        frame.setPreferredSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(board);


        frame.pack();
        frame.setVisible(true);
    }
}
