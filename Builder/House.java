public class House implements Housing {
    private int size;
    private int price;
    private int rooms;
    private String name;

    public House() {}

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
        return "House{size=" + this.size + ", price=" + this.price + ", rooms=" + this.rooms + ", name='" + this.name + "'}";
    }
}