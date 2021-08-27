package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       Double radius = 0.0;
       do{
                System.out.println("Enter a radius:");
         try {
             radius = input.nextDouble();
         }catch (Exception e) {
         }
         }while (radius <0);
            input.close();
            Double area = Circle.getArea(radius);
            System.out.println("The area of circle of radius "+ radius +" is " + area);
    }
}
