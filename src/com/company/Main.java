package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Вывести числа от 7 до 1 с помощью цикла for");
           for(int i=7;i>=1;i--){
             System.out.println(i);
           }
        System.out.println("Создать и проинициализировать массив из 10 любых чисел. Вывести все элементы массива на экран с помощью цикла while");
            int[] mass = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            int x = 0;
        while (x<mass.length) {
            System.out.println(mass[x]);
            x++;
           }
        System.out.println("Написать алгоритм для вывода последовательности Фибоначчи с помощью цикла до 100");
        int n =12;
        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }
        for (int i = 0; i < n; ++i) {
            System.out.println(f[i]);
        }

    }
}