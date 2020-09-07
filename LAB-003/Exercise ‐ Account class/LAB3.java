package LB3;

public class LAB3 {

	public static void main(String[] args) {

		Account A = new Account(1122,20000) ;
		
		A.withdrow(2500);
		A.deposit(3000);
		
		System.out.println(" the balance is  "+ A.getBalance());
		System.out.println("this account was created at  "+ A.getCurrentDate());
		
		
		
	}

}
