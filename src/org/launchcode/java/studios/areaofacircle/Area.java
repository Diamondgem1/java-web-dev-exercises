package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        System.out.println("Enter a radius: ");
        Scanner input = new Scanner(System.in);
        double radius;
        radius = input.nextInt();
        System.out.println(Circle.getArea(radius));
    }
}
