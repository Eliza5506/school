package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class proj {
    BufferedImage image;
    double x;
    double y;
    public proj(double x, double y) throws IOException {
        this.x = x;
        this.y = y;
        this.image = ImageIO.read(new File("C:\\Users\\hp\\IdeaProjects\\liza\\src\\com\\company\\1637102121_9-gamerwall-pro-p-tekstura-dorogi-s-razmetkoi-besshovnaya-ob-12.png"));
        this.image = ImageIO.read(new File("C:\\Users\\hp\\IdeaProjects\\liza\\src\\com\\company\\png-clipart-red-sedan-car-door-car-seat-top-view-motor-vehicle-red-car-top-view-orange-car-seat.png"));
    }

    void updateRIGHT(){
        x+=3;
    }
    void updateLEFT(){
        x-=3;
    }
    void paint(Graphics g){

        g.drawImage(this.image, (int)x, (int)y, null);
    }
}