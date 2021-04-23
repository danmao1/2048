package controller;
import model.*;
import view.*;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Controller implements KeyListener{
    protected Board board;
    protected Score score;
    protected Moves mover;
    protected UserInterface ui; 

    public Controller(Board board, Score score){
        this.board = board;
        this.score = score;
        mover = new Moves(board, score);
    }

    public int getScore(){
        return score.getScore();
    }

    public void startNewGame(){
        board.reset();
        score.reset();
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

    public void showLeaderboard(LeaderboardGUI leaderboard){
	    leaderboard.frame.setVisible(true);
    }

    public void showMainScreen(LeaderboardGUI leaderboard){
        leaderboard.frame.dispose();
    }
    
    @Override
    public void keyReleased(KeyEvent e){

    }

    @Override
    public void keyTyped(KeyEvent e){
        
    }
}
