package model;

import view.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class MovesTest {
    @Test
    public void emptyColumnUpTest(){
        Board board = new Board();
        BoardGUI gui = new BoardGUI(board);
        Score score = new Score();
        Moves mover = new Moves(board, score);

        board.setValue(2, 3, 0);
        mover.up();
        
        assertEquals("The tile should have moved up to the top row", 2, board.getValue(0, 0));
    }

    @Test
    public void downTest(){
        
    }

    @Test
    public void leftTest(){
        
    }

    @Test
    public void rightTest(){
        
    }
}
