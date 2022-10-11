package ru.mirea.lab2.ex3;

public class Circle {
    private Point centre;
    private double r;

    public Circle(Point centre, double r){
        this.centre = centre;
        this.r = r;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(double x, double y) {
        this.centre.setXY(x,y);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    @Override
    public String toString(){
        return "Circle config{ centre: " + getCentre() + ", radius: " + getR() + " }";
    }
}
