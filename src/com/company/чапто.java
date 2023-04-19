package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class чапто {



    public class Main {
        public static Scanner in = new Scanner(System.in);
        public static PrintStream out = System.out;

        public static void main(String[] args) {
            int a;
            a = in.nextInt();
            switch(a) {
                case 123:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(31); break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(30); break;
                case 2:
                    System.out.println(28); break;
                default:
                    System.out.println(0); break;

            } } }
}
