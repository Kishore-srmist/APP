class Main {
    static void availableSlot(String[] slots, String[] vehicle,
                              String[] status, String type) {
        for (int i = 0; i < slots.length; i++) {
            if (vehicle[i].equals(type) &&
                status[i].equals("Available")) {
                System.out.println(slots[i]);
            }
        }
    }

    public static void main(String[] args) {
        String[] slots = {"S1", "S2", "S3", "S4", "S5"};
        String[] vehicle = {"Car", "Bike", "Car", "Bike", "Car"};
        String[] status = {
            "Available", "Occupied", "Available",
            "Available", "Occupied"
        };

        System.out.println("Available car parking slots:");
        availableSlot(slots, vehicle, status, "Car");
    }
}
