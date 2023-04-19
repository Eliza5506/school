package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class proj2  extends JPanel implements KeyEventDispatcher{ //  панели
    proj trassa;
  proj car;
    public proj2(proj trassa, proj car) {
        this.trassa = trassa;
        this.car = car;
    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        trassa.paint(g);
        car.paint(g);
    }


    @Override
    public boolean dispatchKeyEvent(KeyEvent e) {
        System.out.println("EVENT HAPPENED!");
        // С помощью e.getID() можно выяснить что за событие случилось? нажали кнопку? или отпустили? или какой-то typed? как думаете что это?
        String typeOfEvent = "unknown";
        if (e.getID() == KeyEvent.KEY_PRESSED) {
            typeOfEvent = "pressed";
        } else if (e.getID() == KeyEvent.KEY_RELEASED) {
            typeOfEvent = "released";
        } else if (e.getID() == KeyEvent.KEY_TYPED) {
            typeOfEvent = "typed";
        }
        // С помощью e.getKeyCode() можно выяснить а не пробел ли был нажат? аналогично можно для ENTER и других кнопок
        String key = "unknown";
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            key = "RIGHT";
            car.updateRIGHT();
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            key = "LEFT";
            car.updateLEFT();
        }
        System.out.println("type=" + typeOfEvent + " keyCode=" + key);
        return false;
    }
}