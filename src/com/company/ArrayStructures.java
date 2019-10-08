package com.company;

public class ArrayStructures {

    private int[] theArray = new int[50];
    private int arraySize = 10;

    public void generateRandomArray(){
        for(int i = 0; i < arraySize; i++ ){
            theArray[i] = (int)(Math.random()*10)+10;
        }
    }

    public void printArray(){
        System.out.println("----------");
        for(int i = 0; i < arraySize; i++){
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
            System.out.println("----------");

        }
    }

    public int getValueAtIndex(int index){
        if(index < arraySize)
            return theArray[index];

        return 0;
    }

    public boolean doesArrayContainThisValue(int searchValue){
        boolean valueInArray = false;

        for(int i=0; i < arraySize; i++)
        {
            if(theArray[i] == searchValue)
                valueInArray = true;
        }

        return valueInArray;
    }

    public void deleteIndex(int index){
        if(index < arraySize){
            for(int i = index; i < (arraySize-1); i++){
                theArray[i] = theArray[i + 1];
            }
            arraySize--;
        }
    }

    public void insertValue(int value){
        if(arraySize < 50){
            theArray[arraySize] = value;
            arraySize++;
        }
    }

    public String linearSearchforValue(int value){

        boolean valueInArray = false;

        String indexesWithValue = "";

        for(int i =0; i < arraySize; i++) {
            if (theArray[i] == value) {
                valueInArray = true;
                indexesWithValue += i + " ";
            }
            printHorzArray(i, -1);
        }

        if(!valueInArray){
            indexesWithValue = "None";
        }

        System.out.println("The value was found in the following indices: " + indexesWithValue);
        return indexesWithValue;
    }

    public void printHorzArray(int i, int j) {

        for (int n = 0; n < 51; n++)
            System.out.print("-");

        System.out.println();

        for (int n = 0; n < arraySize; n++)
            System.out.print("| " + n + "  ");

        System.out.println("|");

        for (int n = 0; n < 51; n++)
            System.out.print("-");

        System.out.println();

        for (int n = 0; n < arraySize; n++)
            System.out.print("| " + theArray[n] + " ");

        System.out.println("|");

        for (int n = 0; n < 51; n++)
            System.out.print("-");

        System.out.println();
        System.out.println();
    }

    public void bubbleSort(){
        for(int i = arraySize -1; i > 1; i--){
            for(int j =0; j< i; j++){

            }

        }

    }
}
