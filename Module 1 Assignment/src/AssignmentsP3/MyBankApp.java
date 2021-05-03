package AssignmentsP3;

public class MyBankApp {
	
	public static void main(String[] args) 
	{
		int accno, bal, pId, pAmount;
		String pName;
		String accName;
		
		//  Create Accounts 
		Account a=new Account();
		Policy pa=new Policy();
		a.setAccountNumber(101);
		a.setAccountHolderName("Wriju Banerjee");
		a.setBalance(100000);
		pa.setPolicyId(33421);
		pa.setPolicyName("Car Insurance");
		pa.setPolicyAmount(17000);
		
		
		// Display Information 
		accno=a.getAccountNumber();
		accName=a.getAccountHolderName();
		bal=a.getBalance();
		System.out.println("Account:\n"+accno+"\n"+accName+"\n"+bal+"\n");
		
		
		
		
		// Display Information related to Policies 
		pId=pa.getPolicyId();
		pName=pa.getPolicyName();
		pAmount=pa.getPolicyAmount();
		System.out.println("Policy:\n"+pId+"\n"+pName+"\n"+pAmount+"\n");
		

		
		
		// get the policy by Id for specific account
		//System.out.println(pa.getPolicyId());
		
	}

}
