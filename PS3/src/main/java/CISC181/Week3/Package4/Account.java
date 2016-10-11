package CISC181.Week3.Package4;

import java.util.Date;

public class Account {
	
	
	private static int id;
	private static double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account(int id, double balance, double annualInterestRate, Date dateCreated){
		Account.id=id;
		Account.balance=balance;
		this.annualInterestRate=annualInterestRate/100;
		Date date = new Date();
		this.dateCreated=date;
		
	}
	
	public void defaultAccount(){
		Account.id=0;
		Account.balance=0;
		this.annualInterestRate=0;
		}
	
	public static int accessID(){
		return id;
	}
	public static double accessBalance(){
		return balance;
	}
	public double accessInterest(){
		return annualInterestRate/100;
	}
	public Date accessDate(){
		return dateCreated;
	}
	
	public void mutatorID(int id){
		Account.id=id;	
	}
	
	public void mutatorBalance(double balance){
		Account.balance=balance;
	}
	
	public void mutatorInterest(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}
	
	public double getMonthlyInterestRate(){
		double monthInterest=annualInterestRate/12;
		return monthInterest;
	}
	
	public void withdraw(double amount){
		InsufficientFunds(amount);
		double newBalance = balance - amount;
		mutatorBalance(newBalance);}
		
	public void InsufficientFunds(double amount){
		if (Account.accessBalance() - amount<=0){
			try{
				throw new InsufficientFundsException(amount, "Insufficient Funds");}
			catch (InsufficientFundsException e){
				e.printStackTrace();}
		}
		}
			
		
	public void deposit(double amount){
		double newBalance=balance+amount;
		mutatorBalance(newBalance);
	}
}
