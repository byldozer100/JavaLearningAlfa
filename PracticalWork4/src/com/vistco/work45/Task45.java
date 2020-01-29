package com.vistco.work45;

public class Task45 {
    public static void main(String[] args) {
        int tableSize = 30;
        System.out.print("* |  ");

        int number = 1;
        while (number <= tableSize){
            System.out.print(number + "\t");
            number++;
        }
        System.out.println();

        number = 1;
        while (number <= tableSize+1){
            System.out.print("---\t");
            number++;
        }
        System.out.println();

        number = 1;
        int numberInner;
        int multiply = 0;
        while (number <= tableSize){
            numberInner = 1;
            System.out.print( number + " | ");
            while (numberInner <= tableSize)
            {
                multiply = number * numberInner;
                System.out.print( multiply + "\t");
                numberInner++;
            }
            System.out.println();
            number++;
        }

    }
}
