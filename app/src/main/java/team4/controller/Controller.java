package controller;
import model.*;
import view.*;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Controller implements KeyListener{
    protected Board board;
    protected Moves mover;
    protected UserInterface ui; 

    public Controller(Board board){
        this.board = board;
        mover = new Moves(board);
    }

    public void startNewGame(){
        board.reset();
        board.addTile();
    }

    @Override
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            mover.right();
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            mover.left();
        }else if(e.getKeyCode() == KeyEvent.VK_UP){
            mover.up();
        }else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            mover.down();
        }
        board.addTile();
    }

    public void showLeaderboard(){
	    LeaderboardGUI leaderboard = new LeaderboardGUI();
	    leaderboard.frame.setVisible(true);
    }

    public void showMainScreen(mainScreenGUI ui){
        ui.frame.setVisible(true);
    }
    
    @Override
    public void keyReleased(KeyEvent e){

    }

    @Override
    public void keyTyped(KeyEvent e){
        
    }
}
