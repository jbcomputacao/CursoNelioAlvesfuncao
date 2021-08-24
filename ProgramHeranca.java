package application;

import entities.Account;
import entities.BusinesAccount;
import entities.SavingAccount;

public class ProgramHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new Account(1001, "Alex ", 0.0);
		BusinesAccount bacc = new BusinesAccount(1002, " Maria ", 0.0, 500.0);
		 
		
		// UPCASTING 
		Account acc1 = bacc;
		Account acc2 = new BusinesAccount(1003,"bob", 0.0, 200.0);
		Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);
		
		
		// DOWNCASTING
		
		 BusinesAccount acc4 = (BusinesAccount) acc2;
		 acc4.loan(100.0);
		 
		 if (acc3 instanceof BusinesAccount) {
			 BusinesAccount acc5 = (BusinesAccount)acc3;
			 acc5.loan(200.0);
			 System.out.println("Enprestimo ou Loan");
			 
		 }
		 if (acc3 instanceof SavingAccount) {
			 SavingAccount acc5 = (SavingAccount)acc3;
			 acc5.updateBalance();
			 System.out.println("Update ou atualização");
		 }
		 
		 

	}

}
