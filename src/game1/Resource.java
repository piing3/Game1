package game1;

/**
 * Purpose: 
 * @author Davin
 *
 */
public class Resource extends Entity{

    //linked list
    
    public Resource(int x, int y, int width, int height) {
        super(x, y, width, height);
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
