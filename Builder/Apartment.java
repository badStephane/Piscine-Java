public class Apartment implements Housing {
    private int size;
    private int price;
    private int rooms;
    private String name;

    public Apartment() {}

    public void setSize(int size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Apartment{size=" + this.size + ", price=" + this.price + ", rooms=" + this.rooms + ", name='" + this.name + "'}";
    }
}