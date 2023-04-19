package com.company;
import java.awt.*;
public class Ball {
    double x, y, r;
    int width, height;
    public Ball(int x, int y, int r){
        this.x=x;
        this.y=y;
        this.r = r;
    }
    public void paint(Graphics g){
        g.drawOval((int)(x-r), (int)(y-r), (int)(2*r), (int)(2*r));
    }
    void update(int width, int height){
        y = (y+0.1)%width;
    }
}