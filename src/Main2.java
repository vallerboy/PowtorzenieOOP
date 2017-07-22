import java.util.*;

/**
 * Created by Lenovo on 22.07.2017.
 */
public class Main2 {
    public static void main(String[] args) {

        // Przyspieszona implementacja
       List<String> stringList = Arrays.asList("Oskar", "Cześć", "Co tam?");

       List<Person> personList = new ArrayList<>();
       personList.add(new Person(80, "Oskar"));
       personList.add(new Person(10, "Aga"));
       personList.add(new Person(24, "Tomek"));
       personList.add(new Person(40, "Julita"));

        Collections.sort(personList, new NameComparator());

        for (Person person : personList) {
            System.out.println(person.toString());
        }






    }

    private static class NameComparator implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
