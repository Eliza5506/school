package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.Random;

public class MyFrame extends JFrame implements MouseListener, MouseMotionListener {
    ArrayList<Oval> ovals = new ArrayList<>();
    ArrayList<Point> points = new ArrayList<>();
    public MyFrame(){
       setSize(640, 480);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true);
        addMouseListener(this);
        addMouseMotionListener(this);
        createBufferStrategy(2);
    }
    public void paint(Graphics g) {
        BufferStrategy bufferStrategy = getBufferStrategy();        // Обращаемся к стратегии буферизации
        if (bufferStrategy == null) {                               // Если она еще не создана
            createBufferStrategy(2);                                // то создаем ее
            bufferStrategy = getBufferStrategy();                   // и опять обращаемся к уже наверняка созданной стратегии
        }
        g = bufferStrategy.getDrawGraphics();                       // Достаем текущую графику (текущий буфер)
        g.clearRect(0, 0, getWidth(), getHeight());                 // Очищаем наш холст (ведь там остался предыдущий кадр)


        g.drawOval(300, 45, 555, 455);
        for (int i = 0; i < ovals.size(); i++) {
            Oval oval = ovals.get(i);
            oval.paint(g);
        }
        g.dispose();                // Освободить все временные ресурсы графики (после этого в нее уже нельзя рисовать)
        bufferStrategy.show();      // Сказать буферизирующей стратегии отрисовать новый буфер (т.е. поменять показываемый и обновляемый буферы местами)
    }

    @Override
    public void mouseClicked(MouseEvent e) { // кликнули мышкой на экран
Random r = new Random();
int a = r.nextInt(255);
int b = r.nextInt(255);
int c = r.nextInt(255);
Oval m = new Oval(getMousePosition().x, getMousePosition().y, 40, 50, a, b, c);
ovals.add(m);
    }

    @Override
    public void mousePressed(MouseEvent e) { // здесь я не поняла чем отличается, но тоже кликнули мышкой на экран
        System.out.println("PR");
    }

    @Override
    public void mouseReleased(MouseEvent e) { // здесь я не поняла чем отличается, но тоже кликнули мышкой на экран
        System.out.println("RE");
    }

    @Override
    public void mouseEntered(MouseEvent e) { // окрыли окно
        System.out.println("EN");
    }

    @Override
    public void mouseExited(MouseEvent e) { // свернули или передвинули окно
        System.out.println("EX");
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
