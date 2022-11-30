package org.example;

public class Main {

    public static void main(String[] a) {
        MyArrayList<Integer> mal = new MyArrayList<Integer>(10);
        mal.add(2);
        mal.add(5);
        mal.add(1);
        mal.add(23);
        mal.add(14);
        mal.add(15);
        mal.add(16);
        for (int i = 0; i < mal.getSize(); i++) {
            System.out.print(mal.get(i) + " ");
        }
        mal.add(29);
        System.out.println();
        System.out.println("Element at Index 5:" + mal.get(5));
        System.out.println("List size: " + mal.getSize());
        System.out.println("Removing element at index 2: " + mal.remove(2));
        for (int i = 0; i < ((MyArrayList<Integer>) mal).getSize(); i++) {
            System.out.print(mal.get(i) + " ");
        }
    }
}