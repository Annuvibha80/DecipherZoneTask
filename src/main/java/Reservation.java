public class Reservation {
    private String customerName;
    private int roomNumber;
    private String date;

    public Reservation(String customerName, int roomNumber, String date) {
        this.customerName = customerName;
        this.roomNumber = roomNumber;
        this.date = date;
    }

    // Getters  -< to fetch the details
    public String getCustomerName() {
        return customerName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getDate() {
        return date;
    }


    // To display reservation details
    @Override
    public String toString() {
        return "Reservation [Customer: " + customerName +
                ", Room: " + roomNumber +
                ", Date: " + date + "]";
    }


}


