package day01;
import java.util.Scanner;

public class methods_in_java {
    public static int sum(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(;;){
            System.out.println("start or exit");
            String start_or_exit = input.nextLine();
            if(start_or_exit.equals("start")){
                System.out.println("Enter Number 1");
                int number1 = input.nextInt();
                System.out.println("Enter Number 2");
                int number2 = input.nextInt();
                System.out.println("------");
                int result = sum(number1, number2);
                System.out.println(result);
            }
            
            if(start_or_exit.equals("exit")) break;

            else{
                System.out.println("Please properly mention start or exit");
            }
            
        }
    }
}
