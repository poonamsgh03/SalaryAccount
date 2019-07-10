package salaryAccount;

public class CurrentBalance {
	static double balance;
	
	public static void currentBalance(){
		balance = SalaryAccount.salary;
		System.out.println("Your Current Account Balance is: "+balance);
	}
	
	public static void depositBalance(){
		
		balance+=DepositAmount.dAmount;
		
	}

    public static void WithdrawnBalance(){
		balance-=WithdrawAmount.wAmount;
	}
    
  
}
