package week2.day4;

public class Amazon extends CanaraBank{

	public void cashOnDelivery() {
		System.out.println("payment type - cashOnDelivery ");
		
	}

	public void upiPayments() {
		System.out.println("payment status - paid ");
	}
	public void cardPayments() {
		System.out.println("payment type - cardPayments ");
		
	}
	public void  internetBanking() {
		System.out.println("payment type - internetBanking ");
	}
	
	void recordPaymentDetails() {
		System.out.println("recordPaymentDetails - recorded");
	}
	public static void main(String[] args) {
		Amazon A = new Amazon();
		A.cardPayments();
		A.cashOnDelivery();
		A.internetBanking();
		A.upiPayments();
		A.recordPaymentDetails();

	}

}
