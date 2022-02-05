package com.ms;
class Student{}

public class BankingApplication {

	public static void showAccountInfo(Account account) {
		account.info();
	}
	
	public static void main(String[] args) {
		
		SavingAccount savingAccount=new SavingAccount(1001,"ABC",50000,"XYZ");
		CurrentAccount currentAccount=new CurrentAccount(1002,"PQR",80000,"IT Company");

		showAccountInfo(savingAccount);
		showAccountInfo(currentAccount);
		
		
	}

}
