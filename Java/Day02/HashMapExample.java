import java.util.*;
public class HashMapExample {
 public static void main(String[] args) {
  //Below Line will create HashMap with initial size 30 and 0.5 load factor
  Map<String, Integer>club = new HashMap<String, Integer>(10, 0.5f);
  //Adding Club name and just a number to map
  club.put("Barcelona", 3333);
  club.put("Real Madrid", 20000);
  club.put("Looserpool", 30000);
  club.put("Farmers", 1000); // guess the club lol
  club.put("Chelsea", 15000);
  club.put("oil Money", 10000); // Duplicate Value also allowed but Keys should not be duplicate,
  club.put("Valverde", null); //Value can be null as well
  System.out.println("Original Map: "+ club);// Printing full Map 
  //Adding new Club the Map to see ordering of object changes
  club.put("Barcelona", 23000);
  //Removing one key-value pair, removing the club who got zero champions league
  club.remove("Farmers");
  System.out.println("Updated Map: "+club);// Printing full Map 
  //Printing all Keys
  System.out.println(club.keySet());
  //Printing all Values
  System.out.println(club.values());
 }
}