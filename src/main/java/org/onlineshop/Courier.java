package org.onlineshop;

public class Courier {
    private int id;
    private String name;
    private String vehicleType;
    private boolean isAvailable;

    public Courier(int id, String name, String vehicleType, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.vehicleType = vehicleType;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Метод-переключатель доступности
    public void toggleAvailability() {
        isAvailable = !isAvailable;
    }

    @Override
    public String toString() {
        return "Courier id=" + id +
                ", name='" + name + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", isAvailable=" + isAvailable;
    }
}
