import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Board extends JPanel{
    protected static final int row = 4;
    protected static final int col = 4;
    
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

    public void setValue(int value, int row, int col){
        nums[row][col] = new Tile(value);
    }

    public void update(){
        Tile tile;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                tile = this.getValue();
                int value = tile.getValue();
                tile.setValue(value);
            }
        }
        tile.repaint();
    }

    /*
    public void addTile(){
        int tempRow;
        int tempCol;

        Random random = new Random();
        while(nums[row][col] != 0){
            tempRow = random.nextInt(row);
            tempCol = random.nextInt(col);
        }
        nums[tempRow][tempCol] = 2;
    }
    */
}
