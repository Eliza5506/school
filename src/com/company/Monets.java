package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Monets {
    BufferedImage bufferedImage = ImageIO.read(new File("C:\\Users\\hp\\IdeaProjects\\liza\\src\\com\\company\\монетка.png"));
    Image image5 = bufferedImage.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    double x5;
    double y5;
    boolean vzorvana = true;

    public Monets(double x5, double y5, boolean vzorvana) throws IOException {
        this.x5 = x5;
        this.y5 = y5;
        this.vzorvana = vzorvana;
    }

    void setY(double y5) {
        this.y5 = y5;
    }

    public double getY() {
        return (double) y5;
    }

    void paint4(Graphics g) {
        if (vzorvana != true) {
            g.drawImage(this.image5, (int) x5, (int) y5, null);
        }
    }
}


