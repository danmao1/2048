package model;

import view.*;

public class Moves {
    Board board;

    int value;

    public Moves(Board board){
        this.board = board;
    }
    
    public void up(){
        int result;
        for(int row = 0; row < 4; row++){
            result = 1;
            for(int col = 1; col < 4; col++){
                if(result == col || board.getValue(row, col) == 0){
                    continue;
                }else if(board.getValue(row, col) == board.getValue(row, result)){
                    value = board.getValue(row, result);
                    board.setValue(value, row, result);
                    board.setValue(0, row, col);
                    result++;
                }else{
                    if(board.getValue(row, result) != 0){
                        result++;
                    }
                    if(result != col){
                        value = board.getValue(row, col);
                        board.setValue(value, row, result);
                        board.setValue(0, row, col);
                    }
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
