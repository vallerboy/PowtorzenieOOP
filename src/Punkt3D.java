
public class Punkt3D extends Punkt2D {
    private int pointZ;

    public Punkt3D(int PointX, int PointY, int pointZ) {
        super(PointX, PointY);
        this.pointZ = pointZ;
    }

    public int getPointZ() { return pointZ; }
    public void setPointZ(int pointZ) { this.pointZ = pointZ; }
}
