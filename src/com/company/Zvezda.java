package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Zvezda {
    public static boolean n = true;
    BufferedImage bufferedImage = ImageIO.read(new File("C:\\Users\\hp\\IdeaProjects\\liza\\src\\com\\company\\сердце.png"));
    Image image7 = bufferedImage.getScaledInstance(100, 100, Image.SCALE_DEFAULT);

    double x;
    double y;
    int p = 3;

    public Zvezda(double x, double y, boolean n) throws IOException {
        this.x = x;
        this.y = y;
        this.n = n;
    }


    void paint7(Graphics g) {

        g.drawImage(this.image7, (int) x, (int) y, null);
    }
}