import javax.swing.*;
import java.awt.*;

public class Board{

    private JFrame frame;
    private JPanel panel;

    public Board(){
        frame = new JFrame("2048");
        frame.setPreferredSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();

        panel.add(new Tile(16));

        /*
        panel.setLayout(new GridLayout(4, 4));

        for(int i = 0; i < 16; i++){
            panel.add(new JLabel("0"));
        }
        */
        

        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
