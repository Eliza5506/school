package com.company;

public class Fraction {
    int numerator;
    int denominator;
    Fraction(){
        numerator = 1;
        denominator = 1;

    }
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
    Fraction(int numerator, int denominator){
        if (denominator == 0){
            this.denominator = 1;
        } else{
            this.denominator = denominator;
        }
        if (denominator < 0){
            this.denominator = -denominator;
            this.numerator = -numerator;
        } else{
            this.denominator = denominator;
            this.numerator = numerator;
        }
    }
    void x(int a){
        this.denominator = denominator;
        this.numerator = numerator;
        numerator= numerator*a;
    }
    void x(Fraction a){
        this.denominator = denominator;
        this.numerator = numerator;
        denominator = denominator*a.denominator;
        numerator = numerator*a.numerator;
    }
    void plus(int a) {
        numerator += a * denominator;
    }

    public void plus(Fraction a) {
        int x = a.numerator * this.denominator;
        numerator = numerator * a.denominator + x;
        denominator *= a.denominator;
        m(this);

    }
    void m(Fraction a) {
        for (int i = Math.min(a.denominator, a.numerator); i > 1; i--) {
            if (a.numerator % i == 0 && a.denominator % i == 0) {
                a.numerator /= i;
                a.denominator /= i;
            }
        }
    }
    public Fraction sum(int a) {
        Fraction x = new Fraction(numerator, denominator);
        x.plus(a);
        m(x);
        return x;
    }

    public Fraction sum(Fraction f2) {
        Fraction f1 = new Fraction(numerator, denominator);
        f1.plus(f2);
        m(f1);
        return f1;
    }
}