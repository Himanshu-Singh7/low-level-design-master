package solution;

public class InvoicePrinter {
    Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice(){
        System.out.println("This class is Responsible for print the Invoice");
    }
}
class Test{
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("Marker" , "Black" ,20 ) , 10);
        invoice.calculateTotal();
        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        invoiceDao.saveToDB();
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        invoicePrinter.printInvoice();
    }
}