/**
 * Created by Lenovo on 22.07.2017.
 */
public class Punkt2D {

    private int x;
    private int y;

    public Punkt2D() {
        this(0, 0);
    }

    public Punkt2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
