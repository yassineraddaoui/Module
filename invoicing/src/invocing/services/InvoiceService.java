package invocing.services;

import invocing.model.Invoice;

import java.util.List;

public class InvoiceService {
    public List<Invoice> generateInvoices(){
        var i=new Invoice();
        i.setAmount(10);
        return List.of(i);
    }
}
