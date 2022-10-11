package ru.mirea.lab2.ex3;
import java.lang.*;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args){
        double x,y;
        Point p1 = new Point();
        Point p2 = new Point(7,1);
        Point p3 = new Point(5,6);
        System.out.println("First " + p1.toString());
        System.out.println("Second " + p2.toString());
        System.out.println("Third " + p3.toString());
        System.out.println("Change point p3");
        Scanner source = new Scanner(System.in);
        x=source.nextDouble();
        y=source.nextDouble();
        p3.setXY(x, y);
        System.out.println("Third " + p3.toString());

        Circle [] circles = new Circle[3];
        circles[0] = new Circle(p1, 5);
        circles[1] = new Circle(p2, 1);
        circles[2] = new Circle(p3, 8);
        System.out.println("First " + circles[0]);
        System.out.println("Second " + circles[1]);
        System.out.println("Third " + circles[2]);
        System.out.println("Change centre circle 0");
        x=source.nextDouble();
        y=source.nextDouble();
        circles[0].setCentre(x, y);
        System.out.println("Centre " + circles[0].getCentre());
        System.out.println("First " + circles[0]);
    }
}
