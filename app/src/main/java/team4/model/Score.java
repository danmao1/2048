package model;

public class Score{

    int currentScore = 0;

    public int getScore(){
        return currentScore;
    }

    public void update(int value){
        currentScore += value;
    }

    public void reset(){
        currentScore = 0;
    }
}