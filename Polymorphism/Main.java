import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read booking input
        String bookingInput = sc.nextLine();
        String[] bookingDetails = bookingInput.split(",");

        String stageEvent = bookingDetails[0];
        String customer = bookingDetails[1];
        int noOfSeats = Integer.parseInt(bookingDetails[2]);

        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        // Read payment mode
        int choice = Integer.parseInt(sc.nextLine());

        // Print ticket details
        System.out.println("Stage event:" + booking.getStageEvent());
        System.out.println("Customer:" + booking.getCustomer());
        System.out.println("Number of seats:" + booking.getNoOfSeats());

        switch (choice) {
            case 1:
                double amount1 = Double.parseDouble(sc.nextLine());
                booking.makePayment(amount1);
                break;
            case 2:
                double amount2 = Double.parseDouble(sc.nextLine());
                String walletNumber = sc.nextLine();
                booking.makePayment(amount2, walletNumber);
                break;
            case 3:
                String holderName = sc.nextLine();
                double amount3 = Double.parseDouble(sc.nextLine());
                String creditCardType = sc.nextLine();
                String ccv = sc.nextLine();
                booking.makePayment(holderName, amount3, creditCardType, ccv);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        sc.close();
    }
}
