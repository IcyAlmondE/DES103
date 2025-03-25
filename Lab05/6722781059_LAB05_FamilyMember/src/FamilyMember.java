
public class FamilyMember {
	static String familyName = "Hilton";
	String firstName;
	static double commonFund = 100000.00;
	double privateFund;
	
	FamilyMember(String firstName, double privateFund){
		this.firstName = firstName;
		this.privateFund = privateFund;
	}
	
	void printPrivateFund() {
		System.out.println(firstName + " " + familyName + " has $" + privateFund);
	}
	
	
	void contributeToCommonFund(double amount) {
		commonFund+=amount;
		privateFund-=amount;
	}
	
	static void payFromCommonFund(double amount) {
		commonFund-=amount;
	}
}
