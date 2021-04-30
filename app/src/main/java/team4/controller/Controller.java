package controller;
import model.*;
import view.*;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Controller implements KeyListener{
    public Board board;
    public ObservableScore score;
    public Moves mover; 
    public Leaderboard leaderboard;
    public UserInterface userInterface;

    public Controller(Board board, ObservableScore score, Leaderboard leaderboard, UserInterface userInterface){
        this.board = board;
        this.score = score;
        this.leaderboard = leaderboard;
        this.userInterface = userInterface;
        mover = new Moves(board, score);
    }

    public int getScore(){
        return score.getScore();
    }

    public void startNewGame(){
        leaderboard.leaderboardCalculation(getScore());
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

    public void onFinish(){
        boolean playAgain = userInterface.playAgain();
        if(playAgain){
            this.startNewGame();
        }
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
