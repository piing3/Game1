package game1;

/**
 *
 * @author d.holmberg
 */
public class Tree extends Resource{

    public static final int TYPE_SMALL = 0; 
    public static final int TYPE_MID = 1; 
    public static final int TYPE_LARGE = 2;
    
    public Tree(int x, int y, int type) {
        super(x, y);
        if (type == TYPE_SMALL) {
            setMaxSize(25);
            setRechargeRate(1);
            setSize(50, 100);
            this.setGraphic("");
        }
        if (type == TYPE_MID) {
            setMaxSize(25);
            setRechargeRate(1);
            setSize(75, 125);
            this.setGraphic("");
        }
        if (type == TYPE_LARGE) {
            setMaxSize(25);
            setRechargeRate(1);
            setSize(100, 150);
            this.setGraphic("");
        }
    }

    @Override
    void harvest(Player player) {
        
    }


    //----Variables-----------


    
    //----Object-Methods-------

    @Override
    protected Object clone() throws CloneNotSupportedException {
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
