package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TextField {
    int a = 0;
    double x, y;
    int p = 3;
    int s = 20;

    public TextField(double x, double y) throws IOException {
        this.x = x;
        this.y = y;
    }

    void paint9(Graphics g) {
        if (p == 0) {
            String b = String.valueOf(a);
            g.setFont(new Font(b, Font.PLAIN, 50));
            g.setColor(Color.red);
            g.drawString(b, 700, 700);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
            g.drawString("Ваш результат", 600, 640);
        }
        if (p != 0){
            a = a + 1;
            String b = String.valueOf(a);
            g.setColor(Color.yellow);
            g.setFont(new Font(b, Font.PLAIN, 50));
            g.drawString(b, 1000, 100);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
            g.drawString("Очки:", 1000, 40);
        if (a<10000){
            g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
            g.drawString("Скорость: 20 км/ч", 1000, 180);
}
        if (a>=10000 && a<20000){
                g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
                g.drawString("Скорость: 25 км/ч", 1000, 200);
            }
            if (a>=20000 && a<30000){
                g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
                g.drawString("Скорость: 30 км/ч", 1000, 200);
            }
            if (a>=30000 && a<40000){
                g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
                g.drawString("Скорость: 35 км/ч", 1000, 200);
            }
            if (a>=40000 && a<50000){
                g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
                g.drawString("Скорость: 40 км/ч", 1000, 200);
            }
            if (a>=50000 && a<60000){
                g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
                g.drawString("Скорость: 45 км/ч", 1000, 200);
            }
            if (a>=60000 && a<70000){
                g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
                g.drawString("Скорость: 50 км/ч", 1000, 200);
            }
            if (a>=70000 && a<80000){
                g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
                g.drawString("Скорость: 55 км/ч", 1000, 200);
            }
            if (a>=80000 && a<90000){
                g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
                g.drawString("Скорость: 60 км/ч", 1000, 200);
            }
            if (a>=90000 && a<100000){
                g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
                g.drawString("Скорость: 65 км/ч", 1000, 200);
            }
            if (a>=100000){
                g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
                g.drawString("Скорость: 70 км/ч", 1000, 200);
            }
        }

    }
}