package Parking.Enum;

public enum ParkingSpotType {

    BIKE("BIKE", 20),
    CAR("CAR", 50),
    TRUCK("TRUCK", 100);

    private int price;
    private String value;

    ParkingSpotType(String value, int price) {
        this.value = value;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getValue() {
        return value;
    }
}
