package ru.mirea.lab2.ex4;
import java.util.ArrayList;
public class Shop {
    private static ArrayList<Computer> sh = new ArrayList<Computer>();
    public static void addComputer(Computer computer){
        Shop.sh.add(computer);
    }

    public static void allComputers(){
        for (int i = 0; i < Shop.sh.size(); i++){
            System.out.println(Shop.sh.get(i));
        }
    }

    public static void deleteComputer(int sn){
        for(int i = 0; i < Shop.sh.size(); i++){
            if(Shop.sh.get(i).getSn() == sn){
                Shop.sh.remove(i);
            }
        }
    }

    public static Computer buyComputer(int sn){
        for(int i = 0; i < Shop.sh.size(); i++){
            if(Shop.sh.get(i).getSn() == sn){
                return Shop.sh.get(i);
            }
        }
        return null;
    }
}
class Computer{
    private int sn, price;
    private String model;

    public Computer(int sn, int price, String model){
        this.sn = sn;
        this.price = price;
        this.model = model;
    }

    public int getSn(){
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString(){
        return "Computer inf: " + getSn() + ", price: " + getPrice() + ", Model: " + getModel();
    }
}