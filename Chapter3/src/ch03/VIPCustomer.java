package ch03;

public class VIPCustomer extends Customer {
	
	
	double salesRatio;
	private String agentID;
	
	
//	public VIPCustomer() {
//		
//		bonusRatio = 0.05;
//		customerGrade = "VIP";
//		salesRatio = 0.1;
//		
//		System.out.println("VIPCustomer() call");
//		
//	}

	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		bonusRatio = 0.05;
		customerGrade = "VIP";
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) call");
	}

	public String getAgentID() {
		return agentID;
	}


	
	
}
