package domain.car;

public class Car {
    private String color;
    private CarType type;

    public Car() {
        
    }

    public Car(String color, CarType type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", type=" + type +
                '}';
    }
}
