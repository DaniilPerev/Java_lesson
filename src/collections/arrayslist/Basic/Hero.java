package collections.arrayslist.Basic;

public class Hero {

    private String name = "John";
    private boolean armored = true;
    private int age = 25;
    private boolean experience = false;

    public Hero(String name, boolean b, int i, boolean b1) {
        this.name = name;
        armored = b;
        age = i;
        this.experience = b1;
    }

    public Hero(String named, boolean armor, int aged, String experienced) {
        this.name = named;
        armored = armor;
        age = aged;
        this.experience = true;
    }

    public void info() {
        System.out.println("Hero: " + name + "\nArmored: " + armored + "\nAge: " + age + "\nexperiance: " + experience);
        System.out.println("   ");
        System.out.println("   ");
    }

}

