package game1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;

/**
 * Purpose: Resource entities (Tree, Stone)
 * @author Davin
 *
 */
abstract class Resource extends Entity{

    protected int maxSize;
    protected int curSize;
    protected int rechargeRate;
    
    public static ArrayList<Resource> resources = new ArrayList<>();
    
    public Resource(int x, int y) {
        super(x, y, 0, 0);
        resources.add(this);
        

        
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(curSize < maxSize){
                    if(curSize + rechargeRate <= maxSize) curSize += rechargeRate;
                    else curSize = maxSize;
                }
            }
        };
        Timer recharge = new Timer(100, al);
    }
    
    abstract void harvest(Player player); 


    //------Varibles-Methods------------

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
        this.curSize = maxSize;
    }

    public void setRechargeRate(int rechargeRate) {
        this.rechargeRate = rechargeRate;
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
