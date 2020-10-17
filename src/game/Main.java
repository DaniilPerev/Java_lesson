package game;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Dragon vasya;
        int i = 45;
        int j = 3;
        j = i;
        System.out.println(j);
        new Dragon(36.5, "black", true, 3);
        System.out.println(new Dragon(6.5, "green", true, 3));
        vasya = new Dragon(36.5, "black", true, 3);
        System.out.println("vasya  " + vasya);
        Dragon ilon = new Dragon(36.5, "black", true, 3);
        Dragon petya = new Dragon(36.5, "black", true, 3);
        System.out.println("ilon  " + ilon);
        System.out.println("petya  " + petya);
        petya = ilon;
        System.out.println("vasya  " + vasya + "  " + "ilon  " + ilon + "  " + "petya  " + petya);
        ilon = petya;
        System.out.println("vasya  " + vasya + "  " + "ilon  " + ilon + "  " + "petya  " + petya);
        ilon = vasya;
        petya = vasya;
        System.out.println("vasya  " + vasya + "  " + "ilon  " + ilon + "  " + "petya  " + petya);
        //ilon = null;
        petya = null;
        System.out.println("vasya  " + vasya + "  " + "ilon  " + ilon + "  " + "petya  " + petya);
        vasya.fly();
        Dragon dragon = new Dragon(36.5, "black", true, 3);
        //int s = 3.56;
        Random r = new Random();
        vasya.eat("apple");
        Dragon frank = new Dragon(23.6, "red", false, 10);
        frank.fly();
        vasya.info();
        frank.info();
        Hero john;
        new Hero("John", true, 25, "experianced");
        john = new Hero("John", false, 27, "trainee");
        john.info();


    }
}
