import java.util.*;

/**
 * Created by Lenovo on 22.07.2017.
 */
public class Repeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczby rozdzielone spacją: ");
        String integers = scanner.nextLine();

        String[] arrayOfIntegers = integers.split(" ");
        Set<String> setOfIntegers = new HashSet<>(Arrays.asList(arrayOfIntegers));


        int counter = 0;
        for (String arrayOfInteger : setOfIntegers) {
            for (String integer : arrayOfIntegers) {
                if(integer.equals(arrayOfInteger)){
                    counter ++;
                }
            }
            System.out.println("Wystąpień liczby " + arrayOfInteger + ": " + counter);
            counter = 0;
         }

    }
}
