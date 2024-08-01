package Anudip;


class Bank{
	static  String bankName;
	static int balance=0;
	public Bank(String bankName , int balance)
	{
		this.bankName=bankName;
		this.balance=balance;
	}
	public static String bankName()
	{
		return bankName;
	}
	public static int balance()
	{
		return balance;
	}
	public void deposite(int  amt) {
		if(amt>0) {
			balance = balance+amt;
			System.out.println("your bank balance : "+balance);
		}
		else {
			System.out.println("make sure your amount must be greater than ZERO");
		}
	}
	public void withDraw(int amt) {
		if(amt<balance) {
			balance = balance-amt;
			System.out.println("after withdraw your balance is "+balance);
		}
		else if(amt>balance) {
			System.out.println("insuffient balance");
		}
		else
		{
			System.out.println("To withdraw amount must be morethan 100");
		}
	}
	public void getBalance() {
		System.out.println("your balance is "+balance);
	}
	}

public class Test {

	public static void main(String[] args) {
		Bank b = new Bank("SBI",1500);
		System.out.println("Bank Name "+Bank.bankName());
		System.out.println("Initial Balance "+Bank.balance());
        b.withDraw(500);
        b.getBalance();
        b.deposite(200);
        b.withDraw(150);
        b.getBalance();
        
	}
}


