package gameobjects;

import java.awt.Color;
import javax.swing.ImageIcon;
import game1.InputLogic;

/**
 * Purpose: 
 * @author Davin
 *
 */
public class Player extends Actor{

    public static final int TOOL_HAND = 0; 
    public static final int TOOL_AXE_WOOD = 1; 
    public static final int TOOL_AXE_STONE = 2; 
    public static final int TOOL_SWORD_WOOD = 3; 
    public static final int TOOL_SWORD_STONE = 4; 
    
    private int wood;
    private int stone;
    private int tool;
    
    
    public Player(int x, int y) {
        super(x, y, 50, 50);
        setGraphic(new ImageIcon("src\\graphics\\player"));
        tool = 0;
        wood = 0;
        stone = 0;
    }

    @Override
    void script() {
        if(InputLogic.keyInput != null) keyInput();
        if(InputLogic.mouseInput != null) mouseInput();
    }

    private void keyInput() {
        if (InputLogic.isDirectionKey()) {
            if (InputLogic.keyInput.getKeyCode() == 37) move(x, y);
            if (InputLogic.keyInput.getKeyCode() == 38) move(x, y);
            if (InputLogic.keyInput.getKeyCode() == 39) move(x, y);
            if (InputLogic.keyInput.getKeyCode() == 40) move(x, y);
            InputLogic.keyInput = null;
        }
        else if (InputLogic.isNumberKey()){
            InputLogic.keyInput = null;
        }
        else return;;
        
    }
    
    private void mouseInput() {
    }

    //------Varibles-Methods------------

    public void addWood(int add) {
        this.wood += add;
    }
    public boolean removeWood(int remove) {
        if(this.wood < remove) return false;
        this.wood -= remove;
        return true;
    }
    
    public void addStone(int add) {
        this.stone += add;
    }
    public boolean removeStone(int remove) {
        if(this.stone < remove) return false;
        this.stone -= remove;
        return true;
    }

    public int getTool() {
        return tool;
    }

    public void setTool(int tool) {
        this.tool = tool;
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
