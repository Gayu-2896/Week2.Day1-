package week2.day4;

public abstract class CanaraBank implements Payments {

	 abstract void recordPaymentDetails(); 
		
	 public void cashOnDelivery() {
			System.out.println("payment type - cashOnDelivery ");
			
		}

		public void upiPayments() {
			System.out.println("payment type - upiPayments ");
		}
		public void cardPayments() {
			System.out.println("payment type - cardPayments ");
			
		}
		public void  internetBanking() {
			System.out.println("payment type - internetBanking ");
		}

}
