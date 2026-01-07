package solution;

public class Invoice {

    Marker marker;
    int quantity;

    public Invoice (Marker marker , int quantity){
        this.marker = marker;
        this.quantity= quantity;
    }
    // This class is responsible for calculate the total bussiness logic
    public void calculateTotal(){
        System.out.println(this.marker.price * this.quantity);
    }
}
