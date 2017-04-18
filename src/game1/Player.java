package game1;

import java.awt.Color;

/**
 * Purpose: 
 * @author Davin
 *
 */
public class Player extends Actor{

    public Player(int x, int y) {
        super(x, y, 50, 50);
        setBackground(Color.yellow);
    }

    @Override
    void script() {
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
