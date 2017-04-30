package gameobjects;

import static gameobjects.Resource.TYPE_SMALL;
import javax.swing.ImageIcon;

/**
 *
 * @author d.holmberg
 */
public class Stone extends Resource{

    public Stone(int x, int y, int type) {
        super(x, y);
        if (type == TYPE_SMALL) {
            setMaxSize(25);
            setRechargeRate(1);
            setSize(25, 25);
            this.setGraphic(new ImageIcon("src\\graphics\\stone_small.png"));
        }
        if (type == TYPE_MID) {
            setMaxSize(50);
            setRechargeRate(2);
            setSize(50, 50);
            this.setGraphic(new ImageIcon("src\\graphics\\stone_mid.png"));
        }
        if (type == TYPE_LARGE) {
            setMaxSize(100);
            setRechargeRate(4);
            setSize(75, 75);
            this.setGraphic(new ImageIcon("src\\graphics\\stone_large.png"));
        }
    }

    @Override
    void harvest(Player player) {
    int stone = 0;
        if(curSize <= 0){
            System.out.println("Resouce empty!");
            return;
        }
        
        else if (player.getTool() == Player.TOOL_AXE_WOOD) stone = 1;
        else if (player.getTool() == Player.TOOL_AXE_STONE) stone = 2;
        else{
            System.out.println("Wrong tool!");
            return;
        }
        
        if(curSize - stone >= 0){
            curSize -= stone;
            player.addWood(stone);
        }
        else {
            stone = curSize;
            curSize = 0;
            player.addWood(stone);
        }
    }


    //----Variables-----------


    
    //----Object-Methods-------

    @Override
    public  Object clone() throws CloneNotSupportedException {
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
