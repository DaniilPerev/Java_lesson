package collections.arrayslist.Basic;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Hero> heroes = new ArrayList<>();
        Hero john = new Hero("John", false, 25, false);
        Hero jay = new Hero("Jay", true, 31, true);
        Hero jack = new Hero("Jack", false, 30, true);
        Hero jin = new Hero("Jin", true, 29, false);
        // adding objects to the massive

        heroes.add(john);
        heroes.add(jay);
        heroes.add(jack);
        // figuring out the size of the massive

        int length = heroes.size();
        System.out.println("Size: " + length);

        // get a subject on position of your choice

        Hero temp = heroes.get(0);
        temp.info();
        heroes.add(0, jin);
        heroes.add(1, jack);
        for (int i = 0; i < heroes.size(); i++) {
            heroes.get(i).info();
        }
        System.out.println(heroes);

        // is massive containing the subject of choice

        boolean contains = heroes.contains(jay);
        System.out.println(contains);
        Hero joe = new Hero("Joe", true, 34, true);
        boolean contains1 = heroes.contains(joe);
        System.out.println(contains1);

        // what position is subject located

        int position = heroes.indexOf(jack);
        System.out.println(position);
        position = heroes.indexOf(joe);
        System.out.println(position);
        heroes.add(null);
        heroes.add(0, null);
        System.out.println(heroes);
        System.out.println("heroes without nulls");
        for (int i = 0; i < heroes.size(); i++) {
            if (heroes.get(i) != null) {
                heroes.get(i).info();
            }
        }

        // remove a subject from the massive
        heroes.remove(0);
        System.out.println(heroes);
        heroes.remove(null);
        System.out.println(heroes);
        ArrayList <Hero> heroes1 =new ArrayList<>();
        Hero ray = new Hero("Ray", false, 28, false);
        Hero roy = new Hero("Roy", true, 27, true);
        heroes1.add(ray);
        heroes1.add(roy);

        // Connect two massive together
        System.out.println("Two massive together");
        heroes.addAll(heroes1);
        for (int i = 0; i < heroes.size(); i++) {
            if (heroes.get(i) != null) {
                heroes.get(i).info();
            }
        }
        Hero[] arrayHero = new Hero[1];
        Hero [] heroesArray = heroes.toArray(arrayHero);
        System.out.println("Heroes:\n");
        for (int i = 0; i < heroesArray.length; i++) {
            heroesArray[i].info();
        }
        // Replace subject to a different subject of choice
        Hero joy = new Hero("Joy", false, 30, true);
        heroes.set(1, joy);
        System.out.println("Hero List:");
        for (int i = 0 ; i < heroes.size(); i++) {
            heroes.get(i).info();
        }

        // Practice: Remove 3 subjects from the massive
        ArrayList <Hero> heroes3 = new ArrayList<>();
        heroes3.add(roy);
        heroes3.add(roy);
        heroes3.add(jack);
        heroes3.add(john);
        heroes.removeAll(heroes3);
        System.out.println("HERO LIST REMOVE");
        for (int i = 0; i < heroes.size(); i++) {
             heroes.get(i).info();
        }
        // Clears the whole massive
        heroes.clear();
        int size = heroes.size();
        System.out.println(size);
    }

}
