
import java.util.LinkedList;

public class LinkdList {
    public static void main(String[] args) {

        LinkedList<String> linkedNames = new LinkedList<> ();

        String nick = "Nick"; // создаем переменные
        String ivan = "Ivan";
        String vasily = "Vasily";

        linkedNames.addFirst("Olga"); // добавляем переменные
        linkedNames.addLast("Helga");

        linkedNames.removeLast();
        linkedNames.get(2);

    }
}
