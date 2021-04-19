package controller;
import model.*;
import view.*;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.*;
import java.io.*;
import java.net.URL;


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

	public void leaderboardCalculation(int score) {
		ArrayList<String> leader= new ArrayList<String> ();
		try {
			File file = new File(getClass().getClassLoader().getResource("scores.txt").getFile());
			BufferedReader br = new BufferedReader(new FileReader(file)); 
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			String scores, temp; 
			int j=0;
			while ((scores = br.readLine()) != null){
					int i=Integer.parseInt(scores);
					if (score>i) {
						String newleader= String.valueOf(score);
						leader.add(newleader);
					}
					leader.add(scores);
				}
			while ((scores = br.readLine()) != null){
					bw.write(leader.get(j));
					j++;
				}
			}
		 catch (IOException e) {
			 e.getMessage();
		 }
			 
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
