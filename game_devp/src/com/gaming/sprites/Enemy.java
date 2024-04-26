package com.gaming.sprites;

//import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Enemy extends Sprite {
    
    public Enemy(int x,int speed)
    {
        y=50;
        this.x=x;
        this.speed=speed;
        w=250;
        h=250;
        image= new ImageIcon(Enemy.class.getResource("spider-enemy.gif"));
    }
    public void move()
    {    if (y>900)
          { y=0;
          }
        y=y+speed;
    }
    
}
