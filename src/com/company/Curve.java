package com.company;

import java.awt.*;
import java.util.ArrayList;

public class Curve {
    int a, b,c;
    double x, y, h, w;
    ArrayList<Point> points;
    public Curve(ArrayList<Point> points){
        this.points = points;
    }
    void paint(Graphics g){
        Color color = new Color(a, b,c );
        g.setColor(color);
        g.fillOval((int)(x-w/2), (int)(y-h/2), (int)w, (int)h);

    }
}
