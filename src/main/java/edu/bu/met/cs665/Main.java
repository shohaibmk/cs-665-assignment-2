/**
 * Name: Shohaib Mallick
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: Main.java
 * Description: Main class
 */

package edu.bu.met.cs665;


import edu.bu.met.cs665.example1.*;

import java.sql.Driver;
import java.util.List;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method.
   */
  public static void main(String[] args) {
    // Create instances of drivers
    VanDriver vanDriver = new VanDriver();
    TaxiDriver taxiDriver = new TaxiDriver();
    ScooterDriver scooterDriver = new ScooterDriver();

    // Create a shop
    Shop shop = new Shop();

    // Register drivers with the shop
    shop.registerDriver(vanDriver);
    shop.registerDriver(taxiDriver);
    shop.registerDriver(scooterDriver);

    // Generate a delivery request
    DeliveryRequest request = new DeliveryRequest("123 Main St", List.of("Clothing items package", "Electrornics box"));

    // Notify drivers about the delivery request
    shop.generateDeliveryRequest(request);
  }
}