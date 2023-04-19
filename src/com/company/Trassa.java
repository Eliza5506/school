package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Trassa {
    BufferedImage bufferedImage2 = ImageIO.read(new File("C:\\Users\\hp\\IdeaProjects\\liza\\out\\production\\liza\\com\\company\\img.png"));
    BufferedImage bufferedImage3 = ImageIO.read(new File("C:\\Users\\hp\\IdeaProjects\\liza\\out\\production\\liza\\com\\company\\img.png"));
    Image image2 = bufferedImage2.getScaledInstance(800, 1048, Image.SCALE_DEFAULT);
    Image image3 = bufferedImage3.getScaledInstance(800, 1050, Image.SCALE_DEFAULT);
    double x2;
    double y2;

    public Trassa(double x2, double y2) throws IOException {
        this.x2 = x2;
        this.y2 = y2;
    }

    void setY(double y2) {
        this.y2 = y2;
    }

    public double getY() {
        return y2;
    }

    void paint2(Graphics g) {
        g.drawImage(this.image2, (int) x2, (int) y2, null);
    }

    void paint3(Graphics g) {
        g.drawImage(this.image3, (int) x2, (int) y2, null);
    }
}



