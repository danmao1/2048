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
        g.setColor(new Color(123, 120, 109));
        g.fillRect(0, 0, width, height);

        g.setColor(new Color(198, 192, 183));
        g.fillRoundRect(5, 5, width-10, height-10, 40, 40);
        
        g.setColor(Color.white);
        g.drawString(Integer.toString(value), width/2, height/2);
        
    }
}
