package com.company;

import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Trassa trassa = new Trassa(100, 0);
        Trassa trassa2 = new Trassa(100, -1050);
        Travka travka = new Travka(0, 0);
        Travka travka2 = new Travka(0, -1050);
        Car car = new Car(400, 500);
        Vzr vzr = new Vzr(100, 100);
        ArrayList<Bomba> bombas = new ArrayList<Bomba>();
        Bomba bomba1 = new Bomba(140, 700, false);
        bombas.add(bomba1);
        Bomba bomba2 = new Bomba(660, 400, false);
        bombas.add(bomba2);
        Bomba bomba3 = new Bomba(400, 0, false);
        bombas.add(bomba3);
        Bomba bomba4 = new Bomba(660, -200, false);
        bombas.add(bomba4);
       // Bomba bomba4 = new Bomba(660, -800, false);
      //  bombas.add(bomba4);
       // Bomba bomba4 = new Bomba(660, -800, false);
       // bombas.add(bomba4);
       // Bomba bomba4 = new Bomba(660, -800, false);
        //bombas.add(bomba4);
        //Bomba bomba4 = new Bomba(660, -800, false);
        //bombas.add(bomba4);
        ArrayList<Monets> monets = new ArrayList<Monets>();
        Monets monets1 = new Monets(140, 900, false);
        monets.add(monets1);
        ArrayList<Zvezda> zvezdas = new ArrayList<Zvezda>();
        Zvezda zvezda1 = new Zvezda(1000, 200, true);
        zvezdas.add(zvezda1);
        Zvezda zvezda2 = new Zvezda(1200, 200, true);
        zvezdas.add(zvezda2);
        Zvezda zvezda3 = new Zvezda(1400, 200, true);
        zvezdas.add(zvezda3);
        Proig proig = new Proig(0, 0);
        TextField text = new TextField(50, 50);
        Dizain Nasty = new Dizain(1100, 400);
        Otr otr = new Otr(car, trassa, trassa2, bombas, monets, vzr, zvezdas, proig, text, Nasty, travka, travka2);
        CarPanel panel = new CarPanel(car, trassa, trassa2, bombas, monets, vzr, zvezdas, otr, proig, text, Nasty, travka, travka2);
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();   // менеджер по трудоустройству слушателей клавиатуры
        manager.addKeyEventDispatcher(panel);    // подключаем нашу панель к прослушиванию клавиатуры        // Создаем окно
        JFrame frame = new JFrame();
        frame.add(panel);        // добавляем в окно панель
        frame.setSize(2000, 1000); // делаем окно нужного размера
        frame.setVisible(true);

//if (zvezdas.get(0).p==0) {
   /* JButton button = new JButton(); // делаем его видимым (ОБЯЗАТЕЛЬНО В САМЫЙ ПОСЛЕДНИЙ МОМЕНТ - когда панель уже добавлена)
    button.setText("Начать заново");
    button.setPreferredSize(new Dimension(100, 100));
    button.setBounds(0, 0, 200, 100);
    panel.add(button);
    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                //frame.remove(panel);
                //  CarPanel panel = new CarPanel(car, trassa, trassa2, bombas, monets, vzr, zvezdas, otr, proig, text, Nasty);
                //frame.add(panel);
                //System.out.println(7767);

                //car.n = 0;
                zvezdas.get(0).p = 3;
                text.a = 0;
                text.p = 3;

            }
        }
    };
    button.addActionListener(listener); */
//}
        while (true) {
            frame.repaint();
        }
    }
}