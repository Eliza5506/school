package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Bomba {
    BufferedImage bufferedImage = ImageIO.read(new File("C:\\Users\\hp\\IdeaProjects\\liza\\src\\com\\company\\бомба.png"));
    Image image4 = bufferedImage.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    BufferedImage bufferedImage1 = ImageIO.read(new File("C:\\Users\\hp\\IdeaProjects\\liza\\src\\com\\company\\бомба.png"));
    Image image1 = bufferedImage1.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    double x4;
    double y4;
    boolean vzorvana = true;

    public Bomba(double x4, double y4, boolean vzorvana) throws IOException {
        this.x4 = x4;
        this.y4 = y4;
        this.vzorvana = vzorvana;
    }

        void setY(double y4) {
            this.y4 = y4;    }

        public double getY() {
            return (double) y4;    }

        void paint4(Graphics g) {
            //   System.currentTimeMillis() - момент в которой бомба взорвана. Делать проверку, посмотреть склолько секунд прошло. Сделать третий if когда рисуется взрыв        }
               g.drawImage(this.image4, (int) x4, (int) y4, null);    }
        }


