package edu.bu.met.cs665.example1;

import java.util.List;

public class DeliveryRequest {
    private String destination;
    private List<String> items;

    public DeliveryRequest(String destination, List<String> items) {
        this.destination = destination;
        this.items = items;
    }

    @Override
    public String toString() {
        return "DeliveryRequest{" +
                "destination='" + destination + '\'' +
                ", items=" + items +
                '}';
    }
}
