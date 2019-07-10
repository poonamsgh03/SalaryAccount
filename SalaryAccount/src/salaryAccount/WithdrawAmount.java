package salaryAccount;

import java.util.Scanner;


public class WithdrawAmount {
    static double wAmount=0.0;
    
    //
	public static void withdrawnAmount(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount you want to withdraw.");
		
		int amount = sc.nextInt();
		
		if (amount>CurrentBalance.balance){
			System.out.println("Your Current balance is less than withdrawal amount");
		}
		else if (amount<CurrentBalance.balance){
			wAmount+=amount;
			CurrentBalance.WithdrawnBalance();
			SalaryAccount sa = new SalaryAccount();
			sa.employeeInfo();
		}
		
		else {
			System.out.println("Invalid withdrawal amount");
		}
		sc.close();
	}
	
	
}
