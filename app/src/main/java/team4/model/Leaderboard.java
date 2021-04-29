package model;

import java.util.*;
import java.io.*;
import java.net.URL;

public class Leaderboard {
	public String score; 
	
	public void leaderboardCalculation(int currentScore){
		try{
			ArrayList<String> topScores = new ArrayList<String>();
			File file = new File(getClass().getClassLoader().getResource("scores.txt").getFile());
			BufferedReader br = new BufferedReader(new FileReader(file)); 
			
			while((score = br.readLine()) != null){
				int i = Integer.parseInt(score);
				if(currentScore > i){
					String newleader = String.valueOf(currentScore);
					topScores.add(newleader);
				}
				topScores.add(score);
			}
			
			FileOutputStream fos = new FileOutputStream(file);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

			for(int j = 0; j < 5; j++){
				bw.write(topScores.get(j));
				bw.newLine();
			}
			bw.close();
			br.close();
		}catch(IOException e){
			e.getMessage();
		}	 
	}	
}
