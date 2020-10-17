package game;

public class Dragon {
    private String color = "green";
    private double size = 10.50;
    private int heads = 3;
    private boolean swim = true;  // field

    public Dragon(double size, String initColor, boolean swimm, int heads){
        this.size = size;
        color = initColor;
        swim = swimm;
        this.heads = heads;
    }

    public void fly (){

        System.out.println("dragon " + "color " + color + "flying");
    }
    public void eat (String food ) {
        System.out.println("dragon " + " eating " + food);
    }
    public void info (){
        System.out.println("color = " + color + " size "+size + "heads" + heads + " swimming" + swim);

    }

}
