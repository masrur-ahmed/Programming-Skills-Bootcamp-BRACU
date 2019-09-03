import java.util.Iterator;
import java.util.TreeSet;
public class CustomTreeSetExample {
    public static void main(String[] args) {
        TreeSet<Footballer> players = new TreeSet<Footballer>(
                                                              new CompareFootballer());
        players.add(new Footballer("Messi", 51));
        players.add(new Footballer("Cristiano", 48));
        players.add(new Footballer("Neymar", 7));
        players.add(new Footballer("Mbappe", 8));
        players.add(new Footballer("Masrur", 1000));
        Iterator<Footballer> it = players.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }
    }
}