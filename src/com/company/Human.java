package com.company;

import java.awt.*;

public class Human {

    int x;
    int y;
    int x2, y2;
    int height;
    String name;

    public Human(int x, int y, int x2, int y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }

    // Этот метод реализует в человечке навык "нарисуй себя"
    // аргумент этого метода - холст на котором человечек может себя нарисовать
    void paint(Graphics g) {
        g.drawLine(x, y, x2, y2);
        //g.drawRect(x, y, 50, height);
       // g.drawString(name, x, y);
    }
}