package model;

import java.util.*;
import java.io.*;
import java.net.URL;

public class Leaderboard {
    
    public Leaderboard(){
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
		
}
