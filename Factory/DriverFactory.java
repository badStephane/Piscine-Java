public class DriverFactory {
    public static Driver getDriver(String driverType){
        if(driverType == null){
            return null;
        }
        if(driverType.equalsIgnoreCase("Car")){
            return new CarDriver();
        } else if(driverType.equalsIgnoreCase("Plane")){
            return new PlaneDriver();
        } else {
            throw new IllegalArgumentException("Driver type not found");
        }        
    }
}