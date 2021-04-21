package model;

public class Moves {
    Board board;

    int value;
    int result;

    public Moves(Board board){
        this.board = board;
    }
    
    public void up(){
        for(int col = 0; col < 4; col++){
            result = 0;
            for(int row = 1; row < 4; row++){
                if(result == row || board.getValue(row, col) == 0){
                    continue;
                }else if(board.getValue(row, col) == board.getValue(result, col)){
                    value = board.getValue(result, col);
                    board.setValue(value * 2, result, col);
                    board.setValue(0, row, col);
                    result++;
                }else{
                    if(board.getValue(result, col) != 0){
                        result++;
                    }
                    if(result != row){
                        value = board.getValue(row, col);
                        board.setValue(value, result, col);
                        board.setValue(0, row, col);
                    }
                }
            }
        }
        board.update();
    }

    public void down(){
        for(int col = 0; col < 4; col++){
            result = 3;
            for(int row = 3; row >= 0; row--){
                if(result == row || board.getValue(row, col) == 0){
                    continue;
                }else if(board.getValue(row, col) == board.getValue(result, col)){
                    value = board.getValue(result, col);
                    board.setValue(value * 2, result, col);
                    board.setValue(0, row, col);
                    result--;
                }else{
                    if(board.getValue(result, col) != 0){
                        result--;
                    }
                    if(result != row){
                        value = board.getValue(row, col);
                        board.setValue(value, result, col);
                        board.setValue(0, row, col);
                    }
                }
            }
        }
        board.update();
    }

    public void left(){
        for(int row = 0; row < 4; row++){
            result = 0;
            for(int col = 1; col < 4; col++){
                if(result == col || board.getValue(row, col) == 0){
                    continue;
                }else if(board.getValue(row, col) == board.getValue(row, result)){
                    value = board.getValue(row, result);
                    board.setValue(value * 2, row, result);
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
        board.update();
    }

    public void right(){
        for(int row = 0; row < 4; row++){
            result = 3;
            for(int col = 3; col >= 0; col--){
                if(result == col || board.getValue(row, col) == 0){
                    continue;
                }else if(board.getValue(row, col) == board.getValue(row, result)){
                    value = board.getValue(row, result);
                    board.setValue(value * 2, row, result);
                    board.setValue(0, row, col);
                    result--;
                }else{
                    if(board.getValue(row, result) != 0){
                        result--;
                    }
                    if(result != col){
                        value = board.getValue(row, col);
                        board.setValue(value, row, result);
                        board.setValue(0, row, col);
                    }
                }
            }
        }
        board.update();
    }
}

/*
    /*
    public void upAll(){
        for(int x = 0; x < 4; x++){
            for(int y = 1; y < 4; y++){
                this.up(x, y);
            }
        }
    }
 
    public void downAll(){
        for(int x = 0; x < 4; x++){
            for(int y =2; y >= 0; y--){
                this.down(x, y);
            }
        }
    }
 
    public void rightAll(){
        for(int y = 0; y < 4; y++){
            for(int x = 1; x < 4; x++){
                this.right(x, y);
            }
        }
    }
 
    public void leftAll(){
        for(int y = 0; y < 4; y++){
            for(int x =2; x >= 0; x--){
                this.left(x, y);
            }
        }
    }
 
    public void up(int x, int y){
        while(y != 0){
            if(board.getValue(y, x) == 0){
                break;
            }
            if(board.getValue(y - 1, x) == 0){
                value = board.getValue(x, y);
                board.setValue(value, y - 1, x);
                board.setValue(0, y, x);
                y--;
            }
            if(board.getValue(y - 1, x) == board.getValue(y, x)){
                value = board.getValue(x, y - 1);
                board.setValue(value * 2, y - 1, x);
                board.setValue(0, y, x);
                y--;
                
                if(board.getValue(y - 1, x) == board.getValue(y, x)){
                    break;
                }
            }
            if(board.getValue(y - 1, x) != board.getValue(y, x) && board.getValue(y - 1, x) != 0){
                break;
            }
        }
    }
 
    public void down(int x, int y){
        while(y != 3){
            if(board[y][x] == 0){
                break;
            }
            if(board[y+1][x] == 0){
                board[y+1][x] = board[x][y];
                board[y][x] = 0;
                y++;
            }
            if(board[y+1][x].getValue() == board[y][x].getValue()){
                board[y+1][x] = board[x][y+1].getValue() * 2;
                board[y][x] = 0;
                y++;
                if(board[y+1][x].getValue() == board[y][x].getValue()){
                    break;
                }
            }
            if(board[y+1][x].getValue() != board[y][x].getValue() && board[y+1][x].getValue() != 0){
                break;
            }
        }
    }
 
    public void right(int x, int y){
        while(x != 0){
            if(board[y][x] == 0){
                break;
            }
            if(board[y][x-1] == 0){
                board[y][x-1] = board[x][y];
                board[y][x] = 0;
                x--;
            }
            if(board[y][x-1].getValue() == board[y][x].getValue()){
                board[y][x-1] = board[y][x-1].getValue() * 2;
                board[y][x] = 0;
                x--;
                if(board[y][x-1].getValue() == board[y][x].getValue()){
                    break;
                }
            }
            if(board[y][x-1].getValue() != board[y][x].getValue() && board[y][x-1].getValue() != 0){
                break;
            }
        }
    }
 
    public void left(int x, int y){
        while(x != 3){
            if(board[y][x] == 0){
                break;
            }
            if(board[y][x+1] == 0){
                board[y][x+1] = board[x][y];
                board[y][x] = 0;
                x++;
            }
            if(board[y][x+1].getValue() == board[x][y].getValue()){
                board[y][x+1] = board[y][x+1].getValue() * 2;
                board[y][x] = 0;
                x++;
                if(board[y][x+1].getValue() == board[y][x].getValue()){
                    break;
                }
            }
            if(board[y][x+1].getValue() != board[y][x].getValue() && board[y][x+1].getValue() != 0){
                break;
            }
        }
    }
    */