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
    public BoardGUI boardGUI;

    public Controller(Board board, ObservableScore score, Leaderboard leaderboard, UserInterface userInterface, BoardGUI boardGUI){
        this.board = board;
        this.score = score;
        this.leaderboard = leaderboard;
        this.userInterface = userInterface;
        this.boardGUI = boardGUI;
        mover = new Moves(board, score);
    }

    public int getScore(){
        return score.getScore();
    }

    public void startNewGame(){
        leaderboard.leaderboardCalculation(this.getScore());
        board.reset();
        score.reset();
        board.addTile();
    }

    @Override
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            if(mover.right()){
                this.onFinish();
            }
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            if(mover.left()){
                this.onFinish();
            }
        }else if(e.getKeyCode() == KeyEvent.VK_UP){
            if(mover.up()){
                this.onFinish();
            }
        }else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            if(mover.down()){
                this.onFinish();
            }
        }
        board.addTile();
    }

    public void onFinish(){
        boolean playAgain = userInterface.playAgain();
        if(playAgain){
            this.startNewGame();
        }else{
            boardGUI.setFocusable(false);
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
