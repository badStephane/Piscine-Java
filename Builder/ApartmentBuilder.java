public class ApartmentBuilder implements HousingBuilder {
    private Apartment apartment;

    public ApartmentBuilder() {
        this.apartment = new Apartment();
    }

    public HousingBuilder setSize(int size) {
        this.apartment.setSize(size);
        return this;
    }

    public HousingBuilder setPrice(int price) {
        this.apartment.setPrice(price);
        return this;
    }

    public HousingBuilder setRooms(int rooms) {
        this.apartment.setRooms(rooms);
        return this;
    }

    public HousingBuilder setName(String name) {
        this.apartment.setName(name);
        return this;
    }

    public Housing build() {
        return this.apartment;
    }
}