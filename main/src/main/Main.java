package main;

import delivery.DeliveryService;
import invocing.model.Invoice;

import java.lang.reflect.Constructor;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DeliveryService service = new DeliveryService();

        List<Invoice> x = service.deliver();
        try {
            Class<?> c=Class.forName("reflection.Reflection");
            Constructor<?> cons=c.getDeclaredConstructor();
            Object o =cons.newInstance();
            System.out.println(o);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
