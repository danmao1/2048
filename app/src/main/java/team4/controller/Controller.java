package controller;
import model.*;
import view.*;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Controller implements KeyListener{
    Board board;
    Moves mover;

    public Controller(Board board){
        this.board = board;
        mover = new Moves(board);
    }

    public void startNewGame(){
        board.addTile();
    }

    @Override
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){

        }else if(e.getKeyCode() == KeyEvent.VK_LEFT){

        }else if(e.getKeyCode() == KeyEvent.VK_UP){
            mover.up();
            board.addTile();
        }else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            mover.down();
            board.addTile();
        }
        //board.update();
    }

    @Override
    public void keyReleased(KeyEvent e){

    }

    @Override
    public void keyTyped(KeyEvent e){
        
    }

    
}
