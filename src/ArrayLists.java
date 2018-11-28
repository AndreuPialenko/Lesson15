import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();


        String nick = "Nick"; // создаем переменные
        String ivan = "Ivan";
        String vasily = "Vasily";

        names.add(nick); // добавляем переменные
        names.add(ivan);
        names.add(vasily);
        names.add("Stepan");

        System.out.println(names.size());
        System.out.println(names.get(3));

        if (names.contains("Ivan")){
            System.out.println("Hello Ivan");
        }

        System.out.println(names.remove(0));
        System.out.println(names.remove("Dmitry"));


//        for (String name: names){
//            System.out.println(name);
//        }
//
//        for (String name: names){
//            if ("Ivan".equals(name)){
//                names.remove(name);
//            }
//        }

        //Используем Iterator

        Iterator <String> namesIterator = names.iterator();

        while (namesIterator.hasNext()){
            String name = namesIterator.next();

            if ("Nick".equals(name)){
                namesIterator.remove();
            }
        }





    }


    }

