package model;

import java.util.*;
import java.io.*;
import java.net.URL;

public class Leaderboard {
    
    public Leaderboard(){
	}
	
	public void leaderboardCalculation(int currentScore) {
		ArrayList<String> topScores = new ArrayList<String> ();
		try {
			File file = new File(getClass().getClassLoader().getResource("scores.txt").getFile());
			BufferedReader br = new BufferedReader(new FileReader(file)); 
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			String score; 

			int j = 0;
			while((score = br.readLine()) != null){
					int i = Integer.parseInt(score);
					if(currentScore > i){
						String newleader = String.valueOf(currentScore);
						topScores.add(newleader);
					}
					topScores.add(score);
			}

			while((score = br.readLine()) != null){
					bw.write(topScores.get(j));
					j++;
			}

			br.close();
			bw.close();
		}catch(IOException e){
			e.getMessage();
		}
			 
	}	
}
