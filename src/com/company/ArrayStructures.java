package com.company;

public class ArrayStructures {

    //Values that the size of the array
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
        if(j != -1){
            // ADD THE +2 TO FIX SPACING
            for(int k = 0; k < ((j*5)+2); k++)
                System.out.print(" ");

            System.out.print(j);
        }

        System.out.println();
        System.out.println();
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

    public int getValueAtIndex(int index){
        if(index < arraySize)
            return theArray[index];

        return 0;
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

    public boolean doesArrayContainThisValue(int searchValue){
        boolean valueInArray = false;

        for(int i=0; i < arraySize; i++)
        {
            if(theArray[i] == searchValue)
                valueInArray = true;
        }

        return valueInArray;
    }

    public void swapValues(int indexOne, int indexTwo){
        int temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;
    }

    public void bubbleSort(){
        for(int i = arraySize -1; i > 1; i--){
            for(int j =0; j< i; j++){
                //Flip the guillemet to change from asc. to desc.
                //if(theArray[j] > theArray[j+1]) ===> asc.
                if(theArray[j] > theArray[j+1]){
                    swapValues(j, j+1);
                    printHorzArray(i, j);
                }
                printHorzArray(i, j);
            }

        }

    }

    public void selectionSort(){

        for(int i = 0; i < arraySize; i++){
            System.out.println("Iteration: " + (i+1));
            int minimum = i;
            for(int j = i; j < arraySize; j++){
                //Flip the guillemet to change from asc. to desc.
                //if(theArray[minimum] > theArray[j]) ===> asc.
                if(theArray[minimum] > theArray[j]){
                    minimum = j;
                }
            }
            swapValues(i, minimum);
            printHorzArray(i, -1);
        }
    }

    public void insertionSort(){
        for(int i = 1; i < arraySize; i++){
            int j = i;

            int toInsert = theArray[i];

            while((j > 0) && (theArray[j-1] > toInsert)){
                theArray[j] = theArray[j-1];
                j--;
                printHorzArray(i,j);
            }
            theArray[j] = toInsert;
            printHorzArray(i,j);
            System.out.println("Array[i] = " + theArray[i] + " Array[j] = " + theArray[j] + " toInsert = " +toInsert);
        }
    }

    //Used when the array is sorted
    public void binarySearchForValue(int value){
        int lowIndex = 0;
        int highIndex  = arraySize -1;

        while(lowIndex <= highIndex){

            //Splitting the size of the array
            int middleIndex = (highIndex + lowIndex)/2;

            //If the middleIndex is less than the provided value, then lowIndex is moved up
            if (theArray[middleIndex] < value)
                lowIndex = middleIndex + 1;
            //If the middleIndex is greater than the provided value, then highIndex is moved down
            else if(theArray[middleIndex] > value)
                highIndex = middleIndex - 1;
            //Otherwise the value has been found
            else {
                System.out.println("Found a match for value " + value + " at Index " + middleIndex + ".");
                lowIndex = highIndex + 1;
            }
        }

    }

}
