package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Dizain {
    BufferedImage bufferedImage = ImageIO.read(new File("C:\\Users\\hp\\IdeaProjects\\liza\\src\\com\\company\\Пони.png"));
    Image image10 = bufferedImage.getScaledInstance(300, 300, Image.SCALE_DEFAULT);
    double x10;
    double y10;

    public Dizain(double x10, double y10) throws IOException {
        this.x10 = x10;
        this.y10 = y10;
    }

    void paint10(Graphics g) {
        g.drawImage(this.image10, (int) x10, (int) y10, null);
    }
}
