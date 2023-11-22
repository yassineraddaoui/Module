package invocing.services;

import invocing.model.Invoice;
import invocing.services.Impli.InvoiceServiceImpl;

import java.util.List;

public interface InvoiceService {
    List<Invoice> generateInvoices();

    static InvoiceService build() {
        return new InvoiceServiceImpl();
    }
}
