package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;

public class CarPanel extends JPanel implements KeyEventDispatcher {// наследуемся от базовой панели
    Trassa trassa;
    Trassa trassa2;
    Car car;
    ArrayList<Bomba> bombas;
    ArrayList<Monets> monets;
    Vzr vzr;
    ArrayList<Zvezda> zvezdas;
    Otr otr;
    Proig proig;
    TextField text;
    Dizain Nasty;
    int a;
    Travka travka;
    Travka travka2;

    public CarPanel(Car car, Trassa trassa, Trassa trassa2, ArrayList<Bomba> bombas, ArrayList<Monets> monets, Vzr vzr, ArrayList<Zvezda> zvezdas, Otr otr, Proig proig, TextField text, Dizain Nasty, Travka travka, Travka travka2) {
        this.car = car;
        this.trassa = trassa;
        this.trassa2 = trassa2;
        this.bombas = bombas;
        this.monets = monets;
        this.vzr = vzr;
        this.zvezdas = zvezdas;
        this.otr = otr;
        this.proig = proig;
        this.text = text;
        this.Nasty = Nasty;
        this.travka = travka;
        this.travka2 = travka2;
    }

    protected void paintComponent(Graphics g) {
        a = a + 1;
        super.paintComponent(g);
        travka.paint2(g);
        travka2.paint3(g);
        trassa.paint2(g);
        trassa2.paint3(g);
        Nasty.paint10(g);
        if (a < 10000) {

            if (trassa.y2 <= 1048) {
                trassa.setY(trassa.getY() + 1);
            } else {
                trassa.y2 = -1048;
                trassa.setY(trassa.getY() + 3);
            }
            if (trassa2.y2 <= 1048) {
                trassa2.setY(trassa2.getY() + 1);
            } else {
                trassa2.y2 = -1048;
                trassa2.setY(trassa2.getY() + 3);
            }
            for (int i = 0; i < bombas.size(); i++) {
                bombas.get(i).paint4(g);
                if (bombas.get(i).y4 <= 1048) {
                    bombas.get(i).setY(bombas.get(i).getY() + 1);
                } else {
                    bombas.get(i).y4 = -6288;
                    bombas.get(i).setY(bombas.get(i).getY() + 2);
                }


            }
            for (int i = 0; i < monets.size(); i++) {
                monets.get(i).paint4(g);
                if (monets.get(i).y5 <= 1048) {
                    monets.get(i).setY(monets.get(i).getY() + 1);
                } else {
                    monets.get(i).y5 = -1048;
                    monets.get(i).setY(monets.get(i).getY() + 2);
                }
            }
        }


        if (a >= 10000 && a < 20000) {
            if (trassa.y2 <= 1048) {
                trassa.setY(trassa.getY() + 1.1);
            } else {
                trassa.y2 = -1048;
                trassa.setY(trassa.getY() + 3.1);
            }
            if (trassa2.y2 <= 1048) {
                trassa2.setY(trassa2.getY() + 1.1);
            } else {
                trassa2.y2 = -1048;
                trassa2.setY(trassa2.getY() + 3.1);
            }
            for (int i = 0; i < bombas.size(); i++) {
                bombas.get(i).paint4(g);
                if (bombas.get(i).y4 <= 1048) {
                    bombas.get(i).setY(bombas.get(i).getY() + 1.1);
                } else {
                    bombas.get(i).y4 = -1048;
                    bombas.get(i).setY(bombas.get(i).getY() + 2.1);
                }
            }
            for (int i = 0; i < monets.size(); i++) {
                monets.get(i).paint4(g);
                if (monets.get(i).y5 <= 1048) {
                    monets.get(i).setY(monets.get(i).getY() + 1.1);
                } else {
                    monets.get(i).y5 = -1048;
                    monets.get(i).setY(monets.get(i).getY() + 2.1);
                }
            }
        }
        if (a >= 20000 && a < 30000) {
            if (trassa.y2 <= 1048) {
                trassa.setY(trassa.getY() + 1.2);
            } else {
                trassa.y2 = -1048;
                trassa.setY(trassa.getY() + 3.2);
            }
            if (trassa2.y2 <= 1048) {
                trassa2.setY(trassa2.getY() + 1.2);
            } else {
                trassa2.y2 = -1048;
                trassa2.setY(trassa2.getY() + 3.2);
            }
            for (int i = 0; i < bombas.size(); i++) {
                bombas.get(i).paint4(g);
                if (bombas.get(i).y4 <= 1048) {
                    bombas.get(i).setY(bombas.get(i).getY() + 1.2);
                } else {
                    bombas.get(i).y4 = -1048;
                    bombas.get(i).setY(bombas.get(i).getY() + 2.2);
                }
            }
            for (int i = 0; i < monets.size(); i++) {
                monets.get(i).paint4(g);
                if (monets.get(i).y5 <= 1048) {
                    monets.get(i).setY(monets.get(i).getY() + 1.2);
                } else {
                    monets.get(i).y5 = -1048;
                    monets.get(i).setY(monets.get(i).getY() + 2.2);
                }
            }
        }


        if (a >= 30000 && a < 40000) {
            if (trassa.y2 <= 1048) {
                trassa.setY(trassa.getY() + 1.3);
            } else {
                trassa.y2 = -1048;
                trassa.setY(trassa.getY() + 3.3);
            }
            if (trassa2.y2 <= 1048) {
                trassa2.setY(trassa2.getY() + 1.3);
            } else {
                trassa2.y2 = -1048;
                trassa2.setY(trassa2.getY() + 3.3);
            }
            for (int i = 0; i < bombas.size(); i++) {
                bombas.get(i).paint4(g);
                if (bombas.get(i).y4 <= 1048) {
                    bombas.get(i).setY(bombas.get(i).getY() + 1.3);
                } else {
                    bombas.get(i).y4 = -1048;
                    bombas.get(i).setY(bombas.get(i).getY() + 2.3);
                }
            }
            for (int i = 0; i < monets.size(); i++) {
                monets.get(i).paint4(g);
                if (monets.get(i).y5 <= 1048) {
                    monets.get(i).setY(monets.get(i).getY() + 1.3);
                } else {
                    monets.get(i).y5 = -1048;
                    monets.get(i).setY(monets.get(i).getY() + 2.3);
                }
            }
        }


        if (a >= 40000 && a < 50000) {
            if (trassa.y2 <= 1048) {
                trassa.setY(trassa.getY() + 1.4);
            } else {
                trassa.y2 = -1048;
                trassa.setY(trassa.getY() + 3.4);
            }
            if (trassa2.y2 <= 1048) {
                trassa2.setY(trassa2.getY() + 1.4);
            } else {
                trassa2.y2 = -1048;
                trassa2.setY(trassa2.getY() + 3.4);
            }
            for (int i = 0; i < bombas.size(); i++) {
                bombas.get(i).paint4(g);
                if (bombas.get(i).y4 <= 1048) {
                    bombas.get(i).setY(bombas.get(i).getY() + 1.4);
                } else {
                    bombas.get(i).y4 = -1048;
                    bombas.get(i).setY(bombas.get(i).getY() + 2.4);
                }
            }
            for (int i = 0; i < monets.size(); i++) {
                monets.get(i).paint4(g);
                if (monets.get(i).y5 <= 1048) {
                    monets.get(i).setY(monets.get(i).getY() + 1.4);
                } else {
                    monets.get(i).y5 = -1048;
                    monets.get(i).setY(monets.get(i).getY() + 2.4);
                }
            }
        }
        if (a >= 50000 && a < 60000) {
            if (trassa.y2 <= 1048) {
                trassa.setY(trassa.getY() + 1.5);
            } else {
                trassa.y2 = -1048;
                trassa.setY(trassa.getY() + 3.5);
            }
            if (trassa2.y2 <= 1048) {
                trassa2.setY(trassa2.getY() + 1.5);
            } else {
                trassa2.y2 = -1048;
                trassa2.setY(trassa2.getY() + 3.5);
            }
            for (int i = 0; i < bombas.size(); i++) {
                bombas.get(i).paint4(g);
                if (bombas.get(i).y4 <= 1048) {
                    bombas.get(i).setY(bombas.get(i).getY() + 1.5);
                } else {
                    bombas.get(i).y4 = -1048;
                    bombas.get(i).setY(bombas.get(i).getY() + 2.5);
                }
            }
            for (int i = 0; i < monets.size(); i++) {
                monets.get(i).paint4(g);
                if (monets.get(i).y5 <= 1048) {
                    monets.get(i).setY(monets.get(i).getY() + 1.5);
                } else {
                    monets.get(i).y5 = -1048;
                    monets.get(i).setY(monets.get(i).getY() + 2.5);
                }
            }
        }


        if (a >= 60000 && a < 70000) {
            if (trassa.y2 <= 1048) {
                trassa.setY(trassa.getY() + 1.6);
            } else {
                trassa.y2 = -1048;
                trassa.setY(trassa.getY() + 3.6);
            }
            if (trassa2.y2 <= 1048) {
                trassa2.setY(trassa2.getY() + 1.6);
            } else {
                trassa2.y2 = -1048;
                trassa2.setY(trassa2.getY() + 3.6);
            }
            for (int i = 0; i < bombas.size(); i++) {
                bombas.get(i).paint4(g);
                if (bombas.get(i).y4 <= 1048) {
                    bombas.get(i).setY(bombas.get(i).getY() + 1.6);
                } else {
                    bombas.get(i).y4 = -1048;
                    bombas.get(i).setY(bombas.get(i).getY() + 2.6);
                }
            }
            for (int i = 0; i < monets.size(); i++) {
                monets.get(i).paint4(g);
                if (monets.get(i).y5 <= 1048) {
                    monets.get(i).setY(monets.get(i).getY() + 1.6);
                } else {
                    monets.get(i).y5 = -1048;
                    monets.get(i).setY(monets.get(i).getY() + 2.6);
                }
            }
        }


        if (a >= 70000 && a < 80000) {
            if (trassa.y2 <= 1048) {
                trassa.setY(trassa.getY() + 1.7);
            } else {
                trassa.y2 = -1048;
                trassa.setY(trassa.getY() + 3.7);
            }
            if (trassa2.y2 <= 1048) {
                trassa2.setY(trassa2.getY() + 1.7);
            } else {
                trassa2.y2 = -1048;
                trassa2.setY(trassa2.getY() + 3.7);
            }
            for (int i = 0; i < bombas.size(); i++) {
                bombas.get(i).paint4(g);
                if (bombas.get(i).y4 <= 1048) {
                    bombas.get(i).setY(bombas.get(i).getY() + 1.7);
                } else {
                    bombas.get(i).y4 = -1048;
                    bombas.get(i).setY(bombas.get(i).getY() + 2.7);
                }
            }
            for (int i = 0; i < monets.size(); i++) {
                monets.get(i).paint4(g);
                if (monets.get(i).y5 <= 1048) {
                    monets.get(i).setY(monets.get(i).getY() + 1.7);
                } else {
                    monets.get(i).y5 = -1048;
                    monets.get(i).setY(monets.get(i).getY() + 2.7);
                }
            }
        }
        if (a >= 80000 && a < 90000) {
            if (trassa.y2 <= 1048) {
                trassa.setY(trassa.getY() + 1.8);
            } else {
                trassa.y2 = -1048;
                trassa.setY(trassa.getY() + 3.8);
            }
            if (trassa2.y2 <= 1048) {
                trassa2.setY(trassa2.getY() + 1.8);
            } else {
                trassa2.y2 = -1048;
                trassa2.setY(trassa2.getY() + 3.8);
            }
            for (int i = 0; i < bombas.size(); i++) {
                bombas.get(i).paint4(g);
                if (bombas.get(i).y4 <= 1048) {
                    bombas.get(i).setY(bombas.get(i).getY() + 1.8);
                } else {
                    bombas.get(i).y4 = -1048;
                    bombas.get(i).setY(bombas.get(i).getY() + 2.8);
                }
            }
            for (int i = 0; i < monets.size(); i++) {
                monets.get(i).paint4(g);
                if (monets.get(i).y5 <= 1048) {
                    monets.get(i).setY(monets.get(i).getY() + 1.8);
                } else {
                    monets.get(i).y5 = -1048;
                    monets.get(i).setY(monets.get(i).getY() + 2.8);
                }
            }
        }


        if (a >= 90000 && a < 100000) {
            if (trassa.y2 <= 1048) {
                trassa.setY(trassa.getY() + 1.9);
            } else {
                trassa.y2 = -1048;
                trassa.setY(trassa.getY() + 3.9);
            }
            if (trassa2.y2 <= 1048) {
                trassa2.setY(trassa2.getY() + 1.9);
            } else {
                trassa2.y2 = -1048;
                trassa2.setY(trassa2.getY() + 3.9);
            }
            for (int i = 0; i < bombas.size(); i++) {
                bombas.get(i).paint4(g);
                if (bombas.get(i).y4 <= 1048) {
                    bombas.get(i).setY(bombas.get(i).getY() + 1.9);
                } else {
                    bombas.get(i).y4 = -1048;
                    bombas.get(i).setY(bombas.get(i).getY() + 2.9);
                }
            }
            for (int i = 0; i < monets.size(); i++) {
                monets.get(i).paint4(g);
                if (monets.get(i).y5 <= 1048) {
                    monets.get(i).setY(monets.get(i).getY() + 1.9);
                } else {
                    monets.get(i).y5 = -1048;
                    monets.get(i).setY(monets.get(i).getY() + 2.9);
                }
            }
        }


        if (a >= 100000) {
            if (trassa.y2 <= 1048) {
                trassa.setY(trassa.getY() + 2);
            } else {
                trassa.y2 = -1048;
                trassa.setY(trassa.getY() + 4);
            }
            if (trassa2.y2 <= 1048) {
                trassa2.setY(trassa2.getY() + 2);
            } else {
                trassa2.y2 = -1048;
                trassa2.setY(trassa2.getY() + 4);
            }
            for (int i = 0; i < bombas.size(); i++) {
                bombas.get(i).paint4(g);
                if (bombas.get(i).y4 <= 1048) {
                    bombas.get(i).setY(bombas.get(i).getY() + 2);
                } else {
                    bombas.get(i).y4 = -1048;
                    bombas.get(i).setY(bombas.get(i).getY() + 3);
                }
            }
            for (int i = 0; i < monets.size(); i++) {
                monets.get(i).paint4(g);
                if (monets.get(i).y5 <= 1048) {
                    monets.get(i).setY(monets.get(i).getY() + 2);
                } else {
                    monets.get(i).y5 = -1048;
                    monets.get(i).setY(monets.get(i).getY() + 3);
                }
            }
        }
        car.paint1(g);
        try {
            otr.paintComponent1(g);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (zvezdas.get(0).p >= 3) {
            zvezdas.get(0).paint7(g);
            zvezdas.get(1).paint7(g);
            zvezdas.get(2).paint7(g);
        }
        if (zvezdas.get(0).p == 2) {
            zvezdas.get(0).paint7(g);
            zvezdas.get(1).paint7(g);
        }
        if (zvezdas.get(0).p == 1) {
            zvezdas.get(0).paint7(g);
        }
        if (zvezdas.get(0).p <= 0) {
            proig.paint8(g);
            text.p = 0;

        }
        text.paint9(g);

    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent e) {
        System.out.println("EVENT HAPPENED!");        // С помощью e.getID() можно выяснить что за событие случилось? нажали кнопку? или отпустили? или какой-то typed? как думаете что это?
        String typeOfEvent = "unknown";
        if (e.getID() == KeyEvent.KEY_PRESSED) {
            typeOfEvent = "pressed";
        } else if (e.getID() == KeyEvent.KEY_RELEASED) {
            typeOfEvent = "released";
        } else if (e.getID() == KeyEvent.KEY_TYPED) {
            typeOfEvent = "typed";
        }        // С помощью e.getKeyCode() можно выяснить а не пробел ли был нажат? аналогично можно для ENTER и других кнопок
        String key = "unknown";
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

            key = "RIGHT";
            if (e.getID() == KeyEvent.KEY_PRESSED) {
                car.updateRIGHT();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            key = "LEFT";
            if (e.getID() == KeyEvent.KEY_PRESSED) {
                car.updateLEFT();
            }
        }
        System.out.println("type=" + typeOfEvent + " keyCode=" + key);
        return false;
    }
}