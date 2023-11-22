package main;

import delivery.DeliveryService;
import invocing.model.Invoice;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DeliveryService service = new DeliveryService();

        List<Invoice> x = service.deliver();
    }
}
