
public class ticketbooking {

	public static void main(String[] args) {
		// ticket booking case study
		int noOfTickets = 2;
		int silverTicketPrice = 150;
		int goldTicketPrice = 200;
		String ticketType = "Gold";
		int totalPrice;
		if (ticketType.equalsIgnoreCase("silver")) {
			totalPrice = noOfTickets * silverTicketPrice;
			System.out.println("Total silver tickets price is " + totalPrice);
		}
		else {
			totalPrice = noOfTickets * goldTicketPrice;
			System.out.println("Total Gold tickets price is " + totalPrice);
		}

	}

}
