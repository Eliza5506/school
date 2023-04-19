package com.company;

import java.io.IOException;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Priamourolnikmonets {
    Priamourolnikmonets carRectanglemonets;
    Priamourolnikmonets montRectangle1;
    Priamourolnikmonets montRectangle;
    double xn;//xn - левый верхний
    double yn;//xn - левый верхний
    double xk;//xk - правый нижний
    double yk;//yk - правый нижний

    public Priamourolnikmonets(double xn, double yn, double xk, double yk) throws IOException {
        this.xn = xn;
        this.yn = yn;
        this.xk = xk;
        this.yk = yk;
    }

    boolean peresecheniemonets(Priamourolnikmonets drugoimonets) {
        boolean is_intersects;
        if ((max(this.xn, this.xk) < min(drugoimonets.xn, drugoimonets.xk)) || (min(this.xn, this.xk) > max(drugoimonets.xn, drugoimonets.xk))) {
            is_intersects = false;
        } else if ((max(this.yn, this.yk) < min(drugoimonets.yn, drugoimonets.yk)) || (min(this.yn, this.yk) > max(drugoimonets.yn, drugoimonets.yk))) {
            is_intersects = false;
        } else {
            is_intersects = true; // пересекаются
        }
        return is_intersects;
    }
}