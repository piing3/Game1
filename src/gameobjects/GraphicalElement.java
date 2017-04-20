package gameobjects;

import java.awt.Color;
import java.awt.event.KeyListener;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Purpose: Root for all graphical elements
 * @author Davin
 */
abstract class GraphicalElement{

    protected BaseFrame baseFrame = new BaseFrame();
    
    protected int x;
    protected int y;
    protected int z;
    protected int width;
    protected int height;
    private JLabel image;
    private JPanel element;

    /**
     * Creates a new graphical element
     * @param x element's x position in the world
     * @param y element's y position in the world
     * @param z element's z position on the base frame
     * @param width element's width on the base frame
     * @param height element's width on the base frame
     */
    
    protected GraphicalElement(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.width = width;
        this.height = height;
        
        element = new JPanel();
        element.setBounds(x, y, width, height);        
        baseFrame.add(element);
    }

    public JPanel getElement() {
        return element;
    }
    
    protected void setBackground(Color color){
        element.setBackground(color);
        redraw();
    }
    
    protected void setSize(int width, int height){
        element.setSize(width, height);
        redraw();
    }
    
    protected void setGraphic(ImageIcon graphic){
        image.setIcon(graphic);
    } 
    
    protected void redraw(){
        baseFrame.remove(element);
        element.setBounds(x, y, width, height);
        baseFrame.add(element);
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
