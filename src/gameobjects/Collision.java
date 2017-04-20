package gameobjects;

import java.util.ArrayList;

/**
 *
 * @author Davin
 */
interface Collision <T extends GraphicalElement>{
    
    public boolean checkBoxCollision(T element);
    
}
