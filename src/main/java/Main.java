import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>{
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        return this.age - p.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}

class ComparePerson implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }
}


public class Main {
    public static void main(String[] args) {
        ComparePerson comparePerson = new ComparePerson();
        Set set = new TreeSet(comparePerson);
        set.add(new Person(19));
        set.add(new Person(90));
        set.add(new Person(8));
        set.add(new Person(45));
        set.add(new Person(32));
        for (Object o : set){
            System.out.println(o);
        }
//        int max = set.stream().max(((o1, o2) -> Integer.compare(o1.get)))
//        set.
    }
}
