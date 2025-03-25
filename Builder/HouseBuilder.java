public class HouseBuilder implements HousingBuilder {
    private Housing house;

    public HouseBuilder() {
        this.house = new House();
    }

    public HousingBuilder setSize(int size) {
        this.house.setSize(size);
        return this;
    }

    public HousingBuilder setPrice(int price) {
        this.house.setPrice(price);
        return this;
    }

    public HousingBuilder setRooms(int rooms) {
        this.house.setRooms(rooms);
        return this;
    }

    public HousingBuilder setName(String name) {
        this.house.setName(name);
        return this;
    }

    public Housing build() {
        return this.house;
    }
}