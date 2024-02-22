package edu.bu.met.cs665.example1;

public class ScooterDriver implements Driver {
    private boolean receivedNotification;

    @Override
    public void notify(DeliveryRequest request) {
        System.out.println("Scooter driver notified about delivery request: " + request);
        receivedNotification = true;
    }

    @Override
    public boolean hasReceivedNotification() {
        return receivedNotification;
    }
}
