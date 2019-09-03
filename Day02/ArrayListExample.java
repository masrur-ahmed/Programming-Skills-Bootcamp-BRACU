import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("meme");
        arrList.add("memes");
        arrList.add("mimi");
        arrList.add("mimis");
        arrList.add(1, "Hash");
        arrList.add(2,"SHA-256");
        System.out.println("Print All the Objects:");
        for(String s:arrList){
            System.out.println(s);
        }
        System.out.println("Object at index 3 element from list: "+ arrList.get(3));
        System.out.println("Is meme is in list: " + arrList.contains("meme"));
        System.out.println("Size of ArrayList: " + arrList.size());
        arrList.remove("SHA-256");
        System.out.println("New Size of ArrayList: "+ arrList.size());
    }
}