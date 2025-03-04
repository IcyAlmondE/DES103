
public class TaxPaymentTest {

	public static void main(String[] args) {
		FullTime employee01_FullTime = new FullTime("Erika Parker", "secretary", "InfoTech", 32500.00);
		PartTime employee02_PartTime = new PartTime("Brian Lee", "driver", "InfoTech", 15, 100);
		Employee employee03 = new FullTime("James Knein", "tecnician", "InfoTech", 35500.00);
		Employee employee04 = new PartTime("Anne Lin", "accountant", "InfoTech", 30, 150);
		TaxPayer employee05_TaxPayer = new FullTime("Jamie Fox", "Manager", "InfoTech", 57300.00);
		
		employee01_FullTime.printInfo(); //Erika Parker
		System.out.println("--------------------");
		employee02_PartTime.printInfo(); //Brian Lee
		System.out.println("--------------------");
		employee03.printInfo(); //James Knein 
		System.out.println("--------------------");
		employee04.printInfo(); //Anne Lin  
		System.out.println("--------------------");
		((FullTime)employee05_TaxPayer).printInfo(); //Jamie Fox, try casting
		System.out.println("--------------------");
		
		((FullTime)employee03).payTax(); 
		((PartTime)employee04).payTax(); 
		employee05_TaxPayer.payTax();
	}

}
