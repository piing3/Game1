package game1;

import java.awt.Color;

/**
 * Purpose: 
 * @author Davin
 *
 */
public class Player extends Actor{

    private int wood;
    private int stone;
    //Tool tool;
    
    
    public Player(int x, int y) {
        super(x, y, 50, 50);
        setBackground(Color.yellow);
    }

    @Override
    void script() {
        
    }


    //------Varibles-Methods------------

    public void addWood(int add) {
        this.wood += add;
    }
    public boolean removeWood(int remove) {
        if(this.wood < remove) return false;
        this.wood -= remove;
        return true;
    }
    
    public void addStone(int add) {
        this.stone += add;
    }
    public boolean removeStone(int remove) {
        if(this.stone < remove) return false;
        this.stone -= remove;
        return true;
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
