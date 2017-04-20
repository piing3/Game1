package gameobjects;

import javax.swing.ImageIcon;

/**
 * Purpose: Flower decoration type
 * @author Davin
 *
 */
public class Flower extends Decoration{

    public static final int TYPE_YELLOW = 0; 
    public static final int TYPE_RED = 1; 
    public static final int TYPE_PURPLE = 2; 
    public static final int TYPE_BLUE = 3; 
    
    public Flower(int x, int y, int type) {
        super(x, y, 10, 20);
        if (type == TYPE_YELLOW) setGraphic(new ImageIcon("src\\graphics\\flower_yellow"));
        if (type == TYPE_RED) setGraphic(new ImageIcon("src\\graphics\\flower_red"));
        if (type == TYPE_PURPLE) setGraphic(new ImageIcon("src\\graphics\\flower_purple"));
        if (type == TYPE_BLUE) setGraphic(new ImageIcon("src\\graphics\\flower_blue"));
    }

    //-------Object-Methods------------- 

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
