import javax.swing.*;
import java.awt.*;

public class Board extends JPanel{
    private static final int row = 4;
    private static final int col = 4;

    private JFrame frame;
    
    private Tile nums[][];

    public Board(){
        frame = new JFrame("2048");
        frame.setPreferredSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(row, col));
        nums = new Tile[col][row];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                nums[col][row] = new Tile(0);
                frame.add(nums[col][row]);
            }
        }

        frame.pack();
        frame.setVisible(true);
    }

    public Tile getValue(){
        return nums[col][row];
    }

    public void setValue(int value, int col, int row){
        nums[col][row] = new Tile(value);
    }
}
