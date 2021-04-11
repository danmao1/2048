package model;

import view.*;

public class Moves {
    Board board;

    public Moves(Board board){
        this.board = board;
    }
    
    public void up(){
        int result;
        for(int row = 1; row < board.row; row++){
            result = 1;
            for(int col = 2; col < board.col; col++){
                if(result == col || board.getValue(row, col) == 0){
                    continue;
                }else if(board.getValue(row, col) == board.getValue(row, result)){
                    int value = board.getValue(row, result);
                    board.setValue(value, row, result);
                    board.setValue(0, row, col);
                    result++;
                }else{

                }
            }
        }
    }

    public void down(){
        
    }

    public void left(){
        
    }

    public void right(){
        
    }
}
