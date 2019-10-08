package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("test");

        /*
        //DAY 1
        ArrayStructures newArray = new ArrayStructures();
        newArray.generateRandomArray();
        newArray.printArray();
        System.out.println(newArray.getValueAtIndex(3));
        System.out.println(newArray.doesArrayContainThisValue(18));
        newArray.deleteIndex(4);
        newArray.printArray();
        newArray.insertValue(55);
        newArray.printArray();
        newArray.linearSearchforValue(17);*/

        ArrayStructures newArray = new ArrayStructures();
        newArray.generateRandomArray();
        newArray.insertionSort();
        newArray.binarySearchForValue(11);

    }
}
