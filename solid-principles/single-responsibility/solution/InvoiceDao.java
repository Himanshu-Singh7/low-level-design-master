package solution;

public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB(){
        System.out.println("This class is responsible for save Invoice data in MySQl database");
    }

}
