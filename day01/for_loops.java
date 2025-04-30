package day01;

public class for_loops {
    public static void main(String[] args) {
        System.out.println("-------initializing loops in java--------");
        // initializing loops in java 
        for(int i=0;i<10;i++){
            System.out.println("hello world");
        }
        System.out.println("-------reverse the loop--------");
        // reverse the loop
        for(int i =5;i>=0;i--){
            System.out.println(i);
        }
        System.out.println("-------loop in a array --------");
        // loop in a array 
        int[] list_array = new int[3];
        list_array[0]= 10;
        list_array[1]= 20;
        list_array[2]= 30;


        for(int i=0;i<list_array.length;i++){
            System.out.println(list_array[i]); // get the index of a array
        }
        
        for (int num : list_array) {
            System.out.println(num); // here we will get the array element directly
            }

        System.out.println("-------// increment by 2--------");
        // increment by 2
        for(int i = 0;i<=10;i+=2){
            System.out.println(i); 
        }
        System.out.println("------Using 'break' in for loop and loop in a string (to exit early)---------");
        // Using 'break' in for loop and loop in a string (to exit early)
        String for_break = "break statements";
        for(char c=0; c<for_break.length();c++){
            if (for_break.charAt(c) == 'k') break;
            System.out.print(for_break.charAt(c));
        }
        
        System.out.println("");
        System.out.println("------ Using 'continue' and string in for loop (to skip current iteration)---------");
        // Using 'continue' in for loop (to skip current iteration)
        String for_continue =  "continue statements";
        for(int i =0;i<for_continue.length();i++){
            if(for_continue.charAt(i)=='c') continue;
            System.out.print(for_continue.charAt(i));
        }


        
    }
}
