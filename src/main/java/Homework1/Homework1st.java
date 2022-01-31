package Homework1;

import java.util.Scanner;


public class Homework1st {

    public static void main(String[] args) {

        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        System.out.println("What is your hobby?");
        String hobby = scanner.next();

        System.out.println("Your name is " + name + " and your hobby is " + hobby);

    }

}
