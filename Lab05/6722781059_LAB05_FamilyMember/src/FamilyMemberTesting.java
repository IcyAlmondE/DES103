
public class FamilyMemberTesting {

	public static void main(String[] args) {
		System.out.println("# COMMON FUND OF THE FAMILY");
		System.out.println("The " + FamilyMember.familyName + " family has $" + FamilyMember.commonFund);
		System.out.println("--------------------------");
		
		System.out.println("\n# PRIVATE FUND");
		FamilyMember arrayFamily[] = {
				new FamilyMember("John", 254639.12), 
				new FamilyMember("Erika", 187345.56), 
				new FamilyMember("James", 56783.12), 
				new FamilyMember("Paris", 12124.88)};
		
		for(int i=0; i<arrayFamily.length; i++) {
			arrayFamily[i].printPrivateFund();
		}
		System.out.println("--------------------------");
		
		arrayFamily[1].contributeToCommonFund(10000); // Erika
		arrayFamily[3].contributeToCommonFund(10000); // Paris
		
		System.out.println("\n# CONTRIBUTION OF PRIVATE FUND");
		for(int i=0; i<arrayFamily.length; i++) {
			arrayFamily[i].printPrivateFund();
		}
		System.out.println("--------------------------");
		
		System.out.println("\n# UPDATED COMMON FUND OF THE FAMILY");
		System.out.println("The " + FamilyMember.familyName + " family has $" + FamilyMember.commonFund);
		System.out.println("--------------------------");
	}

}
