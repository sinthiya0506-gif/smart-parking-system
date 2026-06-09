import java.util.Scanner;

class SmartParkingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSlots = 5;
        int choice;

        System.out.println("===== SMART PARKING SYSTEM =====");

        do {
            System.out.println("\n1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Check Available Slots");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (totalSlots > 0) {
                        totalSlots--;
                        System.out.println("Vehicle Parked Successfully!");
                    } else {
                        System.out.println("Parking Full!");
                    }
                    break;

                case 2:
                    if (totalSlots < 5) {
                        totalSlots++;
                        System.out.println("Vehicle Removed Successfully!");
                    } else {
                        System.out.println("Parking is Already Empty!");
                    }
                    break;

                case 3:
                    System.out.println("Available Slots: " + totalSlots);
                    break;

                case 4:
                    System.out.println("Thank You for Using Smart Parking System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}