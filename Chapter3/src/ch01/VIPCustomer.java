package ch01;

public class VIPCustomer extends Customer {
	
	
	double salesRatio;
	private String agentID;
	
	
	public VIPCustomer() {
		bonusRatio = 0.05;
		customerGrade = "VIP";
		salesRatio = 0.1;
		
	}


	public String getAgentID() {
		return agentID;
	}


	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
	
}
