package gameobjects;

import game1.InputLogic;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 * Purpose: The main frame of the game
 * @author Davin
 *
 */
class BaseFrame extends JFrame implements KeyListener, MouseListener{

    private ArrayList<InputLogic> inputs = new ArrayList<>();
    
    public BaseFrame() {
        this.setLocation(350, 30);
        this.setSize(1280, 1024);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void add(GraphicalElement element) {
        this.add(element.getElement());
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        for (int i = 0; i < inputs.size(); i++) {            
            inputs.get(i).keyPressed(e);
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        for (int i = 0; i < inputs.size(); i++) {            
            inputs.get(i).mouseClicked(e);
        }
    }
    
    
    //------Varibles-Methods------------

    protected void addInputLogic(InputLogic inputLogic){
        inputs.add(inputLogic);
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

    
  
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}


}
