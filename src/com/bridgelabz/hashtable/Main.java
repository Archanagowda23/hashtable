package com.bridgelabz.hashtable;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to hashtable program");
        Map<Integer, String> map = new Map<Integer, String>();
        map.add(1, "aa");
        map.add(2, "bb");
        map.add(3, "vc");
        map.add(4, "hh");
        map.add(5, "mm");
        map.add(6, "kk");
        map.add(7, "pp");
        map.add(8, "ii");
        map.add(9, "uu");
        map.size();
        System.out.println("The size is: " + map.size());
        map.get(8);
        System.out.println("The get value is :" + map.get(8));
        System.out.println("Removed value is :" + map.remove(9));
        map.remove(9);

        map.display();

    }
}

