package ticketing.utility;
import java.util.ArrayList;
import ticketing.entity.*;

public class TicketUtility {
    public static double calculateAverageTicketPrice(ArrayList<Ticket> ticketList) {
        if (ticketList == null || ticketList.size() == 0) return 0.0;
        int size = ticketList.size();
        double total = 0;
        for (int i = 0; i < size; i++) {
            Ticket tick = ticketList.get(i);
            total += tick.calculatePrice();
        }
        return total / size;
    }
}
