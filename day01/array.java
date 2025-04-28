package day01;


/*
 * 📚 ARRAY FUNCTIONS IN JAVA:
 *
 * 1. Creating an Array
 *    ➔ int[] arr = new int[5];
 *
 * 2. Inserting values into Array
 *    ➔ arr[0] = 100;
 *
 * 3. Getting length of Array
 *    ➔ arr.length
 *
 * 4. Sorting an Array
 *    ➔ Arrays.sort(arr);
 *
 * 5. Direct Initialization of Array
 *    ➔ int[] arr = {100, 200, 300};
 *
 * 6. Accessing elements of Array
 *    ➔ arr[0], arr[1], etc.
 *
 * 7. 2D Array (Multidimensional Array)
 *    ➔ int[][] arr = { {30, 40}, {90, 88} };
 *
 * 8. Taking input into Array using Scanner
 *    ➔ arr[i] = scanner.nextInt();
 *
 * 9. Copying an Array
 *    ➔ int[] copy = Arrays.copyOf(originalArray, originalArray.length);
 *
 * 10. Filling an Array with a single value
 *     ➔ Arrays.fill(arr, value);
 *
 * 11. Cloning an Array
 *     ➔ int[] clone = arr.clone();
 *
 * 12. Copying part of an Array
 *     ➔ Arrays.copyOfRange(arr, fromIndex, toIndex);
 *
 * 13. Finding Maximum value in Array
 *     ➔ Arrays.stream(arr).max().getAsInt();
 *
 * 14. Finding Minimum value in Array
 *     ➔ Arrays.stream(arr).min().getAsInt();
 *
 * 15. Printing Array easily (like Python list)
 *     ➔ System.out.println(Arrays.toString(arr));
 *
 */


import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        System.out.println(" ------------------------");
        System.out.println("initializing the array than inserting data:");
        int[] marks = new int[5];
        marks[0] = 100;
        marks[1] = 200;
        marks[2] = 300;

        // get the length of the array
        System.out.println(marks.length);

        // sort the array
        Arrays.sort(marks);

        // if you know the values than store it directly in the array
        System.out.println(" -----------------------------");
        System.out.println("Dicrectly inserting value in a array:"); 
        int[] marks_already_known = {100,200,300};
        System.out.println(marks_already_known[1]);

        // two dimentional array means each array is defining each students marks
        System.out.println("------------------------ ");
        System.out.println("2 dimentional section:");
        int [][] two_dimentional_array = {{30,40,37},{90,88,97}};
        System.out.println(two_dimentional_array[0][1]);

        // get the value from the user and insert it into a array 
        System.out.println("--------------------------- ");
        System.out.println(" get the value from the user and insert it into a array ");
        int[] user_input_data = new int[3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks 01:");
        user_input_data[0] = input.nextInt();
        System.out.println("Enter marks 02:");
        user_input_data[1] = input.nextInt();
        System.out.println("Enter marks 03:");
        user_input_data[2] = input.nextInt();
        
        System.out.println("you enter first marks is "+ user_input_data[0]);  // see the array elements
        System.out.println("you enter second marks is "+ user_input_data[1]); // see the array elements
        System.out.println("you enter third marks is "+ user_input_data[2]);  // see the array elements


        // 6. Copying an Array
        System.out.println("----------------------- ");
        System.out.println("Copying an Array");
        int [] user_array_copy = Arrays.copyOf(user_input_data, user_input_data.length);
        System.out.println(user_array_copy[0]);
        System.out.println(user_array_copy[1]);
        System.out.println(user_array_copy[2]);

        
        // 7. Filling an Array
        System.out.println("-------------------- ");
        System.out.println("Filling an Array");
        int[] fill_array = new int[3];
        Arrays.fill(fill_array,66);
        System.out.println(fill_array[0]);
        System.out.println(fill_array[1]);
        System.out.println(fill_array[2]);

        // Clone an array
        System.out.println("----------------- ");
        System.out.println("Clone an array");
        int[] original = {1,2,3};
        int[] clone_array_of_original = original.clone();
        System.out.println(Arrays.toString(clone_array_of_original));   // too see the whole array like python list 


        // Copy part of an array
        System.out.println(" ------------------");
        System.out.println("Copy part of an array");
        int[] partialCopy = Arrays.copyOfRange(original, 0, 2);
        System.out.println(Arrays.toString(partialCopy));


        // Find max and min
        // stream will give me like this [1,2,3]
        System.out.println("---------------- ");
        System.out.println("Find max and min");
        int max = Arrays.stream(original).max().getAsInt();
        int min = Arrays.stream(original).min().getAsInt();
        System.out.println("Max: " + max + ", Min: " + min);
    }
}
