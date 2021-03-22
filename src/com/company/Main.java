package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("задание 1");
           for(int i=7;i>=1;i--){
             System.out.println(i);
           }
        System.out.println("Задание 2");
            int[] mass = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            int x = 0;
        while (x<mass.length) {
            System.out.println(mass[x]);
            x++;
           }
    }
}