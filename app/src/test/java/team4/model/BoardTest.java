package model;

import model.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class BoardTest {
    Board board;

    @Before
    public void setUp(){
        board = new Board();
    }

    @Test
    public void setValueTest(){
        board.setValue(8, 2, 1);
        assertTrue("Value should be 8", board.getValue(2,1) == 8);
    }

    @Test
    public void resetTest(){
        board.setValue(2, 0, 1);
        board.setValue(4, 1, 1);
        board.setValue(8, 3, 2);
        board.setValue(16, 2, 0);
        board.reset();
        
        int count;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                count += board.getValue(i, j);
            }
        }
        assertEquals("The entire board value should be 0", 0, count);
    }
}
