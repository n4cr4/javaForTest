import java.util.Comparator;

import person.Person;

public class ListComparator implements Comparator<Person> { // Comparatorインタフェースを利用
    public int compare(Person p1, Person p2) { // compareメソッドを実装
        // p1がより若ければ負
        // p1 == p2 で0
        // p2 が若ければ正
        return p1.getAge() - p2.getAge();
    }
}
