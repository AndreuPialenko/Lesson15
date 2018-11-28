public class Person implements Comparable <Person>{

    private int id;
    private String firstName;
    private String lastName;

    @Override
    public int compareTo(Person o) {
//        if (id > o.id) {
//            return 1;
//        }
//
//
//        if (id < o.id) {
//            return -1;
//        }
//        return 0;

//        return (firstName + lastName).compareTo(o.firstName+ o.lastName);

        return o.firstName.compareTo (this.firstName);

    }



    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals (Object obj){
        if (obj == this){
            return true;
        }

        if ((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }

        Person p = (Person) obj;

        return id == p.id && (firstName  == p.firstName || (firstName != null && firstName.equals(p.firstName)) &&
                (lastName != p.lastName || (lastName != null && lastName.equals(p.lastName))));


    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person(13, "Ivan", "Petrov");
        Person p2 = new Person(13, "Ivan", "Petrov");
        Object p3 = new Person(13, "Ivan", "Petrov");

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }
}
