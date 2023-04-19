package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Proig {
    BufferedImage bufferedImage = ImageIO.read(new File("C:\\Users\\hp\\IdeaProjects\\liza\\out\\production\\liza\\com\\company\\img_4.png"));
    Image image8 = bufferedImage.getScaledInstance(1600, 800, Image.SCALE_DEFAULT);
    double x8;
    double y8;

    public Proig(double x8, double y8) throws IOException {
        this.x8 = x8;
        this.y8 = y8;
    }

    void paint8(Graphics g) {
        g.drawImage(this.image8, (int) x8, (int) y8, null);
    }
}