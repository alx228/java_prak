package ru.mirea.lab2.ex2;

public class Ball {

    private double x;

    private double y;

    public Ball(double x, double y){
        this.x=x;
        this.y=y;
    }

    public Ball(){
        this.x=0.0;
        this.y=0.0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double x0, double y0){
        this.x += x0;
        this.y += y0;
    }
    @Override
    public String toString(){
        return "Ball location (" + getX() + ", " + getY() + ")";
    }
}
