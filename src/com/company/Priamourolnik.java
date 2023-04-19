package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Priamourolnik {
    Priamourolnik carRectangle;
    Priamourolnik bombRectangle1;
    Priamourolnik bombRectangle;
    double xn;//xn - левый верхний
    double yn;//xn - левый верхний
    double xk;//xk - правый нижний
    double yk;//yk - правый нижний

    public Priamourolnik(double xn, double yn, double xk, double yk) throws IOException {
        this.xn = xn;
        this.yn = yn;
        this.xk = xk;
        this.yk = yk;
    }

    boolean peresechenie(Priamourolnik drugoi) {
        boolean is_intersects;
        if ((max(this.xn, this.xk) < min(drugoi.xn, drugoi.xk)) || (min(this.xn, this.xk) > max(drugoi.xn, drugoi.xk))) {
            is_intersects = false;
        } else if ((max(this.yn, this.yk) < min(drugoi.yn, drugoi.yk)) || (min(this.yn, this.yk) > max(drugoi.yn, drugoi.yk))) {
            is_intersects = false;
        } else {
            is_intersects = true; // пересекаются
            }
            return is_intersects;
        } }
