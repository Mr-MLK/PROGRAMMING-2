package LB3;
import java.util.Date;


public class Account {

	private int ID =0 ;
	private double balance =0;
	Date dataCreate = new Date();
	
	
	Account() {
		
	}
	
	
	Account(int newId , double initialBalance){
		ID = newId ;
		balance = initialBalance ;
		
	}
	
	public int getId() {
		return ID ;
	}
	
	public void setId (int ID) {
		this.ID = ID;
	}
	public double getBalance () {
		return balance ;
	}
	public void setBalance (double balance) {
		this.balance = balance ;
	}
	
	public Date getCurrentDate() {
		return dataCreate;
	}
	
	
	public void withdrow (double i) {
		if  (i<= balance )
			  balance -= i ;
		else System.out.println("not enough balance ");
			
	}
	
	
	public void deposit(double i) {
		balance += i ;
	}
}
