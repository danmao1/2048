import javax.swing.*;
import java.awt.*;

public class Board extends JPanel{
    private static final int row = 4;
    private static final int col = 4;
    
    private Tile nums[][];

    public Board(){
        this.setLayout(new GridLayout(row, col));
        nums = new Tile[col][row];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                nums[i][j] = new Tile(0);
                this.add(nums[i][j]);
            }
        }
    }

    public Tile getValue(){
        return nums[col][row];
    }

    public void setValue(int value, int col, int row){
        nums[col][row] = new Tile(value);
    }
}
