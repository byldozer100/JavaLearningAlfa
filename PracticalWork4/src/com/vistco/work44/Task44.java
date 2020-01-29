package com.vistco.work44;

public class Task44 {
    public static void main(String[] args) {
        int counter = 1;
        int iteration = 0;
        while (counter++ <= 300)
        {
//                if ((iteration <10) && ((counter % 3 == 0) || (counter % 4 == 0)) ){
//                    iteration++;
//                    System.out.println("Iteration=" + iteration +" ,counter = >" + counter);
//                }
                if (((counter % 3 == 0) || (counter % 4 == 0)) ){
                    iteration++;
                    System.out.println(iteration +") => " + counter);
                }
                if (iteration >=10) break;

        }
    }
}
