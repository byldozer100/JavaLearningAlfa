package com.vistco.work53;

public class Task53 {
    public static void main(String[] args) {

        String str = "An information system is designed to collect, process, store and distribute information";
        int pos1 = str.indexOf(" ");
        int pos2 = str.lastIndexOf(" ");
        str = str.substring(pos2+1,str.length()) + str.substring(pos1,pos2+1) + str.substring(0, pos1);

        System.out.println(str);


    }
}
