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
    }

    /**
     * Retrieves all the Bookings in the system
     * @return the list of bookings
     */
    public ArrayList<Booking> retrieveAll() {
        // TODO
        return null;
    }

    /**
     * Retrieves the list of bookings that belongs to a specific student
     * @param username the student username
     * @return  the list of student's booking or an empty ArrayList if this student has no booking
     */
    public ArrayList<Booking> retrieve(String username) {
        // TODO
        return null;
    }

    /**
     * Checks that this newBooking timing does not overlap with an existing booking.
     * Then it adds the new booking to the list managed by this DAO.
     * @param newBooking the new Booking object
     * @return true if this booking is added successfully (i.e. there are no overlap with an
     *         existing booking, false otherwise.
     */
    public boolean add(Booking newBooking) {
        // TODO
        return false;
    }
}
