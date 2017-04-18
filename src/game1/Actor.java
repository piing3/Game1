package game1;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 * Purpose: Actor intractable elements (Player, Enemies, etc)
 * @author Davin
 *
 */
abstract class Actor extends GraphicalElement implements Collision<Entity>{

    protected Timer tick;
    protected ActionListener al;
    
    public Actor(int x, int y, int width, int height) {
        super(x, y, width, height);
        al = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                script();
            }
        };
        tick = new Timer(100, al);
        tick.start();
    }

    @Override
    public boolean checkBoxCollision(Entity entity) {
        Rectangle box1 = new Rectangle(this.x, this.y, this.width, this.height);
        Rectangle box2 = new Rectangle(entity.x, entity.y, entity.width, entity.height);
        return box1.intersects(box2);
    }
    
    public void move(int dX, int dY){
        this.x += dX;
        this.y += dY;
        
        for (int i = 0; i < Entity.allEntities.size(); i++) {
            if (checkBoxCollision(Entity.allEntities.get(i))) {
                this.x -= dX;
                this.y -= dY;
                break;
            }
        }
        
        this.redraw();
    }

    /**
     * Runs every tick
     */
    abstract void script();

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
