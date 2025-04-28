package day01;


/*
 *  String Functions Used in This Program:
 *
 * 1. length()                                                - Returns the total number of characters in the string.
 * 2. charAt(int index)                                       - Returns the character at a specified index.
 * 3. substring(int start, int end)                           - Returns a part of the string from 'start' to 'end-1'.
 * 4. toUpperCase()                                           - Converts all characters of the string to uppercase.
 * 5. toLowerCase()                                           - Converts all characters of the string to lowercase.
 * 6. trim()                                                  - Removes leading and trailing spaces from the string.
 * 7. equals(String another)                                  - Compares two strings for exact equality (case-sensitive).
 * 8. equalsIgnoreCase(String another)                        - Compares two strings ignoring case differences.
 * 9. isEmpty()                                               - Checks if the string is empty (length == 0).
 * 10. contains(CharSequence seq)                             - Checks if a particular sequence exists inside the string.
 * 11. startsWith(String prefix)                              - Checks if the string starts with a specified prefix.
 * 12. endsWith(String suffix)                                - Checks if the string ends with a specified suffix.
 * 13. replace(char oldChar, char newChar)                    - Replaces all occurrences of one character with another.
 * 14. concat(String str)                                     - Concatenates (joins) two strings.
 * 15. join(CharSequence delimiter, CharSequence... elements) - Joins multiple strings with a delimiter.
 * 16. repeat(int count)                                      - Repeats the string 'count' number of times (Available in Java 11+).
 *
 */


public class string {
    public static void main(String[] args) {
        // length and charAt
        String S1 = "Sayed Abdullah";
        System.out.println(S1.length());          // the total length of the string
        System.out.println(S1.charAt(3));   // character at a specefic index

        // substring 
        String S2 = "Hello, how are you?";
        System.out.println(S2.substring(0,5));  // get the specific characters from the string

        // lowercase and uppercase
        String S3 = "DaTA ScienCE";
        System.out.println(S3.toUpperCase());
        System.out.println(S3.toLowerCase());

        // remove white spaces
        String S4 = "   spaces   ";
        System.out.println(S4.trim());  

        // check the values of variables is equal or not 
        String s6 = "apple";
        String s7 = "apple";
        System.out.println(s6.equals(s7));    // bolleon value
        
        // it will ignore the lowercase if there 
        System.out.println(s6.equalsIgnoreCase("APPLE")); // bolleon value
        
        // check whether the satring is empty of not 
        String empty = "";
        System.out.println(empty.isEmpty());  // bolleon value


        // Searching charecter from a string
        String s11 = "OpenAI ChatGPT";
        System.out.println(s11.contains("Chat")); 

        System.out.println(s11.startsWith("Open")); 

        System.out.println(s11.endsWith("GPT")); 

        // replace the character from a  string
        String s12 = "robot";
        System.out.println(s12.replace('o', 'a')); 


        // concat two string
        String s15 = "Good ";
        String s16 = "Morning";
        System.out.println(s15.concat(s16)); 

        // join the character and make a string of it 
        System.out.println(String.join("-", "one", "two", "three")); 

        // repeat the same string 
        String s17 = "ha";
        System.out.println(s17.repeat(3)); // Output: hahaha (Java 11+)

    }
    
}
