package com.vistco.work41;

public class Task41 {
    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 20;
        int value3 = 30;
        int maxValue = value1;


        if (maxValue < value2) {
            maxValue = value2;
        }
        if (maxValue < value3)
        {
            maxValue = value3;
        }
        System.out.println("Max value ->" + maxValue);
    }
}
