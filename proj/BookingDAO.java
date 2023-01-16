import java.util.*;

/**
 * The BookingDAO is in charge of the Bookings objects in the system.
 */
public class BookingDAO {
    // instance variables required
    private ArrayList<Booking> bookingList;

    /**
     * Constructs a BookingDAO object.
     * @param studentDAO  the StudentDAO object
     * @param facilityDAO  the FacilityDAO object
     */
    public BookingDAO(StudentDAO studentDAO, FacilityDAO facilityDAO) {
        // TODO
        // initialize the attributes
        bookingList = new ArrayList<>();
        bookingList.add(new Booking(studentDAO.retrieve("raini"), 
                                    facilityDAO.retrieve("F005"), 
                                    new BrosDate("28/09/2016 16:05"),
                                    new BrosDate("14/11/2016 15:00"), 
                                    2));
        bookingList.add(new Booking(studentDAO.retrieve("hyun"), 
                                    facilityDAO.retrieve("F006"), 
                                    new BrosDate("28/09/2016 16:05"),
                                    new BrosDate("14/11/2016 15:00"), 
                                    2));
        bookingList.add(new Booking(studentDAO.retrieve("aaron"), 
                                    facilityDAO.retrieve("F003"), 
                                    new BrosDate("29/09/2016 16:06"),
                                    new BrosDate("15/11/2016 13:00"), 
                                    1));
        bookingList.add(new Booking(studentDAO.retrieve("aaron"), 
                                    facilityDAO.retrieve("F003"), 
                                    new BrosDate("29/09/2016 16:06"),
                                    new BrosDate("18/11/2016 18:00"), 
                                    2));
        bookingList.add(new Booking(studentDAO.retrieve("simi"), 
                                    facilityDAO.retrieve("F001"), 
                                    new BrosDate("30/09/2016 17:00"),
                                    new BrosDate("19/11/2016 10:00"), 
                                    3));
    }

    /**
     * Retrieves all the Bookings in the system
     * @return the list of bookings
     */
    public ArrayList<Booking> retrieveAll() {
        return bookingList;
    }

    /**
     * Retrieves the list of bookings that belongs to a specific student
     * @param username the student username
     * @return  the list of student's booking or an empty ArrayList if this student has no booking
     */
    public ArrayList<Booking> retrieve(String username) {
        int size = bookingList.size();
        ArrayList<Booking> newList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            Booking current = bookingList.get(i);
            if (username.equals(current.getStudent().getUsername()))
            newList.add(current);
        }
        return newList;
    }

    /**
     * Checks that this newBooking timing does not overlap with an existing booking.
     * Then it adds the new booking to the list managed by this DAO.
     * @param newBooking the new Booking object
     * @return true if this booking is added successfully (i.e. there are no overlap with an
     *         existing booking, false otherwise.
     */
    public boolean add(Booking newBooking) {
        int size = bookingList.size();
        for (int i = 0; i < size; i++) {
            Booking current = bookingList.get(i);
            if (newBooking.overlaps(current)) return false;
        }

        bookingList.add(newBooking);
        return true;
    }
}
