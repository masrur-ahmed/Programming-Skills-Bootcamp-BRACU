import java.util.TreeSet;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> playerSet = new TreeSet<Integer>();
        playerSet.add(99);
        playerSet.add(33);
        playerSet.add(66);
        playerSet.add(200);
        playerSet.add(0);
        playerSet.add(39);
        playerSet.add(36);
        playerSet.add(3);
        playerSet.add(6);
        playerSet.add(666);
        playerSet.add(99); // This is duplicate element so will not be added again
        //below will print list in ascending order
        System.out.println("Original Set:" + playerSet);
        System.out.println("First Number: "+ playerSet.first());
        System.out.println("Last number: "+ playerSet.last());
        TreeSet<Integer> newPlySet = (TreeSet<Integer>) playerSet.subSet(3,666);
        System.out.println("Sub Set: "+ newPlySet);
    }
}