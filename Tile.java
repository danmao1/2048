import javax.swing.*;
import java.awt.*;

public class Tile extends JComponent{

    private int value;
    private int width;
    private int height;

    public Tile(int value){
        this.value = value;
        this.setPreferredSize(new Dimension(100, 100));
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value){
        this.value = value;
    }

    @Override
    public void paintComponent(Graphics g){
        width = getWidth();
        height = getHeight();
        g.setColor(Color.white);
        g.fillRect(0, 0, width, height);

        g.fillRoundRect(0, 0, width, height, 40, 40);
        g.setColor(Color.blue);
        
        g.drawString(Integer.toString(value), width/2, height/2);
        g.setColor(Color.gray);

    }
}
