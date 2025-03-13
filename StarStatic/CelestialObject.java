public class CelestialObject {
    public double x;
    public double y;
    public double z;
    public String name;
    public static final double KM_IN_ONE_AU = 150000000;

    public CelestialObject() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
        name = "Soleil";
    }

    public CelestialObject(String newName, double newX, double newY, double newZ){
        x = newX;
        y = newY;
        z = newZ;
        name = newName;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String getName() {
        return name;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getDistanceBetween(CelestialObject first, CelestialObject second) {
        double point1 = first.getX() - second.getX();
        double point2 = first.getY() - second.getY();
        double point3 = first.getZ() - second.getZ();
        return Math.sqrt(point1 * point1 + point2 * point2 + point3 * point3);
    }

    public static double getDistanceBetweenInKm(CelestialObject first, CelestialObject second) {
        double distance = getDistanceBetween(first, second);
        return distance * KM_IN_ONE_AU;
    }
    
}
