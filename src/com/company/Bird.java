package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class Bird {
    BufferedImage image;
    double x;
    double y;
    public Bird(double x, double y) throws IOException {
        this.x = x;
        this.y = y;
        this.image = ImageIO.read(new File("C:\\Users\\hp\\IdeaProjects\\liza\\src\\bird.png"));
    }
    void updateDOWN(){
        y+=3;
    }
    void updateUP(){
        y-=3;
    }
    void updateRIGHT(){
        x+=3;
    }
    void updateLEFT(){
        x-=3;
    }
    void paint(Graphics g){
        g.drawOval((int)(x-5), (int)(y-5), 10, 10);
        g.drawImage(this.image, (int)x, (int)y, null);
    }
}