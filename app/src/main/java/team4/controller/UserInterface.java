package controller;
import model.*;
import view.*;

public interface UserInterface {
    public void startNewGame();
    public void showLeaderboard(LeaderboardGUI leaderboard); 
    public void showMainScreen(mainScreenGUI ui);
}
