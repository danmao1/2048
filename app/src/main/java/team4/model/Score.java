package model;

import java.util.ArrayList;
import java.util.Iterator;

public class Score implements Iterable<Integer>{

    private ArrayList<Integer> scores;
    int currentScore;

    public Score(){
        scores = new ArrayList<Integer>();
        currentScore = 0;
    }
    

    public int getScore(){
        return currentScore;
    }

    public void update(int value){
        currentScore += value;
    }

    public void reset(){
        currentScore = 0;
    }

    @Override 
    public Iterator<Integer> iterator(){
        return scores.iterator();
    }
}