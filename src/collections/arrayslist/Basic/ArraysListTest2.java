package collections.arrayslist.Basic;

import java.util.ArrayList;
import java.util.Collections;

public class ArraysListTest2 {
    public static void main(String[] args) {
        // Create array list for integers and add 10 integers
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(10);
        System.out.println(integers + " ");
        ArrayList<Integer> integers1 = new ArrayList<>();
        integers1.add(1);
        integers1.add(2);
        integers1.add(3);
        integers1.add(4);
        System.out.println(integers1 + " ");
        integers1.addAll(integers);
        System.out.println(integers1);
        for (int i = integers1.size() - 1; i >= 0; i--) {
            System.out.print(integers1.get(i) + " ");
        }
        //сумму четных чисел в листе найти
        System.out.println("   ");
        int sum = 0;
        for (int i = 0; i < integers1.size(); i++) {
            if (integers1.get(i) % 2 == 0) {
                sum = sum + integers1.get(i);
            }
        }
        System.out.println("Sum of Integers1: " + sum);
        //  распечатать с конца элементы с нечетных позиций
        for (int i = integers1.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(integers1.get(i) + " ");
            }
        }
        //среднее значение нечетных чисел с эрейлиста
        System.out.println("Average");
        sum = 0;
        double average = 0;
        for (int i = 0; i < integers1.size(); i++) {
            if (integers1.get(i) % 2 == 0) {
                sum = sum + integers1.get(i);


            }
        }
        average = (sum * 1.0) / integers1.size();
        System.out.println(average);

        // удалить все 1 и 2 с эрейлиста1
        System.out.println("    ");


        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        integers1.removeAll(num);

        System.out.println(integers1 + " ");
        // how many numbers are greater then 5 in array list
        int counter = 0;
        sum = 0;
        average = 0;
        for (int i = 0; i < integers1.size(); i++) {
            if (integers1.get(i) > 5) {
                counter++;
                sum = sum + integers1.get(i);
            }
        }
        integers.add(-1);
        integers.add(2);
        integers.add(-3);
        integers.add(4);
        integers.add(-5);
        integers.add(6);
        integers.add(-7);
        integers.add(8);
        integers.add(-9);
        integers.add(10);
        System.out.println("Numbers greater than 5: " + counter);
        average = sum * 1.0 / counter;
        System.out.println("Average of number greater than 5: " + average);
        System.out.println(integers);
        counter = 0;
        int counter1 = 0;
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) > 0) {
                counter++;
            }
            if (integers.get(i) < 0) {
                counter1++;
            }
        }
        if (counter > counter1) {
            System.out.println("More positive numbers than negative");
        }
        if (counter < counter1) {
            System.out.println("More negative numbers then positive");
        }
        if (counter == counter1) {
            System.out.println("Equal amount of negative and positive  numbers");
        }
        // All positive numbers multiplied by 2 and negatives divide by 2
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) > 0) {
                integers.set(i, integers.get(i) * 2);
            }
            if (integers.get(i) < 0) {
                integers.set(i, integers.get(i) / 2);
            }
        }
        System.out.println(integers);
        // delete all negative numbers
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) < 0) {
                integers.remove(integers.get(i));
            }
        }
        System.out.println(integers);
        // Is array list containing numbers of choice 5 20 16 4
        ArrayList<Integer> integers2 = new ArrayList<>();
        integers2.add(10);
        integers.add(20);
        integers2.add(16);
        integers.add(4);
        // add to massive all together

        boolean contains = integers.contains(5);
        contains = integers.containsAll(integers2);
        System.out.print(contains);
        // sort from least to greatest

        System.out.println("    ");
        Collections.sort(integers1);
        System.out.println(integers1);
        System.out.println("    ");
        // print backwards
        Collections.reverse(integers1);
        System.out.println(integers1);
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "car", "airplane", "train", "helicopter", "plane", "tank", "drone", "car", "tank");
        System.out.println("    ");
        Collections.sort(strings);
        Collections.reverse(strings);
        System.out.println(strings);
        // delete from list words that are greater than 6 symbols
        // Go "for" on reverse
        for (int i = strings.size() - 1; i >= 0; i--) {
            if (strings.get(i).length() > 4) {
                strings.remove(strings.get(i));
            }
        }
        System.out.println("strings:");
        System.out.println(strings);
        ArrayList<String> stringMas = new ArrayList<>();
        stringMas.add("tank");
        stringMas.add("plane");
        stringMas.add("car");
        for (int i = 0; i < strings.size(); i++) {
            if (stringMas.contains(strings.get(i)) == false) {
                stringMas.add(strings.get(i));
            }
        }
        System.out.println("resultat");
        System.out.println(stringMas);
        System.out.println(strings);
        //есть лист типа дабл. Найти самый маленький дабл в нем
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(23.2);
        doubleList.add(16.1);
        doubleList.add(12.9);
        doubleList.add(26.5);
        double min = 99999999;
        for (int i = 0; i < doubleList.size(); i++) {
            if (doubleList.get(i) < min) {
                min = doubleList.get(i);
            }
        }
        System.out.print(min);
        // в листе с целіми цифрами все цифрі большие 10 заменить 0.
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(4);
        intList.add(7);
        intList.add(13);
        intList.add(15);
        intList.add(3);
        intList.add(17);
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 10) {
                intList.set(i, 0);
            }
        }
        System.out.println(intList);
        //есть лист интов, реверснуть его
        System.out.println("    ");
        Collections.reverse(intList);
        System.out.println(intList);
        // есть лист стрингов. Подсчитать сколько в нем цифр
        System.out.println("    ");
        counter = 0;
        strings.add("t7an4k");
        strings.add("t67an9k");
        strings.add("0c6ar");
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            char[] chars = s.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] >= '0' && chars[j] <= '9') {
                    counter++;
                }
            }
        }
        System.out.println("Numbers in the massive: " + counter);
        //есть арейлист типа дабл, подсчитать в нем с реднее отрицательных чисел.Учесть что их может не быть
        ArrayList<Double> doubleNumbers = new ArrayList<>();
        counter = 0;
        average = 0;
        double sum1 = 0;
        doubleList.add(12.6);
        doubleList.add(9.7);
        doubleList.add(-7.2);
        doubleList.add(8.1);
        doubleList.add(-5.2);
        for (int i = 0; i < doubleList.size(); i++) {
            if (doubleList.get(i) < 0) {
                sum1 = sum1 + doubleList.get(i);
                counter++;
            }

        }
        double average1 = 0;
        if (counter != 0) {
            average = sum1 * 1.0 / counter;

        }

        System.out.println("average: " + average);
        // 1)  Cоздать лист стрингов на 10 стрингов и подсчитать кого больше -
        // стрингов с длиной большей 4 или стрингов с длиной меньшей 6?
        ArrayList<String> strings2 = new ArrayList<>();
        counter = 0;
        counter1 = 0;
        strings2.add("green");
        strings2.add("purple");
        strings2.add("red");
        strings2.add("yellow");
        strings2.add("white");
        strings2.add("brown");
        strings2.add("black");
        strings2.add("orange");
        strings2.add("blue");
        strings2.add("pink");
        for (int i = 0; i < strings2.size(); i++) {
            String stringChar = strings2.get(i);
            char[] chars1 = stringChar.toCharArray();
            for (int j = 0; j < chars1.length; j++) {
                if (chars1[j] > '4') {
                    counter++;
                }
                if (chars1[j] < '6') {
                    counter1++;
                }
            }
        }
        if (counter1 > counter) {
            System.out.println("There are more numbers that are greater than 4");
        }
        if (counter1 < counter) {
            System.out.println("There are more number that are less than 6");
        }
        //  2) Создать лист интов и определить среднее нечетных   отрицательных чисел
        ArrayList<Integer> intList1 = new ArrayList<>();
        counter = 0;
        sum = 0;
        average = 0;
        intList1.add(-5);
        intList1.add(9);
        intList1.add(-3);
        intList1.add(-1);
        for (int i = 0; i < intList1.size(); i++) {
            if (!(intList1.get(i) % 2 == 0) && (intList1.get(i) < 0)) {
                sum = sum + intList1.get(i);
                counter++;
            }
        }
        average = sum * 1.0 / counter;
        System.out.println("Average: " + average);
        // 3) в листе типа стринг заменить все стринги с длиной меньшей 4 словом ДЖАВА
        for (int i = 0; i < strings2.size(); i++) {
            String stringChar = strings2.get(i);
            char[] chars1 = stringChar.toCharArray();
            if (chars1.length < 4) {
                strings2.set(i, "JAVA");
            }
        }
        System.out.println(strings2);
    }
}







