package gameobjects;

import game1.InputLogic;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

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
    
    private InputLogic inputLogic = null;
    
    public Player(int x, int y) {
        super(x, y, 50, 50);
        setGraphic(new ImageIcon("src\\graphics\\player.png"));
        tool = 0;
        wood = 0;
        stone = 0;
        this.inputLogic = new InputLogic();
        baseFrame.addInputLogic(inputLogic);
    }

    @Override
    void script() {
        if(inputLogic != null){
            if(inputLogic.keyInput != null) keyInput();
            if(inputLogic.mouseInput != null) mouseInput();
        }
    }

    private void keyInput() {
        if (inputLogic.keyInput.getKeyCode() == 37){
            move(-5, 0);
            inputLogic.keyInput = null;
        }
        if (inputLogic.keyInput.getKeyCode() == 38){
            move(0, 5);
            inputLogic.keyInput = null;
        }
        if (inputLogic.keyInput.getKeyCode() == 39){
            move(5, 0);
            inputLogic.keyInput = null;
        }
        if (inputLogic.keyInput.getKeyCode() == 40){
            move(0, -5);
            inputLogic.keyInput = null;
        }
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
    
    public void setInputLogic(InputLogic inputLogic){
        this.inputLogic = inputLogic;
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
