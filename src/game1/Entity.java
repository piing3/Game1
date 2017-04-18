package game1;

import java.util.ArrayList;

/**
 * Purpose: Non-actor intractable elements (Rock, Tree, Etc)
 * @author Davin
 *
 */
abstract class Entity extends GraphicalElement{

    public static ArrayList<Entity> allEntities = new ArrayList<>();
    
    protected Entity(int x, int y, int width, int height) {
        super(x, y, width, height);
        allEntities.add(this);
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
