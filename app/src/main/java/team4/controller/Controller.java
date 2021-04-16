package controller;
import model.*;
import view.*;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.net.URL;


public class Controller implements KeyListener{
    Board board;
    Moves mover;

    public Controller(Board board){
        this.board = board;
        mover = new Moves(board);
    }

    public void startNewGame(){
        //board.reset();
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
	/*public void leaderboardCalculation(int score) {
		ArrayList<String> leader= new ArrayList<String> ();
		URL text = this.getClass().getClassLoader().getResource("scores.txt");
		File file = new File(text);
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
		String scores, temp; 
		int j=0;
		while ((scores = br.readLine()) != null){
				int i=Integer.parseInt(word);
				if (score>i) {
					String newleader= String.valueOf(score);
					leader.add(newleader);
				}
				leader.add(scores);
			}
		while ((scores = br.readLine()) != null){
				bw.write(leader[j]);
				j++;
			}
		}*/
		
			
		

		
		
    @Override
    public void keyReleased(KeyEvent e){

    }

    @Override
    public void keyTyped(KeyEvent e){
        
    }

    
}
