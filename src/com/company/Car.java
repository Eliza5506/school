package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Car {
    BufferedImage bufferedImage = ImageIO.read(new File("C:\\Users\\hp\\IdeaProjects\\liza\\src\\com\\company\\Машинка.png"));
    Image image1 = bufferedImage.getScaledInstance(220, 220, Image.SCALE_DEFAULT);
    double x;
    double y;
    long a = System.currentTimeMillis();
    final long b = a;
    int n = 0;

    public Car(double x, double y) throws IOException {
        this.x = x;
        this.y = y;
    }

    void updateRIGHT() {
        if (x > 530) {
            System.out.print("");
        } else if (x < 530 && x > 380) {
            x = 660;
        } else if (x < 380) {
            x = 400;
        }
    }

    void updateLEFT() {
        if (x < 270) {
            System.out.print("");
        } else if (x > 380 && x < 530) {
            x = 140;
        } else if (x > 520) {
            x = 400;
        }
    }

    void paint1(Graphics g) {
        g.drawImage(this.image1, (int) x, (int) y, null);
    }
}