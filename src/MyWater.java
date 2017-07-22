
/**
 * Created by Lenovo on 19.07.2017.
 */
public class MyWater {
    public static int BIG_BOTTLE = 2;
    public static int MID_BOTTLE = 1;
    public static double SMALL_BOTTLE = 0.5;

    private int countBig;
    private int countMid;
    private int countSmall;

    public MyWater() { }

    public void addLargeBottles(int n){
        countBig += n;
    }

    public void addMiddleBottles(int n){
        countMid += n;
    }

    public void addSmallBottels(int n){
        countSmall += n;
    }

    public int getCountBig() {
        return countBig;
    }

    public int getCountMid() {

        return countMid;
    }

    public int getCountSmall() {
        return countSmall;
    }

    public double getSizeOfAll(){
        return countBig * BIG_BOTTLE + countMid * MID_BOTTLE + countSmall * SMALL_BOTTLE;
    }

    public void show(){
        System.out.println("Pojemność wszystkich: " + getSizeOfAll());
        System.out.println("Ilość dużych: " + countBig);
        System.out.println("Ilość średnich: " + countMid);
        System.out.println("Ilość małych: " + countSmall);
    }


}
