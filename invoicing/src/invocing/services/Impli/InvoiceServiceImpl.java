package invocing.services.Impli;

import invocing.model.Invoice;
import invocing.services.InvoiceService;

import java.util.List;

public class InvoiceServiceImpl implements InvoiceService {
    @Override
    public List<Invoice> generateInvoices(){
        var i=new Invoice();
        i.setAmount(10);
        return List.of(i);
    }
}
