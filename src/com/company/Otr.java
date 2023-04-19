package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;

public class Otr extends JPanel {
    Otr otr;
    Trassa trassa;
    Trassa trassa2;
    Car car;
    ArrayList<Bomba> bombas;
    ArrayList<Monets> monets;
    Vzr vzr;
    ArrayList<Zvezda> zvezdas;
    Priamourolnik carRectangle;
    Priamourolnik bombRectangle;
    Priamourolnik bombRectangle1;
    long a;
    long b;
    Proig proig;
    long c;
    long d;
    TextField text;
    Dizain Nasty;
    Travka travka;
    Travka travka2;
    public Otr(Car car, Trassa trassa, Trassa trassa2, ArrayList<Bomba> bombas, ArrayList<Monets> monets, Vzr vzr, ArrayList<Zvezda> zvezdas, Proig proig, TextField text, Dizain Nasty, Travka travka, Travka travka2) {
        this.car = car;
        this.trassa = trassa;
        this.trassa2 = trassa2;
        this.bombas = bombas;
        this.monets = monets;
        this.vzr = vzr;
        this.zvezdas = zvezdas;
        this.proig = proig;
        this.text = text;
        this.Nasty = Nasty;
        this.travka = travka;
        this.travka2 = travka2;
    }


    protected void paintComponent1(Graphics g) throws IOException {
        super.paintComponent(g);
        Priamourolnik carRectangle = new Priamourolnik(car.x, car.y, car.x + 200, car.y + 200);
        for (int i = 0; i < bombas.size(); i++) {
            Priamourolnik bombRectangle = new Priamourolnik(bombas.get(i).x4, bombas.get(i).y4, bombas.get(i).x4 + 200, bombas.get(i).y4 + 200);
            bombRectangle.peresechenie(carRectangle);
            if (carRectangle.peresechenie(bombRectangle)) {
                if (bombas.get(i).vzorvana == false) {
                    bombas.get(i).vzorvana = true;
                    zvezdas.get(0).p = zvezdas.get(0).p - 1;
                    a = System.currentTimeMillis();
                    b = a;
                }
            }
            if (bombas.get(i).vzorvana == true && b < a + 2000) {
                System.out.println("b: " + a);
                vzr.paint6(g);
                b = b + 100;
                if (b < a + 105) {
                    bombas.get(i).y4 = bombas.get(i).y4 - 7336;
                    bombas.get(i).vzorvana = false;
                }
            }
        }
        Priamourolnikmonets carRectanglemonets = new Priamourolnikmonets(car.x, car.y, car.x + 200, car.y + 200);
        for (int i = 0; i < monets.size(); i++) {
            Priamourolnikmonets montRectangle = new Priamourolnikmonets(monets.get(i).x5, monets.get(i).y5, monets.get(i).x5 + 200, monets.get(i).y5 + 200);
            montRectangle.peresecheniemonets(carRectanglemonets);
            if (carRectanglemonets.peresecheniemonets(montRectangle)) {
                if (monets.get(i).vzorvana == false) {
                    monets.get(i).vzorvana = true;
                    if (zvezdas.get(0).p < 3) {
                        zvezdas.get(0).p = zvezdas.get(0).p + 1;
                    }
                    c = System.currentTimeMillis();
                    d = c;
                }
            }
            if (monets.get(i).vzorvana == true && d < c + 2000) {
                d = d + 100;
                if (d < c + 105) {
                    monets.get(i).y5 = monets.get(i).y5 + 1048;
                    monets.get(i).vzorvana = false;
                    if (monets.get(0).x5 == 140) {
                        monets.get(0).x5 = 660;
                    }
                    if (monets.get(0).x5 == 400) {
                        monets.get(0).x5 = 140;
                    }
                    if (monets.get(0).x5 == 660) {
                        monets.get(0).x5 = 400;
                    }
                }
            }
        }

    }
}