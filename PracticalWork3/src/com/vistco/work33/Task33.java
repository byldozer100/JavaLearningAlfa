package com.vistco.work33;

import java.util.Arrays;

public class Task33 {
    public static void main(String[] args) {
        double cupboard = 830.0;
        double discount = 13;
        double expense = 7;

        double cupboard_new_price = cupboard - cupboard * discount / 100;

        System.out.println("Price after discount = " + cupboard_new_price);

        cupboard_new_price =  cupboard_new_price + cupboard_new_price * expense / 100;

        System.out.printf("Price after price rising = " + cupboard_new_price);
    }
}
