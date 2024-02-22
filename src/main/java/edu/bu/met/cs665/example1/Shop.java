package edu.bu.met.cs665.example1;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private final List<Driver> drivers;

    public Shop() {
        this.drivers = new ArrayList<>();
    }

    // Add a driver to the list of registered drivers
    public void registerDriver(Driver driver) {
        drivers.add(driver);
    }

    // Remove a driver from the list of registered drivers
    public void unregisterDriver(Driver driver) {
        drivers.remove(driver);
    }

    // Generate a delivery request and notify all registered drivers
    public void generateDeliveryRequest(DeliveryRequest request) {
        System.out.println("New delivery request generated: " + request);
        notifyDrivers(request);
    }

    // Notify all registered drivers about the delivery request
    private void notifyDrivers(DeliveryRequest request) {
        for (Driver driver : drivers) {
            driver.notify(request);
        }
    }

    public List<Driver> getDrivers() {
        return drivers;
    }
}
