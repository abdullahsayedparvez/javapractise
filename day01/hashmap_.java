package day01;
import java.util.HashMap;
public class hashmap_ {
    public static void main(String[] args) {
        // Creating a HashMap
        System.out.println("------Creating a HashMap------");
        HashMap<String,Integer> dictinary = new HashMap<>();
        System.out.println(dictinary);

        // Inserting key-value pairs
        System.out.println("------Inserting key-value pairs------");
        dictinary.put("abdullah", 600);
        System.out.println(dictinary);

        // Accessing value by key
        System.out.println("------Accessing value by key------");
        int dictioanry_value = dictinary.get("abdullah");
        System.out.println(dictinary);
        System.out.println(dictioanry_value);

        // updating the value in a hashmap
        System.out.println("-------updating the value in a hashmap-----");
        dictinary.put("abdullah", 4444);
        int updated_dictionary_value = dictinary.get("abdullah");
        System.out.println(dictinary);
        System.out.println(updated_dictionary_value);

        // Checking if a key exists
        System.out.println("-------Checking if a key and value exists-----");
        boolean dict_value = dictinary.containsKey("abdullah");
        boolean dict_key = dictinary.containsKey("abdullah");
        System.out.println(dict_key);
        System.out.println(dict_value);

        // Removing a key-value pair
        System.out.println("-------Removing a key-value pair-----");
        dictinary.remove("banana");
        System.out.println(dictinary.remove("banana"));

        //Getting size of the map
        System.out.println("-------Getting size of the map-----");
        System.out.println(dictinary.size());

        // Checking if map is empty
        System.out.println("-------Checking if map is empty-----");
        boolean dict_isempty = dictinary.isEmpty();
        System.out.println(dict_isempty);

        // loop to get keys in a hashmap
        System.out.println("-------loop to get keys in a hashmap-----");
        for(String key : dictinary.keySet()){
            System.out.println(key);
        }

        // loop to get values in a hashmap
        System.out.println("-------loop to get values in a hashmap-----");
        for(int value : dictinary.values()){
            System.out.println(value);
        }

        // loop to get the key value pair 
        dictinary.forEach((k, v) -> System.out.println(k + ": " + v));

        // get all keys
        dictinary.keySet();

        // get all values
        dictinary.values();

        // Clearing all entries
        // dictinary.clear();

        //  Replacing a value
        dictinary.replace("apple", 180);

       // Merging two maps
        //    dictinary.putAll(anotherMap);

        




    }
}
