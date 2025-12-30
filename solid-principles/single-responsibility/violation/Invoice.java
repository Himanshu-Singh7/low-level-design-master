package violation;

public class Invoice {

    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    /** Responsibility 1 . Calculate the total(business logic) **/

    public int calculateTotal(){
        return this.marker.price * this.quantity;
    }

    /** Responsibility 2 . Database operation */

    public void saveToDB(){
        //all logic here to save the data into DB
    }

    /*** Responsibility 3 . print the invoice */

    public void printInvoice(){
        //all logic here to print the invoice
    }

}

class Demo{
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("name" , "color" , 10) ,10);
        invoice.calculateTotal();
        invoice.saveToDB();
        invoice.printInvoice();
    }
}
