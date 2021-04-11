package view;
import model.*;
import controller.*;
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

    public int getValue(int row, int col){
        return nums[row][col].getValue();
    }

    public void setValue(int value, int row, int col){
        nums[row][col] = new Tile(value);
    }

    /*
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
    */

    
    public void addTile(){
        Random random = new Random();

        int tempRow = random.nextInt(row);
        int tempCol = random.nextInt(col);

        if(this.isEmpty()){
            nums[tempRow][tempCol].setValue(2);
        }

        int percent = random.nextInt(100);
        if(nums[tempRow][tempCol].getValue() == 0){
            if(percent < 80){
                nums[tempRow][tempCol].setValue(2);
            }else{
                nums[tempRow][tempCol].setValue(4);
            }
        }else{
            this.addTile();
        }
    }

    public boolean isEmpty(){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(nums[i][j].getValue() != 0){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isFilled(){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(nums[i][j].getValue() == 0){
                    return false;
                }
            }
        }
        return true;
    }
    
}