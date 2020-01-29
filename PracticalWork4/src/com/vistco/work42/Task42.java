package com.vistco.work42;

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x -> ");
        int x = sc.nextInt();
//        if ( x == 0)
//        {
//            System.out.println("Zero");
//        }else   if (x == 1)
//        {
//            System.out.println("One");
//        }else if (x == 2)
//        {
//            System.out.println("Two");
//        }else
//            {
//                System.out.println("Invalid value");
//            }
        switch (x) {
            default:
                System.out.println("Invalid value"); break;
            case 0:
                System.out.println("Zero"); break;
            case 1:
                System.out.println("One"); break;
            case 2:
                System.out.println("Two"); break;
        }

    }
}
