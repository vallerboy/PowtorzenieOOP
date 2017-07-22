import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Lenovo on 22.07.2017.
 */
public class Main {

    private static List<String> listOfNames;
    private static Scanner scanner;

    public static void main(String[] args) {
        listOfNames = new ArrayList<>();
        scanner = new Scanner(System.in);

        int choice;
        do{
            printMenu();
            choice = Integer.parseInt(scanner.nextLine());
            parseChoice(choice);
        }while (choice != 3);

    }

    private static void printMenu(){
        System.out.println("-------------------------------------");
        System.out.println("Wpisz: ");
        System.out.println("1 - aby dodać nowe imię");
        System.out.println("2 - aby wyświetlić wszystkie imiona");
        System.out.println("3 - aby wyjść");

        System.out.print("Twój wybór: ");
        System.out.println("-------------------------------------");
    }

    private static void parseChoice(int choice){
        switch (choice){
            case 1: {
                System.out.print("Wpisz imię: ");
                listOfNames.add(scanner.nextLine());
                System.out.println("Dodałem imię!");
                break;
            }
            case 2: {
                for (String listOfName : listOfNames) {
                    System.out.println(listOfName);
                }
                break;
            }
            default: {
                System.out.println("Nie znam takiej komendy!");
            }
        }
    }
}
