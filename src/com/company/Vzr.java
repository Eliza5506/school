package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Vzr {
    BufferedImage bufferedImage = ImageIO.read(new File("C:\\Users\\hp\\IdeaProjects\\liza\\out\\production\\liza\\com\\company\\взрыв.jpg"));
    Image image6 = bufferedImage.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    double x6;
    double y6;

    public Vzr(double x6, double y6) throws IOException {
        this.x6 = x6;
        this.y6 = y6;
    }

    void paint6(Graphics g) {
        g.drawImage(this.image6, (int) x6, (int) y6, null);
    }
    //boolean peresechenie(Priamourolnik drugoi){//
    // if (carRectangle.is_intersects(bombRectangle1)) { System.out.println("BOOM!"); }//return
}

