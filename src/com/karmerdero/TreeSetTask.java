package com.karmerdero;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetTask {
    public static void main(String[] args) {
        //1
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Amber");
        colors.add("Blue");
        colors.add("Coral");
        System.out.println("Tree set: "
                + "\n" + colors + "\n");

        //2
        System.out.println("Iterate through: ");
        for (String el:colors)
            System.out.print(el + " ");
        System.out.println("\n");

        //3
        TreeSet<String> colors2 = new TreeSet<>();
        colors2.add("Grey");
        colors2.add("Indigo");
        colors.addAll(colors2);
        System.out.println("Add some TreeSet to \"colors\" TreeSet: "
                + "\n" + colors + "\n");

        //4
        Iterator i = colors.descendingIterator();
        while (i.hasNext()){
            System.out.print(i.next() + " ");
        }
        System.out.println("\n");

        //5
        System.out.println("First element: "+ colors.first());
        System.out.println("Last element: "+ colors.last());
        System.out.println("\n");

        //6
        TreeSet<String> colorsCloned = (TreeSet<String>) colors.clone();
        System.out.println("New cloned TreeSet: "
                + "\n" + colorsCloned + "\n");

        //7
        System.out.println("Size of cloned TreeSet: "
                + colorsCloned.size() + " elements."
                + "\n");

        //8
        System.out.println("Compare elements in \"colors\" and \"colors2\" TreeSets: ");
        for (String el: colors){
            System.out.print(colors2.contains(el) ? "Same " : "Different ");
        }
        System.out.println("\n");

        //9
        System.out.println("Find the numbers less than 7 in a tree set: ");
        TreeSet<Integer> nums = new TreeSet<>();
        TreeSet<Integer> otherNums = new TreeSet<Integer>();
        nums.add(6);
        nums.add(10);
        nums.add(18);
        nums.add(3);
        nums.add(13);
        nums.add(1);
        nums.add(7);
        nums.add(17);
        otherNums = (TreeSet) nums.headSet(7);
        Iterator iterator;
        iterator = otherNums.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        //10
        System.out.println("\n");
        System.out.println("Greater than or equal to 13 in TreeSet: "
                + nums.ceiling(13));

        //11
        System.out.println();
        System.out.println("Lower or equal to 13 in TreeSet: "
                + nums.floor(13));

        //12
        System.out.println();
        System.out.println("Greater than 10 in TreeSet: "
                + nums.higher(10));

        //13
        System.out.println();
        System.out.println("Lower than 18 in TreeSet: "
                + nums.lower(18));

        //14
        System.out.println();
        System.out.println("Removes the first(lowest) element: "
                + nums.pollFirst());
        System.out.println("What we have now:"
                + "\n" + nums + "\n");
        //15
        System.out.println("Removes the last element: "
                + nums.pollLast());
        System.out.println("What we have now:"
                + "\n" + nums + "\n");

        //16
        System.out.println("Removes 70 from the list: "
                + nums.remove(13));
        System.out.println("What we have now:"
                + "\n" + nums);

    }
}
