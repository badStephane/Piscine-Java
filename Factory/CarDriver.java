public class CarDriver extends Driver{
    public Transport createTransport(){
        return TransportFactory.getTransport("Car");
    }
}