import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> rooms;           // list of all rooms
    private ArrayList<Reservation> reservations;  // list of all reservations

    public Hotel() {
        rooms = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    // Add a new room to the hotel
    public void addRoom(Room room) {
        rooms.add(room);
    }

    // Show all rooms that are available
    public void showAvailableRooms() {
        for (Room r : rooms) {
            if (r.isAvailable()) {
                System.out.println("Room " + r.getRoomNumber() +
                        " (" + r.getType() + ") - Rs." + r.getPrice());
            }
        }
    }

    // Make a reservation
    public void makeReservation(String customerName, int roomNo, String date) {
        for (Room r : rooms) {
            if (r.getRoomNumber() == roomNo && r.isAvailable()) {
                r.bookRoom();   // mark the room as booked
                Reservation res = new Reservation(customerName, roomNo, date);
                reservations.add(res); // store the reservation
                System.out.println("Reservation created successfully!");
                return;
            }
        }
        System.out.println("Room " + roomNo + " is not available!");
    }

    // Show all reservations
    public void showReservations() {
        if (reservations.isEmpty()) {
            System.out.println("No reservations yet!");
        } else {
            for (Reservation res : reservations) {
                System.out.println(res); // calls toString() in Reservation
            }
        }
    }
}
