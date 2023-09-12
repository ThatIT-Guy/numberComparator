package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("a is equal to b");
        } else {
            if (a > b) {
                System.out.println("a is greater than b");
            } else {
                System.out.println("a is less than b");
            }
        }
//        we are using if else and because of that if we had to add more conditions then it will create a complex code
//        we can use if statements only like if (a ==){} if (a>b){} and if (a<b){} but doing so will run all conditions
//        e.g if a==b is true even then it will run if a>b and then if a<b
//        to avoid this we have else if condition and we can add as many else ifs as we need as below
        if (a==b) {
            System.out.println("a is equal to b");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is less than b");
        }
    }
}