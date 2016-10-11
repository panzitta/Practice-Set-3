package CISC181.Week3.Package4;

import java.util.Date;

public class Test{
	static Date date=new Date();
	public static void main(String[] args){
		Account testAccount = new Account(1122,20000,4.5,date);
		
		testAccount.deposit(3000);
		testAccount.withdraw(2500);
		System.out.printf("The Balance is: $%.2f%n",Account.accessBalance());
		System.out.printf("The Monthly Interest is:%.2f%%",(testAccount.getMonthlyInterestRate()*Account.accessBalance()));
		System.out.printf("The Date the Account was Created is:%s", testAccount.accessDate());
		
	testAccount.withdraw(300000);
		}
}
	
