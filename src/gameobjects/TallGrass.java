package gameobjects;

import static gameobjects.Flower.TYPE_YELLOW;
import javax.swing.ImageIcon;

/**
 * Purpose: 
 * @author Davin
 *
 */
public class TallGrass extends Decoration{

    public TallGrass(int x, int y) {
        super(x, y, 20, 15);
        setGraphic(new ImageIcon("src\\graphics\\tall_grass.png"));
    }


    //------Varibles-Methods------------



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
