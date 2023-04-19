package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class BirdPanel extends JPanel implements KeyEventDispatcher{ // наследуемся от базовой панели
    Bird bird;
    public BirdPanel(Bird bird) {
        this.bird = bird;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        bird.paint(g);
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
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            key = "UP";
            bird.updateUP();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN){
            key = "DOWN";
            bird.updateDOWN();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            key = "RIGHT";
            bird.updateRIGHT();
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            key = "LEFT";
            bird.updateLEFT();
        }
        System.out.println("type=" + typeOfEvent + " keyCode=" + key);
        return false;
    }
}