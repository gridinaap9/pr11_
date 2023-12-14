package com.company;
import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите число больше 1");        int number = scanner.nextInt();        System.out.println("Простые множители числа"+ number+ ":" );         Number(number);    }

    public static void Number(int number) {
        for(int i = 2; i <= number; i ++){
            while (number % i == 0){
                System.out.println(i + "");
                number /= i;            }
        }
    }
}