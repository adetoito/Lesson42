package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList myers = new ArrayList();
        myers.add("Bubb");
        myers.add("Mr. P");
        myers.add(0, "Argen the Dragon"); // Places name specifically in the 0th index.
        myers.add(27);
        myers.remove(0); // Removes a specific item based on index.
        int num = (int)myers.get(2);

        // indexOf and lastIndexOf
        // What is the difference?
        // indexOf = From beginning; lastIndexOf = From end

        System.out.println(myers.size());
        System.out.println(num);

        System.out.println(myers);
    }
}
