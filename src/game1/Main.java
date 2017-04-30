package game1;

import gameobjects.Flower;
import gameobjects.Wolf;

/**
 *
 * @author Davin
 */
public class Main {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createMap();
    }

    //------Varibles-Methods------------

    private static void createMap() {
        Flower flower = new Flower(100, 70, Flower.TYPE_YELLOW);
        Wolf wolf = new Wolf(400, 160);
    }



}
