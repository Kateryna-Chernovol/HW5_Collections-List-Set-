package com.karmerdero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTask {
    public static void main(String[] args){
        LinkedList<String> dogs = new LinkedList<>();
        dogs.add("Chow-chow");
        dogs.add("Labrador");
        dogs.add("Kurzhaar");
        System.out.println("Linked list: " + "\n" + dogs+ "\n" );

        //2
        System.out.println("Iterate through: ");
        for (String el : dogs) {
            System.out.print(el + " ");
        }
        System.out.println("\n");

        //3
        System.out.println("Iterate from second element: ");
        Iterator bolognese = dogs.listIterator(1);
        while(bolognese.hasNext()){
            System.out.print(bolognese.next()+ " ");
        }
        System.out.println("\n");

        //4
        System.out.println("Iterate in reverse order: ");
        Iterator i = dogs.descendingIterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println("\n");

        //5
        dogs.add(1,"Dalmatian");
        System.out.println("Add element \"Dalmatian\": "
                + "\n" + dogs+ "\n" );

        //6
        dogs.addFirst("Bolognese");
        dogs.addLast("Spitz");
        System.out.println("Add first and last elements : "
                + "\n" + dogs+ "\n" );

        //7  Armant

        dogs.offerFirst("Armant");
        System.out.println("After inserting specific element at the front : "
                + "\n" + dogs+ "\n" );

        //8
        dogs.offerLast("Papillon_dog");
        System.out.println("After inserting specific element at the end : "
                + "\n" + dogs+ "\n" );

        //9
        LinkedList <String> newDogs = new LinkedList<>();
        newDogs.add("Pekingese");
        newDogs.add("Newfoundland_dog");
        dogs.addAll(3,newDogs);
        System.out.println("Add other LinkedList inside:"
                + "\n" + dogs + "\n" );

        //10
        System.out.println("First Element is: " + dogs.getFirst());
        System.out.println("Last Element is: " + dogs.getLast() + "\n");

        //11
        System.out.println("Elements and their positions in a linked list");
        for(int a=0; a < dogs.size(); a++){
            System.out.println("Index "+ a +" = " + dogs.get(a));
        }

        //12
        System.out.println();
        dogs.remove("Chow-chow");
        System.out.println("\"Chow-chow\" removed: "
                + "\n" + dogs + "\n");
        //13
        dogs.removeFirst();
        dogs.removeLast();
        System.out.println("Remove first and last element"
                + "\n" + dogs + "\n");

        //14
        dogs.clear();
        System.out.println("Linked List \"Dogs\" is empty: "
                + "\n" + dogs + "\n");

        //15
        System.out.println("Before swapping elements: "
                + "\n" + newDogs);
        Collections.swap(newDogs, 0, 1);
        System.out.println("After swapping elements: "
                + "\n" + newDogs + "\n");

        //16
        newDogs.add("Spitz");
        Collections.shuffle(newDogs);
        System.out.println("Shuffled elements: "
                + "\n" + newDogs + "\n");

        //17
        LinkedList<String> deDogs = new LinkedList<>();
        deDogs.add("Kurzhaar");
        deDogs.add("Labrador");
        System.out.println("New \"deDogs\" list: "
                + "\n" + deDogs);
        LinkedList<String> runDogs = new LinkedList<>();
        runDogs.addAll(newDogs);
        runDogs.addAll(deDogs);
        System.out.println("New \"runDogs\" list: "
                + "\n" + runDogs + "\n");

        //18
        LinkedList<String> clonedRunDogs = new LinkedList<>();
        clonedRunDogs = (LinkedList<String>) runDogs.clone();
        System.out.println("Cloned linked list: "
                + "\n" + clonedRunDogs + "\n");

        //19
        System.out.println("Remove first element: " + runDogs.pop());
        System.out.println("What we have after: "
                + "\n" + clonedRunDogs + "\n");

        //20
        System.out.println("Here is the first element: "
                + clonedRunDogs.peekFirst() + "\n");

        //21
        System.out.println("Here is the last element: "
                + clonedRunDogs.peekLast() + "\n");

        //22
        if(clonedRunDogs.contains("Spitz")){
            System.out.println("We have a \"Spitz\" in a list");
        }else{
            System.out.println("There is no \"Spitz\" in a list");
        }
        System.out.println();

        //23
        System.out.println("Convert \"runDogs\" into \"deDogsArrayL\" ArrayList:");
        ArrayList<String> deDogsArrayL = new ArrayList<>(runDogs);
        System.out.println(deDogsArrayL + "\n");

        //24
        System.out.println("Compare elements in \"clonedRunDogs\" and \"runDogs\" lists");
        LinkedList<String> compareDogs = new LinkedList<>();
        for (String el: clonedRunDogs)
            compareDogs.add(runDogs.contains(el) ? "Same" : "Different");
        System.out.println(compareDogs + "\n");

        //25
        System.out.println(clonedRunDogs);
        System.out.println("\n"
                + "Is \"clonedRunDogs\" is empty: "
                + clonedRunDogs.isEmpty() + "\n");

        //26
        System.out.println("Replace elements: ");
        clonedRunDogs.set(1, "Bolognese");
        System.out.println(clonedRunDogs);
    }
}
