package game1;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Davin
 */
public class InputLogic {

    public static final int KEY_LEFT = 37; 
    public static final int KEY_UP = 38; 
    public static final int KEY_RIGHT = 39; 
    public static final int KEY_DOWN = 40; 

    public static final int KEY_1 = 49; 
    public static final int KEY_2 = 50; 
    public static final int KEY_3 = 51; 
    public static final int KEY_4 = 52; 
    public static final int KEY_5 = 53; 
    public static final int KEY_6 = 54; 
    public static final int KEY_7 = 55; 
    public static final int KEY_8 = 56; 
    public static final int KEY_9 = 57; 
    public static final int KEY_0 = 58; 
    
    private static KeyEvent keyInput = null;
    private static MouseEvent mouseInput = null;
    
    public static void keyPressed(KeyEvent e) {
        keyInput = e;
    }

    public static void mouseClicked(MouseEvent e) {
        mouseInput = e;
    }
    
    public static boolean isDirectionKey(){
        if (keyInput.getKeyCode() == KEY_LEFT) return true;
        else if (keyInput.getKeyCode() == KEY_UP) return true;
        else if (keyInput.getKeyCode() == KEY_RIGHT) return true;
        else if (keyInput.getKeyCode() == KEY_DOWN) return true;
        else return false;
    }
    
    public static boolean isNumberKey(){
        if (keyInput.getKeyCode() == KEY_1) return true;
        else if (keyInput.getKeyCode() == KEY_2) return true;
        else if (keyInput.getKeyCode() == KEY_3) return true;
        else if (keyInput.getKeyCode() == KEY_4) return true;
        else if (keyInput.getKeyCode() == KEY_5) return true;
        else if (keyInput.getKeyCode() == KEY_6) return true;
        else if (keyInput.getKeyCode() == KEY_7) return true;
        else if (keyInput.getKeyCode() == KEY_8) return true;
        else if (keyInput.getKeyCode() == KEY_9) return true;
        else if (keyInput.getKeyCode() == KEY_0) return true;
        else return false;
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
