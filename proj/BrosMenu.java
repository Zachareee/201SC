import java.util.*;

/**
 * This is in charge of the user interface of the booking system.
 * You should write all the println and sc.nextXX() methods here (single responsibility).
 *
 */
public class BrosMenu {
    private StudentDAO studentDAO;
    private FacilityDAO facilityDAO;
    private BookingDAO bookingDAO;

    /**
     * Creates the BrosMenu object.
     * The DAO objects (StudentDAO, FacilityDAO and BookingDAO)
     * are initialized here.
     */
    public BrosMenu() {
        studentDAO = new StudentDAO();
        facilityDAO = new FacilityDAO();
        bookingDAO = new BookingDAO(studentDAO, facilityDAO);
    }    

    /**
     * Displays the menu
     */
    public void displayMenu() {
        System.out.println();
        System.out.println("== BROS :: Main Menu ==\n");
        System.out.println("1. List all Students");
        System.out.println("2. List all Facilities");
        System.out.println("3. List all Bookings");
        System.out.println("4. List all Bookings by a student");
        System.out.println("5. Add a Student");
        System.out.println("6. Book a Facility");
        System.out.println("7. Quit Application");
        System.out.print("Enter your choice >");
    }


    /**
     * This is the method that kick starts the whole application.
     * It runs in a loop (until the user selects to quit). In
     * each iteration, it displays the menu by calling displayMenu(),
     * prompts the user to select a choice,
     * and then invoke the processXX method to process the request.
     */
    public void execute() {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            displayMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    processListAllStudent();
                    break;
                case 2:
                    processListAllFacilities();
                    break;
                case 3:
                    processListAllBookings();
                    break;
                case 4:
                    processListAllBookingByAStudent(sc);
                    break;
                case 5:
                    processAddAStudent(sc);
                    break;
                case 6:
                    processBookAFacility(sc);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("You did not enter a valid option (1 to 7)");
            }
        } while (choice != 7);
        sc.close();
    }

    /**
     * Process the request of listing all students in the system.
     */
    public void processListAllStudent() {
        ArrayList<Student> StuArray = studentDAO.retrieveAll();
        int size = StuArray.size();
        if (size == 0) {
            System.out.println("There is no student");
            return;
        }

        System.out.println("== BROS :: List all Students ==\n");
        System.out.println("S/N   Username    Name                E$");

        for (int i = 0; i < size; i++) {
            Student current = StuArray.get(i);
            System.out.print(i + 1 + "     ");

            String username = current.getUsername();
            System.out.print(username + " ".repeat(12 - username.length()));

            String name = current.getName();
            System.out.print(current.getName() + " ".repeat(20 - name.length()));

            System.out.println(current.getBalance());
        }
    }
    
    /**
     * Process the request of listing all facilities in the system.
     */
    public void processListAllFacilities() {
        ArrayList<Facility> FacilArray = facilityDAO.retrieveAll();
        int size = FacilArray.size();
        if (size == 0) {
            System.out.println("There is no facility");
            return;
        }

        System.out.println("== BROS :: List all Facilities ==\n");
        System.out.println("S/N    ID    Description   Capacity");

        for (int i = 0; i < size; i++) {
            Facility current = FacilArray.get(i);
            System.out.print(i + 1 + ".     ");
            System.out.print(current.getId() + "  ");
            System.out.print(current.getDescription() + "      ");
            System.out.println(current.getCapacity());
        }
    }
    
    /**
     * Process the request of listing all bookings in the system.
     */
    public void processListAllBookings() {
        ArrayList<Booking> BookArray = bookingDAO.retrieveAll();
        if (BookArray == null) {
            System.out.println("There is no booking");
            return;
        }

        System.out.println("== BROS :: List all Bookings ==\n");
        System.out.println("Facility  Booking DateTime  Start DateTime    Duration   Student");

        int size = BookArray.size();
        for (int i = 0; i < size; i++) {
            Booking current = BookArray.get(i);
            System.out.print(current.getFacility().getId());
            System.out.print("      " + current.getBookingDate());
            System.out.print("  " + current.getStartDate());
            System.out.print("  " + current.getDuration());
            System.out.println("          " + current.getStudent().getUsername());
        }
        
    }

    /**
     * Process the request of adding a student in the system.
     * 1. Prompts the user for the username, full name and initial balance of the student.
     * 2. Adds the student object to the list managed by the StudentDAO.
     */
    public void processAddAStudent(Scanner sc) {
        sc.nextLine();
        System.out.println("== BROS :: Add a Student ==\n");
        System.out.print("Enter username >");
        String username = sc.nextLine();
        if (studentDAO.retrieve(username) != null) {
            System.out.println("username not available");
            return;
        }

        System.out.print("Enter name >");
        String name = sc.nextLine();

        System.out.print("Enter the E$ >");
        int money = sc.nextInt();

        studentDAO.add(username, name, money);
        System.out.println(name + " added!");
    }


    /**
     * Process the request of listing all the bookings by a specific user.
     * 1. Prompts the user for the username
     * 2. Displays the list of bookings by the student
     */
    public void processListAllBookingByAStudent(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter username >");
        String username = sc.nextLine();

        if (studentDAO.retrieve(username) == null) {
            System.out.println("The username is invalid");
            return;
        }

        ArrayList<Booking> bookings = bookingDAO.retrieve(username);
        int size = bookings.size();

        if (size == 0) {
            System.out.println("This student has not made any booking");
            return;
        }

        System.out.println("== BROS :: Bookings by " + username + " ==\n");
        System.out.println("Facility   Booking DateTime  Start DateTime    Duration");
        for (int i = 0; i < size; i++) {
            Booking current = bookings.get(i);
            System.out.print(current.getFacility().getId());
            System.out.print("       " + current.getBookingDate());
            System.out.print("  " + current.getStartDate());
            System.out.println("  " + current.getDuration());
        }
    }

    /**
     * Process the request of booking a facility.
     * 1. Prompt the user for username, facility ID, start date and time, and duration
     * 2. Perform the validations (in the writeup). For example, insufficient balance etc
     * 3. Adds the booking object to the list managed by the BookingDAO
     */
    public void processBookAFacility(Scanner sc) {
        sc.nextLine();
        System.out.println("== BROS :: Book a Facility ==\n");
        System.out.print("Enter username >");
        String username = sc.nextLine();
        Student student = studentDAO.retrieve(username);
        
        while (student == null) {
            System.out.println("The username is invalid. Please try again.");
            System.out.print("Enter username >");
            username = sc.nextLine();
            student = studentDAO.retrieve(username);
        }

        System.out.print("Enter facility ID >");
        String facilityID = sc.nextLine();
        Facility facility = facilityDAO.retrieve(facilityID);
        
        while (facility == null) {
            System.out.println("Facility is not available for booking. Please try again.");
            System.out.print("Enter facility ID >");
            facilityID = sc.nextLine();
            facility = facilityDAO.retrieve(facilityID);
        }

        System.out.print("Enter start date (DD/MM/YYYY) >");
        String startDate = sc.nextLine();
        
        System.out.print("Enter start time (HH:00) >");
        String startTime = sc.nextLine();
        BrosDate start = new BrosDate(startDate + ' ' + startTime);
        
        System.out.print("Enter number of hours >");
        int duration = sc.nextInt();
        
        int balance = student.getBalance();
        int cost = facility.getPrice() * duration;
        if (balance < cost) {
            System.out.println("You have E$" + balance + " left");
            System.out.println("You do not have enough E$ to book this facility.");
            return;
        }
        
        Booking newBooking = new Booking(student, facility, start, duration);
        if (!bookingDAO.add(newBooking)) {
            System.out.println("Booking overlaps with another booking. Please try again.");
            return;
        }

        student.deduct(cost);
        System.out.println("You have successfully booked this facility.");
        System.out.println("You have " + (balance - cost) + " E$ left.");
    }
}
