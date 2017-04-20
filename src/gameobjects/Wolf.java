package gameobjects;

import javax.swing.ImageIcon;

/**
 *
 * @author d.holmberg
 */
public class Wolf extends Actor{

    public Wolf(int x, int y) {
        super(x, y, 60, 60);
        setGraphic(new ImageIcon("src\\graphics\\wolf"));
    }

    @Override
    void script() {
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
