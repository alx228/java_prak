package ru.mirea.lab2.ex4;
import java.util.ArrayList;

public class TestShop {
    public static void main(String[] args) {
        System.out.println("SALE!!!!");
        Shop.addComputer(new Computer(5551,25000, "Computer lvl1"));
        Shop.addComputer(new Computer(5552,53000, "Computer AMD360PTX"));
        Shop.addComputer(new Computer(5553,1000000, "Computer lvl100 BO$$"));
        Shop.allComputers();
        Shop.buyComputer(5553);
        Shop.deleteComputer(5553);
        System.out.println("SALE!!!!");
        Shop.allComputers();
    }
}
