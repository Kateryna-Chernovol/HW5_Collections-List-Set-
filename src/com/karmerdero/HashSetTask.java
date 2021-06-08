package com.karmerdero;

import java.util.*;

public class HashSetTask {
    public static void main(String[] args) {
        //1
        HashSet<String> dogs = new HashSet<>();
        dogs.add("Chow-chow");
        dogs.add("Labrador");
        dogs.add("Kurzhaar");
        dogs.add("Armant");
        dogs.add("Papillon_dog");
        dogs.add("Newfoundland_dog");
        System.out.println("My Hash Set: "
                + dogs + "\n");

        //2
        Iterator<String> iter = dogs.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next() + "  ");
        }
        System.out.println();
        System.out.println("\"dogs\" Hash Set size: "
                + dogs.size() + "\n");

        //3
        dogs.removeAll(dogs);
        System.out.println("All element removed: "
                + dogs + "\n");
        //4
        System.out.println("Check is it empty: "
                + dogs.isEmpty() + "\n");

        //5
        dogs.add("Bolognese");
        dogs.add("Spitz");
        dogs.add("Pekingese");
        dogs.add("Dachshund");
        dogs.add("Mastiff");
        dogs.add("Poodle");
        String[] dogsArrayList = new String[dogs.size()];
        dogs.toArray(dogsArrayList);
        System.out.print("Now we have an Array List: ");
        for (String el : dogsArrayList){
            System.out.print(el + "  ");
        }

        //6
        HashSet<String> newDogs = new HashSet<>();
        newDogs = (HashSet)dogs.clone();
        System.out.println("Cloned Hash Set: "
                + "\n" + newDogs + "\n");

        //7
        String[] dogsArray = new String[newDogs.size()];
        newDogs.toArray(dogsArray);
        System.out.println("Array elements: ");
        for (String el : dogsArray){
            System.out.print(el + "  ");
        }

        //8
        TreeSet<String> dogsTreeSet = new TreeSet<>(newDogs);
        System.out.println("\n" + "\n" + "New TreeSet: ");
        for (String el : dogsTreeSet){
            System.out.print(el + "  ");
        }
        System.out.println("\n");

        //9
        List<String> listDogs = new ArrayList<>(newDogs);
        System.out.println("ArrayList contains: "
                + "\n" + listDogs + "\n");

        //10
        System.out.println("Is there same elements in two lists: ");
        dogs.remove("Dachshund");
        for (String el : newDogs){
            System.out.print(dogs.contains(el) ? "Same  " : "No  ");
        }

        //11
        System.out.println("\n" + "\n"
                + "This is the same elements in two lists: ");
        dogs.retainAll(newDogs);
        System.out.println("HashSet content:");
        System.out.println(dogs);

        //12
        System.out.println();
        dogs.clear();
        System.out.println("Now \"dogs\" HashSet is empty: "
                + dogs);
    }
}
