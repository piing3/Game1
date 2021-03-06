package gameobjects;

import javax.swing.ImageIcon;

/**
 * Purpose: Tree resource
 * @author Davin
 */
public class Tree extends Resource{
    
    
    public Tree(int x, int y, int type) {
        super(x, y);
        if (type == TYPE_SMALL) {
            setMaxSize(25);
            setRechargeRate(1);
            setSize(50, 100);
            this.setGraphic(new ImageIcon("src\\graphics\\tree_small.png"));
        }
        if (type == TYPE_MID) {
            setMaxSize(50);
            setRechargeRate(2);
            setSize(75, 125);
            this.setGraphic(new ImageIcon("src\\graphics\\tree_mid.png"));
        }
        if (type == TYPE_LARGE) {
            setMaxSize(100);
            setRechargeRate(4);
            setSize(100, 150);
            this.setGraphic(new ImageIcon("src\\graphics\\tree_large.png"));
        }
    }

    @Override
    void harvest(Player player) {
        int wood = 0;
        if(curSize <= 0){
            System.out.println("Resouce empty!");
            return;
        }
        
        if (player.getTool() == Player.TOOL_HAND) wood = 1;
        else if (player.getTool() == Player.TOOL_AXE_WOOD) wood = 2;
        else if (player.getTool() == Player.TOOL_AXE_STONE) wood = 3;
        else{
            System.out.println("Wrong tool!");
            return;
        }
        
        if(curSize - wood >= 0){
            curSize -= wood;
            player.addWood(wood);
        }
        else {
            wood = curSize;
            curSize = 0;
            player.addWood(wood);
        }
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
