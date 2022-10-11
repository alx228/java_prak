package ru.mirea.lab2.ex2;
import java.lang.*;
import java.util.Scanner;
public class TestBall {
    public static void main(String[] args){
        double x,y;
        double x0,y0;
        Ball bl=new Ball(2,1);
        System.out.println(bl.toString());
        System.out.println("x= " + bl.getX());
        System.out.println("y= " + bl.getY());
        Scanner source = new Scanner(System.in);
        System.out.println("New x");
        x=source.nextDouble();
        bl.setX(x);
        System.out.println("New y");
        y=source.nextDouble();
        bl.setY(y);
        System.out.println(bl.toString());
        System.out.println("Try again set x and y");
        x=source.nextDouble();
        y=source.nextDouble();
        bl.setXY(x, y);
        System.out.println(bl.toString());
        System.out.println("Move on");
        x0=source.nextDouble();
        y0=source.nextDouble();
        bl.move(x0,y0);
        System.out.println(bl.toString());
        System.out.println("Reset");
        bl=new Ball();
        System.out.println(bl.toString());
    }
}
