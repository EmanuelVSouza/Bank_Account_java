package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
	public Account(){
	}
	
	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public void addDeposit(double ammount) {
		this.balance += ammount;
	}
	
	public void sudDeposit(double ammount) {
		this.balance += ammount;
	}
	
	public String toString() {
		return "Account "
				+ number
				+", Holder: "
				+ holder
				+", Balance: $ "
				+ String.format("%.2f", balance);
	}
}