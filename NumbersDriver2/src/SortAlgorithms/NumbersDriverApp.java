package SortAlgorithms;

import java.util.Random;

public class NumbersDriverApp {

    private static final int size = 10;

    public static void main(String[] args) {
        Numbers num, num1, num2;
        num = new Numbers(size);//Create a Numbers object with 10 elements.
        randomize(num);
        System.out.println("Random Array-Content Display:"); //Call the randomize method.
        num.display();                                       //Display the contents of the array.
        System.out.println();

        System.out.println("Bubble Sort:");
        num.bubbleSort();                                     //Call the bubbleSort method.      
        num.display();                                         //display the content of the Array. 
        System.out.println();

        System.out.println("Random Array-Content Display:");
        num1 = new Numbers(size);
        randomize(num1);                                     //Call the randomize method.
        num1.display();                                     //Display the contents of the array.
        System.out.println();

        System.out.println("Insertion Sort");
        num1.insertionSort();                                  //Call the insertionSort method.
        num1.display();                                         //Display the contents of the array.
        System.out.println();

        System.out.println("Random Array-Content Display:");
        num2 = new Numbers(size);
        randomize(num2);                                     //Call the randomize method.
        num2.display();                                      //Display the contents of the array.
        System.out.println();

        System.out.println("Selection Sort");
        num2.selectionSort();                                  //Call the selectionSort method.
        num2.display();                                         //Display the contents of the array.
        System.out.println();

    }


    /*An instance method called randomize() that creates and assigns random number in the range 0
    to 100 to the elements of the encapsulated array (hint, look up the java.util.Random class).*/
    public static void randomize(Numbers n) {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            n.setValue(i, rand.nextInt(101));
        }

    }

}
