package com.company;

import java.awt.*;
import java.util.ArrayList;

public class Oval {
    double x, y, h, w;
    int a, b,c;

    ArrayList<Oval> ovals;


    public Oval(double x, double y, double h, double w, int a, int b, int c) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.a = a;
        this.b = b;
        this.c =c;

    }
    void paint(Graphics g){
        Color color = new Color(a, b,c );
        g.setColor(color);
        g.fillOval((int)(x-w/2), (int)(y-h/2), (int)w, (int)h);

    }


}
