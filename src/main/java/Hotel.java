import java.util.ArrayList;

public class Hotel {

    ArrayList <Room> rooms = new ArrayList<>();
    ArrayList<Reservation> reservations = new ArrayList<>();

    // 1. Add a room
    public void addRoom(Room r) { //r point to the same object as r1 in main class |Room r1 = new Room(101, "Single", 1500, true);|
        rooms.add(r);
    }


    // 2. Show available rooms
    public void showAvailableRooms() {
        for (Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println("Room " + room.getRoomNumber() +
                        " (" + room.getType() + ") - ₹" + room.getPrice());
            }
        }
    }


    // 3. Make a reservation
    public void makeReservation(String customerName, int roomNumber, String date) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && room.isAvailable()) {
                room.bookRoom(); // mark booked
                Reservation res = new Reservation(customerName, roomNumber, date);
                reservations.add(res);
                System.out.println("Reservation confirmed for " + customerName);
                return;
            }
        }
        System.out.println("Room not available!");
    }


    // 4. Show all reservations
    public void showReservations() {
        for (Reservation res : reservations) {
            System.out.println(res);
        }
    }
}


