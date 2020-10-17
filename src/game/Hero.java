package game;

public class Hero {
    private String name = "John";
    private boolean armored = true;
    private int age = 25;
    private String experience = "experienced";

    public Hero(String named, boolean armor, int aged, String experienced) {
        this.name = named;
        armored = armor;
        age = aged;
        this.experience = experienced;
    }
    public void info() {
        System.out.println("Hero" + name + " " + "Armored" + armored + " " + "Age " + age + "experiance " + experience);
    }

}
