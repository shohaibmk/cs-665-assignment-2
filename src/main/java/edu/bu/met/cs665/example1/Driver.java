package edu.bu.met.cs665.example1;

public interface Driver {
    void notify(DeliveryRequest request);
    boolean hasReceivedNotification();
}
