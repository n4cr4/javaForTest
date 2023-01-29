import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("cherry");

        list.remove(1); // インデックス指定

        // for (String s : list) {
        // System.out.println(s);
        // }

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
