package com.vistco.work46;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number with type int >");
        int number = sc.nextInt();
        //System.out.println(number);

        int ost = 0;
        int sum = 0;


        while (number>0)
        {
            ost = number % 10;
            //System.out.println("ost =>" + ost);

            number = number - ost;
            //System.out.println("number =>" + number);

            number = number / 10;
            //System.out.println("number =>" + number);

            sum = sum + ost*ost;
            //System.out.println("sum =>" + sum);
        }

        System.out.println("Sum of squares =>" + sum);
    }
}
