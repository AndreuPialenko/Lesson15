public class PersonVizHashcod {
    private int id;
    private String firstName;
    private String lastName;



    public int hashcode(){
        int result = id;
        result = 31* result + (firstName != null ? firstName.hashCode() : 0);

        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
    //  Если объекты равны по equals, то равны по hashcode
    // Если у двух объектов одиноковый heshcode, то это не значит что они равны
    // Необходимо переопределять 2 метода, потому что они работают в связке - обязательно
    // Если спросят про equals and heshcode - нужно подводить к коллекциям


}
