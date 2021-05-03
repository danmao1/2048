package model;

import java.util.*;
import java.io.*;
import java.net.URL;

public class Leaderboard {
	public String score; 
	public ArrayList<String> topScores;
	
	public void leaderboardCalculation(int currentScore, String filename){
		try{
			topScores = new ArrayList<String>();
			File file = new File(getClass().getClassLoader().getResource(filename).getFile());
			BufferedReader br = new BufferedReader(new FileReader(file)); 
			boolean bool=true;
			while((score = br.readLine()) != null){
				int i = Integer.parseInt(score);
				if(currentScore > i && bool){
					String newleader = String.valueOf(currentScore);
					topScores.add(newleader);
					bool=false;
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
