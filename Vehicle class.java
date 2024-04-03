package WorkPermission;

import java.util.Objects;

public class Vehicle {

    private String plateNumber;
    private String name;
    private String numberSeats;
    private String color;
    private String automaticOrManual;
    private String carOrTruck;

    public vehicle(String plateNumber, String name, String numberSeats, String color, String automaticOrManual, String carOrTruck) {
        this.plateNumber = plateNumber;
        this.name = name;
        this.numberSeats = numberSeats;
        this.color = color;
        this.automaticOrManual = automaticOrManual;
        this.carOrTruck = carOrTruck;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(String numberSeats) {
        this.numberSeats = numberSeats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAutomaticOrManual() {
        return automaticOrManual;
    }

    public void setAutomaticOrManual(String automaticOrManual) {
        this.automaticOrManual = automaticOrManual;
    }

    public String getCarOrTruck() {
        return carOrTruck;
    }

    public void setCarOrTruck(String carOrTruck) {
        this.carOrTruck = carOrTruck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(plateNumber, vehicle.plateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber);
    }

    @Override
    public String toString() {
        return "vehicle{" +
                "plateNumber='" + plateNumber + '\'' +
                ", name='" + name + '\'' +
                ", numberSeats='" + numberSeats + '\'' +
                ", color='" + color + '\'' +
                ", automaticOrManual='" + automaticOrManual + '\'' +
                ", carOrTruck='" + carOrTruck + '\'' +
                '}';
    }
}
