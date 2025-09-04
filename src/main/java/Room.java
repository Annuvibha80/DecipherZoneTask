public class Room {
    private int room;
    private String type;
    private double price;
    private boolean available;

    Room(int room, String type, double price, boolean available ){
        this.room = room;
        this.type = type;
        this.price = price;
        this.available =  true;
    }

    public static boolean isAvailable(boolean available){
        return available;
    }


    // 1. Getters
    public int getRoomNumber() {
        return room;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }



    // 2. Book a room
    public void bookRoom() {
        if (available) {
            available = false; // mark as  booked
            System.out.println("Room " + room + " booked successfully!");
        } else {
            System.out.println("Room " + room + " is already booked!");
        }
    }

    // 3. Cancel booking
    public void cancelBooking() {
        if (!available) {
            available = true; // mark as free
            System.out.println("Booking for Room " + room + " cancelled.");
        } else {
            System.out.println("Room " + room + " was already free!");
        }
    }


    // 4. Show room details
    public void displayRoomInfo() {
        System.out.println(
                " Room No: " + room +
                " | Type: " + type +
                " | Price: " + price +
                " | Available: " + available);
    }
}

