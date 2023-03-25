package org.example;

public class Main {
    public static void main(String[] args) {

        int i;
        for (i=1; i<=10; i++) {
            System.out.println(3 + "*" + i + " =" + (3 * i));
        }

        int x;
        int sum =0;
        for (x=1; x<=100; x++) {
            sum += x;
        }
        System.out.println ("Cреднее арифметическое суммы чисел от 1 до 100 равно " + sum/100);

        double a;
        int count =0;
         a = 400;
         if (a < 50){
             System.out.println ("Вы ввели слишком маленькое число");
         }
        while (a>50) {
           a = a/2;
            count++;
             }

        System.out.println ("Количество итераций = " + count );
        System.out.println ("результат = " + a );
    }
}