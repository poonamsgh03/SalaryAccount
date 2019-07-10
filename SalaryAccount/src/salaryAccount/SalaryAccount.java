package salaryAccount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SalaryAccount {
	int SALARY_ACCOUNT_NUMBER=1234567;
	static final String companyName="One97";
	
	static String empName;
	static String empDesignation;
	static int designation;	
	static float salary;
    private static int empId = 11700;
    
    public void employeeInfo(){
    	System.out.println("Employee Id of "+empName +" is "+empId+ ", designation is "+empDesignation +", in Company "+companyName+", drawing monthly salary "+salary+" having salary account number "+SALARY_ACCOUNT_NUMBER+". Your current balance is "+CurrentBalance.balance+" .");
    }
    
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter Name");
		try {
			empName = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.out.println("Please Enter Designation: SrSTE, SDET, STE,AssociateTE, trainee");
		
		try {
			empDesignation = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	/*	Map<String, Integer> m = new HashMap<>();
		m.put("SrSTE", 60000 );
		m.put("SDET", 50000 );
		m.put("STE", 35000 );	
		salary=m.get(empDesignation.toUpperCase());
		*/		
		//To get salary on the basis of designation input
		  switch(empDesignation.toUpperCase()){		  
		  case "SRSTE":
		    salary=60000;
		  break;
		  
		  case "SDET":
			salary=50000;
		  break;
		  
	      case "STE":
		    salary=35000;
			break;
			
		  case "ASSOCIATETE":
			salary=25000;
			break;
			
		  case "TRAINEE":
			salary=18000;
			break;
			
			default: 
			 salary=0;
		    }
		  
		  //Displaying current Balance
		  
		  CurrentBalance.currentBalance();
		  
		  //Taking input for withdrawal or deposit
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the action: w for withdrawal, d for deposit");
		  String action = sc.nextLine();

		  if (action.equalsIgnoreCase("w")){
		  	//Withdraw message and show current balance.
			  WithdrawAmount.withdrawnAmount();
		  }
		  else if (action.equalsIgnoreCase("d")){
		  	 // Deposit message and show current balance.
			  DepositAmount.depositAmount();
		  }
		  else{
		  	  System.out.println("Action is not permitted.");
		  }
		  sc.close();
	}

}