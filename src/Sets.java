import java.util.HashSet;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("Nick");
        names.add("Ivan");
        names.add("Vasily");
        names.add("Nick");

        for (String name: names){
            System.out.println(name);
        }
        System.out.println(" ");

        HashSet<Person> persons = new HashSet<>();

        persons.add(new Person(50, "Ivan", "Ivanov"));
        persons.add(new Person(12, "Ivan", "Ivanov"));
        persons.add(new Person(100, "Evgen", "Stepanov"));
        persons.add(new Person(20, "Oleg", "Drozdov"));




        for (Person p: persons){
            System.out.println(p);
        }

        System.out.println(" ");

        TreeSet<Person> person = new TreeSet<>();

        person.add(new Person(20, "Ivan", "Ivanov"));
        person.add(new Person(20, "Ivan", "Ivanov"));
        person.add(new Person(20, "Evgen", "Stepanov"));


        for (Person p: person){
            System.out.println(p);
        }

        System.out.println(" ");




    }
}
