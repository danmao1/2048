package model;


import org.junit.Test;
import static org.junit.Assert.*;

public class BoardTest {
    private Board board;
	private int count;
    

    @Test
    public void setValueTest(){
		board = new Board();
        board.setValue(8, 2, 1);
        assertTrue("Value should be 8", board.getValue(2,1) == 8);
    }

    @Test
    public void resetTest(){
		board = new Board();
        board.setValue(2, 0, 1);
        board.setValue(4, 1, 1);
        board.setValue(8, 3, 2);
        board.setValue(16, 2, 0);
        board.reset();
        
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                count += board.getValue(i, j);
            }
        }
        assertEquals("The entire board value should be 0", 0, count);
    }

    @Test
    public void isEmptyTest(){

    }

    @Test
    public void isFilledTest(){

    }

    @Test
    public void addTileWhenEmptyTest(){

    }

    @Test
    public void addTileDuringTest(){

    }
}
