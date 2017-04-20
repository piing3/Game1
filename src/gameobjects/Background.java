package gameobjects;

import javax.swing.ImageIcon;

/**
 *
 * @author d.holmberg
 */
public class Background extends Decoration{

    /**
     * Creates a background panel
     * @param x
     * @param y
     * @param section The end of the graphic file name
     */
    public Background(int x, int y, String section) {
        super(x, y, 1000, 1000);
        setGraphic(new ImageIcon("src\\graphics\\background_"+section));
    }


    //----Variables-----------


    
    //----Object-Methods-------

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
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
