package delivery;

import invocing.model.Invoice;
import invocing.services.InvoiceService;

import java.util.List;

public class DeliveryService {
    private final InvoiceService service = InvoiceService.build();

    public void deliver(){
        List<Invoice> invoiceList = service.generateInvoices();
        invoiceList.forEach(System.out::println);
    }
}
