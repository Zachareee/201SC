import java.util.ArrayList;

/**
 * The FacilityDAO is in charge of the Facility objects in the system.
 */
public class FacilityDAO {
    private ArrayList<Facility> facilityList;

    /**
     * Constructs a FacilityDAO with the initial list
     * of Facility (refer to project writeup)
     */
    public FacilityDAO() {
        facilityList = new ArrayList<>();
        facilityList.add(new Facility("F001", "Room 2-1", 4));
        facilityList.add(new Facility("F002", "Room 2-2", 6));
        facilityList.add(new Facility("F003", "Room 2-3", 8));
        facilityList.add(new Facility("F004", "Room 2-4", 10));
        facilityList.add(new Facility("F005", "Room 2-5", 12));
        facilityList.add(new Facility("F006", "Room 2-6", 14));
        facilityList.add(new Facility("F007", "Room 2-7", 16));
    }

    /**
     * Retrieves all the Facility objects currently available in the System.
     * This should only be used for the "List all facility" functionality.
     * @return list of all Facility objects
     */
    public ArrayList<Facility> retrieveAll() {
        return facilityList;
    }

    /**
     * Retrieves a facility with the specified facilityID
     * @param facilityID the unique identifier of the facility
     * @return the Facility object, returns null if the facility does not exist.
     */
    public Facility retrieve(String facilityID) {
        int size = facilityList.size();
        facilityID = facilityID.trim();
        for (int i = 0; i < size; i++) {
            Facility current = facilityList.get(i);
            if (facilityID.equals(current.getId())) {
                return current;
            }
        }
        return null;
    }

}
