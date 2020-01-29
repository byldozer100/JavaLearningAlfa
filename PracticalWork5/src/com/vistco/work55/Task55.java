package com.vistco.work55;

import java.util.Scanner;

public class Task55 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sc -> ");
        String sc = scanner.nextLine();

        int index = 0;
        while (index < sc.length())
        {
            char symbol = sc.charAt(index);
            if (sc.indexOf(symbol) == sc.lastIndexOf(symbol))
            {
                System.out.print(symbol + " ");
            }

            index++;
        }
    }
}
