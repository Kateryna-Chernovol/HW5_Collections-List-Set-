package com.karmerdero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTask {
    public static void main(String[] args){
        //1 Task
        List<String> wordList = new ArrayList<>();
        wordList.add("Today ");
        wordList.add("is ");
        wordList.add("a ");
        wordList.add("good ");
        wordList.add("weather");
        wordList.add(".");

        //2 Task
        System.out.println("Iterate thought initial ArrayList");
        for (String element : wordList) {
            System.out.print(element + " ");
        }

        //3 Task
        wordList.add(0, "Look around. ");
        System.out.println("\n" + "\n" + wordList + "\n");

        //4 Task
        System.out.print("Element #1 is: ");
        wordList.get(1);

        //5 Task
        wordList.set(4,"sunny ");
        wordList.set(5,"day ");
        System.out.println("\n" + wordList + "\n");

        //6 Task
        System.out.println("Before: " + "\n" + wordList);
        wordList.remove(2);
        System.out.println("ArrayList without third element");
        System.out.println(wordList + "\n");

        //7 Task
        System.out.println("\n" + wordList);
        if(wordList.contains("Dog")){
            System.out.println("Element \"Dog\" was found");
        }else{
            System.out.println("Element \"Dog\" doesn't exist in a List");
        }

        //8 Task
        Collections.sort(wordList);
        System.out.println("\n" + "Sorted list: " + wordList + "\n");

        //9 Task
        System.out.println("Before: " + "\n" + wordList);
        List<String> dogs = new ArrayList<>();
        dogs.add("Spitz");
        dogs.add("Dachshund");
        dogs.add("Mastiff");
        dogs.add("Poodle");
        dogs.add("Bolognese");
        dogs.add("Husky");
        Collections.copy(dogs,wordList);
        System.out.println("Copied ArrayList" + "\n" +  wordList + "\n");

        //10 Task
        System.out.println("Before: " + "\n" + wordList);
        Collections.shuffle(wordList);
        System.out.println("Shuffled ArrayList: ");
        System.out.println(wordList + "\n");

        //11 Task
        System.out.println("Before: " + "\n" + wordList);
        Collections.reverse(wordList);
        System.out.println("ArrayList in reverse order: ");
        System.out.println(wordList + "\n");

        //12 Task
        ArrayList<String> myDogs = new ArrayList<>();
        myDogs.add("Spitz");
        myDogs.add("Dachshund");
        myDogs.add("Mastiff");
        List<String> twoDogs = myDogs.subList(0,2);
        System.out.println("2 elements from the My Dog List: ");
        System.out.println(twoDogs + "\n");

        //13 Task
        ArrayList<String> otherDogs = new ArrayList<>();
        otherDogs.add("Spitz");
        otherDogs.add("Mastiff");
        otherDogs.add("Poodle");
        List<String> compareElements = new ArrayList<>();
        for (String el : myDogs)
            compareElements.add(otherDogs.contains(el) ? "Same" : "Different");
        System.out.println("Elements in two lists: ");
        System.out.println(compareElements);

        //14
        System.out.println("Before: " + "\n" + myDogs);
        Collections.swap(myDogs,1,2);
        System.out.println("\n" + "My Dog List with swapped elements: "
                + myDogs + "\n");

        //15
        List<String> allDogs = new ArrayList<>();
        allDogs.addAll(myDogs);
        allDogs.addAll(otherDogs);
        System.out.println("It is \"addAll\" method: "
                + "\n" + allDogs + "\n");

        //16
        List<String> yourDogs = (ArrayList<String>)myDogs.clone();
        System.out.println("Cloned List: "
                + yourDogs + "\n");

        //17
        System.out.println("Before: " + "\n" + yourDogs);
        yourDogs.removeAll(yourDogs);
        System.out.println("No element in a list " +
                "after removing them." + yourDogs + "\n");

        //18
        System.out.println("Before: " + "\n"+ yourDogs);
        System.out.println("Is there really no elements?: "
                + yourDogs.isEmpty() + "\n");

        //19
        otherDogs.trimToSize();

        //20
        System.out.println("\"My Dog List\" before: " + "\n"+ myDogs);
        ((ArrayList<String>) myDogs).ensureCapacity(5);
        myDogs.add("Labrador");
        myDogs.add("Weimaraner");
        System.out.println("\"My Dog List\" after increase it size: "
                + "\n"+ myDogs + "\n");

        //21
        String dalmatian = "Dalmatian";
        myDogs.set(2,dalmatian);
        System.out.println("\"My Dog List\" after replace element: "
                + "\n"+ myDogs+ "\n");

        //22
        for (int i = 0; i < myDogs.size(); i++)
            System.out.println(myDogs.get(i));
    }
}
