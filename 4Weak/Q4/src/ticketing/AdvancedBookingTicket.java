package ticketing;
import ticketing.entity.*;

public class AdvancedBookingTicket extends Ticket {
    private int numDaysInAdvance;
    public AdvancedBookingTicket(String title, int numDaysInAdvance) {
        super(title);
        this.numDaysInAdvance = numDaysInAdvance;
    }

    public double calculatePrice() {
        double price = super.calculatePrice();
        double discountedPrice = price - numDaysInAdvance * 0.5;
        return discountedPrice < price * 0.5 ? price * 0.5 : discountedPrice; 
    }
}
