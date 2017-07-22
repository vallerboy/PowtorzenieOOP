import java.util.*;

/**
 * Created by Lenovo on 22.07.2017.
 */
public class Lotto {
    public static void main(String[] args) {
        Set<Integer> integerSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        Random random = new Random();

        while(integerSet.size() != 6){
           integerSet.add(random.nextInt(48) + 1);
        }


        System.out.println("Twoje wylosowane liczby to: ");
        for (Integer integer : integerSet) {
            System.out.println("Liczba: " + integer);
        }

    }




}
