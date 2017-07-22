import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Lenovo on 22.07.2017.
 */
public class Translator {
    public static void main(String[] args) {
        Translator translator = new Translator();
        translator.readDataFromConsole();
    }

    private Map<String, String> words;
    private Scanner scanner;

    public Translator() {
        words = new HashMap<>();
        scanner = new Scanner(System.in);

        init();
    }

    private void init(){
        words.put("mama", "mother");
        words.put("tata", "father");
        words.put("kuzyn", "cousin");
        words.put("dziecko", "child");
    }

    public void readDataFromConsole(){
        String response = scanner.nextLine();
        while (!response.equals("exit")){
            if(words.containsKey(response)){
                System.out.println("Tłumaczenie: " + words.get(response));
            }else{
                System.out.println("Nie znam takiego słowa!");
            }
            response = scanner.nextLine();
        }
    }
}
