package salaryAccount;

import java.util.Scanner;

public class DepositAmount {
	
	static Double dAmount = 0.0;
	
	public static void depositAmount(){
		//Input deposit amount
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount you want to deposit.");		
		int amount = sc.nextInt();
		
		
		if (amount<=0){
			System.out.println("Invalid deposit amount.");
		}
		else if (amount>0){
		dAmount+=amount;
		
		CurrentBalance.depositBalance();
		SalaryAccount sa = new SalaryAccount();
		sa.employeeInfo();
		}
		else{
			System.out.println("Please enter a deposit value.");
		}
		sc.close();
	}

}
