import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //sumOfElements();
        //findMaxMin();
        // arrayReverse(new String[]{"Gurmad", "Harir", "Abdulle"});
       // searchElement(11);
      //  removeDuplicates(new int[] {1,2,3,4,4,5,3});
        initializeArr();
    }

    //Array Exercises
    //1) Sum of Array Elements
    private static void sumOfElements(){
        //first create an array of elements
        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        //secondly create a variable that holds sum
        int total= 0;

        //thirdly, get elements one by one and add the var
        for(int n : nums){
            total += n;
        }

        //finally, display to the user
        System.out.println(java.util.Arrays.toString(nums));
        System.out.println("Their sum: " + total);
    }

    //2) Find maximum and minimum no of int array elements
    private static void findMaxMin(){
        //first create an int array elements
        int[] nums = {34,20,30,70,50,60,61};

        //secondly create a variable to hold min and max
        int minElement = nums[0];
        int maxElement = nums[0];

        //thirdly, compare each element
        for (int el : nums){
            for(int n : nums){
                if(el < n && el < minElement){
                    minElement = el;
                }

                if(el >= n && el > maxElement){
                    maxElement = n;
                }
            }
        }

        //Finally, display to the user
        System.out.println(java.util.Arrays.toString(nums));
        System.out.println("Min number: " + minElement);
        System.out.println("Max number: " + maxElement);
    }

    //3) Reverse an array
    private static void arrayReverse(String[] arr){
        //create an array variable to hold the reversed array
        String[] reversedArray = new String[arr.length];

        //count variable (for index)
        int count = 0;

        for(int i = arr.length -1; i >= 0; i--){
            reversedArray[count] = arr[i];

            //increment count variable
            count++;
        }

        //Finally, print the reversed array
        System.out.println("Array: "+ java.util.Arrays.toString(arr));
        System.out.println("Reversed Array: "+ java.util.Arrays.toString(reversedArray));

    }

    //4) Search an Element
    private static void searchElement(int element){
        //create an array of elements
        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        //create variables to hold searched element's index
        int index = 0;

        //Apply searching
        for(int n : nums){
            if(element == n){
                break;
            }else{
                index++;
            }

            //If the element is not found
            if(index == nums.length){
                index = -1;
            }
        }

        //Finally, Display the index to the user
        System.out.println("Array: " + java.util.Arrays.toString(nums));
        System.out.println(index != -1 ? "Index of " + element + ": " + index : "Element not found!");
    }


    //5) Remove Duplicates
    private static void removeDuplicates(int[] arr){
        //Sorting the array to group duplicates together
        java.util.Arrays.sort(arr);

        int uniqueCount = 0;

        //Iterate through the sorted array
        for(int i = 0; i < arr.length-1; i++){
            //Check if the current element is different from the next one
            if(arr[i] != arr[i+1]){
                //if different, copy the current element to its new position
                arr[uniqueCount++] = arr[i];
            }
        }

        //Copy the last element or the only element if array length is 1
        arr[uniqueCount++] = arr[arr.length -1];

        //Create newArray with only unique elements
        int[] resultedArray  = java.util.Arrays.copyOf(arr, uniqueCount);

        //Finally, resultedArray contains unique elements from original array
        System.out.println("Original Array: " + java.util.Arrays.toString(arr));
        System.out.println("Unique Array: " + java.util.Arrays.toString(resultedArray));
    }

    //6) Initialize and add elements
    private static void initializeArr(){
        try{
            System.out.println("This program is about initializing array");
            //Make the size of the array dynamically by getting an input
            System.out.print("\nEnter the size of the array: ");
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();

            //Get the type of the array
            System.out.print("Enter the type of the array: ");
            Scanner in = new Scanner(System.in);
            String type = in.next();

            //space
            System.out.println();

            //Use switch for creating the type of the array
            switch (type) {
                case "String", "string" -> {
                    String[] strArray = new String[size];
                    int count = 0;
                    while(count < size){
                        //get input elements
                        System.out.print("Enter element " + count + ": ");
                        Scanner el = new Scanner(System.in);
                        String element = el.next();

                        //initialize
                        strArray[count] = element;

                        count++;
                    }
                    System.out.println("\nFinally, your array = " + java.util.Arrays.toString(strArray));
                }
                case "int", "Integer", "integer" -> {
                    int[] intArray = new int[size];
                    for (int i = 0; i < size - 1; i++) {
                        //get input elements
                        System.out.print("Enter element " + i + ": ");
                        Scanner el = new Scanner(System.in);
                        int element = el.nextInt();

                        //initialize
                        intArray[i] = element;
                    }
                    System.out.println("\nFinally, your array = " + java.util.Arrays.toString(intArray));
                }
                case "char", "Character", "character" -> {
                    char[] charArray = new char[size];
                    for (int i = 0; i < size - 1; i++) {
                        //get input elements
                        System.out.print("Enter element " + i + ": ");
                        Scanner el = new Scanner(System.in);
                        char element = el.next().charAt(0);

                        //initialize
                        charArray[i] = element;
                    }
                    System.out.println("\nFinally, your array = " + java.util.Arrays.toString(charArray));
                }
                default -> System.out.println("Sorry, we don't support that type of an array!");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }






}
