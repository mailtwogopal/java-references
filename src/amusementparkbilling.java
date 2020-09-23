
public class amusementparkbilling {

	public static void main(String[] args) {
		// amusement park billing case study
		int ticketPrice = 400;
		int noOfTickets = 12;
		double totalPrice, discountedPrice, totalBill;
		if (noOfTickets > 10) {
			double Discount = 0.1;
			totalPrice = ticketPrice * noOfTickets;
			discountedPrice = 0.1 * totalPrice;
			totalBill = totalPrice - discountedPrice;
			System.out.println("Final price including Discounts is " + totalBill);
		}
		else if (noOfTickets <= 0) {
			System.out.println("Invalid number of tickets specified");
		}
		else {
			totalBill = noOfTickets * ticketPrice;
			System.out.println("Final price without discounts is " + totalBill);
		}
	}

}
