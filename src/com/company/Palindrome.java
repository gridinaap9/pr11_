package com.company;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово:");
        String word = scanner.nextLine();
        if (Palindr(word)){
            System.out.println("Yes");        }
        else {
            System.out.println("No");        }
    }

    public static boolean Palindr(String word){
        int lenght = word.length();
        for (int i = 0; i < lenght /2; i++){
            if (word.charAt(i) != word.charAt(lenght- 1 - i)){
                return false;        }
        }
        return  true;}
}