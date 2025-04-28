package day01;
import java.util.Scanner;


public class variables_input_ifelse_ {
    public static void main(String[] args) {

        // declaring variables
        int age = 23;
        String name = "Abdullah";
        String office = "Hikmah Technologies";
        String role = "Data Engineer";

        // String format
        String message = String.format("My name is %s, working as a %s at %s. My age is %d", name, role, office,age);
        // alternative of string format is 
        System.out.println("My name is "+ name +", working as a "+ role +" at " +office+". My age is "+age);
        System.out.println(message);
        
        // we will initialize the input from user 
        Scanner input = new Scanner(System.in);

        // lets take value from the user means email
        System.out.println("Enter the Email below");
        String email = input.nextLine();

        System.out.println("Enter the Password below");
        String password = input.nextLine();
        
        // it will check whether the email is correct or not (we can also make a multiple mails check like yahoo,gmail etc)
        boolean isEmailValid = email.contains("@gmail.com");
        
        // we are appling if else condition
        if (isEmailValid) 
        {
            String enail_check_message = String.format("%s, your email is correct and your email is %s",name,email);
            System.out.println(enail_check_message);
        } 
        else
        {
        String enail_check_message = String.format("%s!!! Your email is not correct please give me the correct mail",name);
        System.out.println(enail_check_message);
        }

        // Now we will check for password
        // Check password conditions
        boolean isPasswordValid = password.length() >= 8;  // At least 8 characters
        boolean hasUppercase = password.matches(".*[A-Z].*");  // Check for at least one uppercase letter
        boolean hasSpecialChar = password.matches(".*[^a-zA-Z0-9].*");  // Check for at least one special character
        boolean hasNumber = password.matches(".*\\d.*");  // Check for at least one number

        boolean isPasswordSecure = isPasswordValid && hasUppercase && hasSpecialChar && hasNumber;
        
        if (isPasswordSecure)
        {
            String password_secure_message = String.format("%s, Your password is correct %s", name, password);
            System.out.println(password_secure_message);
        }
        else
        {
            System.out.println(name + ", Your password is incorrect, please retry it again");
        }

        // System.out.println(isPasswordSecure);
        
    }
}
