package org.example;


import org.example.list.List;

public class Main {
    public static void main(String[] args) {

        var myList = new List();
        myList.add(1);
        myList.add(3);
        myList.add(5);
        myList.add(7);

        for (int i = 0; i < myList.size(); i++) {
            try {
                System.out.println(myList.get(i));
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("zu weit");
            }

        }
    }
}