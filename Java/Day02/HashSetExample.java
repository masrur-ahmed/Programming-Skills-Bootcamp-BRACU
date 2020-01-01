import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        // Adding element to HashSet
        hs.add("Meme");
        hs.add("joss");
        hs.add("Football");
        hs.add("Memes");
        hs.add("Are");
        hs.add("The");
        hs.add("Best");
        System.out.println("Size of HashSet=" + hs.size());
        System.out.println("Original HashSet:" + hs);
        System.out.println("Removing A from HashSet: " + hs.remove("Football"));
        System.out.println("Trying to Remove Troll which is not present: "
                               + hs.remove("Troll"));
        System.out.println("Checking if mimi is present=" + hs.contains("mimi"));
        System.out.println("Updated HashSet: " + hs);
        /*
         public boolean add(Object o) Adds an object to a HashSet if already not present in HashSet.
         public boolean remove(Object o) Removes an object from a HashSet if found in HashSet.
         public boolean contains(Object o) Returns true if object found else return false
         public boolean isEmpty() Returns true if HashSet is empty else return false
         public int size() Returns number of elements in the HashSet */
    }
}
