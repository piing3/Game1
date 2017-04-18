package game1;

import java.util.ArrayList;

/**
 *
 * @author Davin
 */
public interface Collision <T extends GraphicalElement>{
    
    public boolean checkBoxCollision(T element);
    
}
