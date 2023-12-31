package world;

import java.awt.Color;
import java.awt.Graphics;

public class Bullet extends Box {
    
    public int dir=1,speed=8;
    public int frames=0;

    public Bullet(int x,int y,int dir) {
        super(x,y,10,5);
        this.dir=dir;
    }

    public void tick(){

        if (frames==30){
            World.bullets.remove(this);
        }

        if (World.isFree(this)) {
            x+=speed*dir;
        }
        else {
            World.bullets.remove(this);
        }
        frames++;
    } 

    public void render(Graphics g){
        g.setColor(Color.red);
        g.fillOval(x, y, 10, 10);

    }
}
