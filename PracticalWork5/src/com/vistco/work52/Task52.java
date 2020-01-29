package com.vistco.work52;

public class Task52 {
    public static void main(String[] args) {

        String str = "National Aviation University";
        String abr = "" + str.charAt(0);
        abr += str.charAt(str.indexOf(" ")+1);
        abr += str.charAt(str.lastIndexOf(" ")+1);

        System.out.println(abr);
    }
}
