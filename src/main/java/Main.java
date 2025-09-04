import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();

        // Add some rooms at start (you can also add dynamically)
        Room r1 = new Room(101, "Single", 1500, true);
        hotel.addRoom(r1);

        Room r2 = new Room(102, "Double", 2500, true);
        hotel.addRoom(r2);

        Room r3 = new Room(103, "Double", 2500, true);
        hotel.addRoom(r3);



        int choice;
        do {
            System.out.println("\n==== Hotel Reservation System ====");
            System.out.println("1. Show Available Rooms");
            System.out.println("2. Make a Reservation");
            System.out.println("3. Show All Reservations");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    hotel.showAvailableRooms();
                    break;

                case 2:
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Room Number: ");
                    int roomNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Date (DD-MM-YYYY): ");
                    String date = sc.nextLine();

                    hotel.makeReservation(name, roomNo, date);
                    break;

                case 3:
                    hotel.showReservations();
                    break;

                case 4:
                    System.out.println("Thank you! Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
