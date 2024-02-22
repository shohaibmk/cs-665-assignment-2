package edu.bu.met.cs665;
import edu.bu.met.cs665.example1.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ShopTest {

    @Test
    public void testRegisterDriver() {
        Shop shop = new Shop();
        Driver driver = new VanDriver();
        shop.registerDriver(driver);
        assertTrue(shop.getDrivers().contains(driver));
    }

    @Test
    public void testUnregisterDriver() {
        Shop shop = new Shop();
        Driver driver = new TaxiDriver();
        shop.registerDriver(driver);
        shop.unregisterDriver(driver);
        assertFalse(shop.getDrivers().contains(driver));
    }

    @Test
    public void testGenerateDeliveryRequest() {
        Shop shop = new Shop();
        Driver driver = new ScooterDriver();
        shop.registerDriver(driver);
        DeliveryRequest request = new DeliveryRequest("Test destination", List.of("Item1", "Item2"));
        shop.generateDeliveryRequest(request);
        assertTrue(driver.hasReceivedNotification());
    }

    @Test
    public void testNotifyDrivers() {
        Shop shop = new Shop();
        Driver vanDriver = new VanDriver();
        Driver taxiDriver = new TaxiDriver();
        shop.registerDriver(vanDriver);
        shop.registerDriver(taxiDriver);
        DeliveryRequest request = new DeliveryRequest("Test destination", List.of("Item1", "Item2"));
        shop.generateDeliveryRequest(request);
        assertTrue(vanDriver.hasReceivedNotification());
        assertTrue(taxiDriver.hasReceivedNotification());
    }

    @Test
    public void testDeliveryRequestToString() {
        DeliveryRequest request = new DeliveryRequest("Test destination", List.of("Item1", "Item2"));
        assertEquals("DeliveryRequest{destination='Test destination', items=[Item1, Item2]}", request.toString());
    }
}
