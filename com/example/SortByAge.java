import java.util.LinkedList;

public class SortByAge {
    public static void main(String[] args) {
        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Alice", 20));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 25));
        // LinkedListを年齢で昇順に並び替え
        people.sort(new ListComparator());

        for (Person p : people) {
            System.out.println(p.getName() + "," + p.getAge());
        }
    }
}
