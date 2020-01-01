import java.util.LinkedHashMap;
public class LinkedHashMapExample {
 public static void main (String args[]){
  //Here Insertion order maintains 
  LinkedHashMap<Integer, String>lmap = new LinkedHashMap<Integer, String>();
  lmap.put(5, "# of wanted stars i try to get on GTA");
  lmap.put(4, "The GPA i want from MNS");
  lmap.put(2.7, "The GPA I Get From MNS");
  lmap.put(0, "The amount of love i got for MNS");
  lmap.put(99999999999, "The amount of Afosos i get on MNS Grade");
  System.out.println("LinkedHashMap before modification" + lmap);
  System.out.println("Is the value 0 exists: " +lmap.containsKey(0));
  System.out.println("is there any game thing : "+lmap.containsValue("# of wanted stars i try to get on GTA"));
  System.out.println("size of the map : "+ lmap.size());
  System.out.println("Removing Love for MNS " + lmap.remove(0));
  System.out.println("Removing my GPA existances from my gradesheet (which is impossible): " + lmap.remove(999999));
  System.out.println("LinkedHashMap After modification" + lmap);
 }
}