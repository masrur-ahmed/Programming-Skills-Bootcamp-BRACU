import java.util.Map;
import java.util.TreeMap;
public class TreeMapExample {
 public static void main(String[] args) {
  Map<String, Integer> tMap = new TreeMap<String, String>();
  
  tMap.put("Dine gorom", "raat e sheeeet");
  tMap.put("Chole elo  ", "Qurbanir eid");
  tMap.put("Ashchorjo ", " call kete gelo keno");
  tMap.put("Ashchorjo ", "se rege gelo keno");
  tMap.put("Ashchorjo ", " block korlo keno");
  
  System.out.println("Sorted  by the first string: "+tMap);
  tMap.put("Ashchorjo", "Unblock kore na keno");
  tMap.remove("Dine gorom");
  System.out.println("Updated tree map: "+tMap);
 }
}