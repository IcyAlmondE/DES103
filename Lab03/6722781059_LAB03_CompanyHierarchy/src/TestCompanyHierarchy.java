
public class TestCompanyHierarchy {

	public static void main(String[] args) {
		String line = "-------------------------";
		
		System.out.println("### FUTURETECH COMPANY INFORMATION ###");
		
		System.out.println(">> Visitor Information");
		Person person01 = new Person("Somyai", "Yodyium", 15, 4, 1987);
		person01.printInfo();
		person01.printAgeAtYear(2025);
		System.out.println(line);
		
		Person person02 = new Person("Pitak", "Raksa", 1, 8, 1980);
		person02.printInfo();
		person02.printAgeAtYear(2025);
		System.out.println(line);
		
		System.out.println();
		System.out.println(">> Employee Information");
		Employee employee01 = new Employee("Maneeya", "Rinrom", 15, 4, 1987, "FutureTech CO.", "Secretary", 15000.0);
		employee01.printInfo();
		System.out.println(line);
		
		Employee employee02 = new Employee("Parinya", "Yenjid", 5, 11, 1990, "FutureTech CO.", "Technician", 22000.0);
		employee02.printInfo();
		System.out.println(line);
		
		System.out.println();
		System.out.println(">> Executive Information");
		Executive executive01 = new Executive("Preecha", "Yanusit", 30, 4, 1977, "FutureTech CO.", "Sale Manager", 40000.0, 80000.0);
		executive01.printInfo();
		System.out.println(line);
		
		Executive executive02 = new Executive("Songpol", "Sangar", 10, 11, 1972, "FutureTech CO.", "Finance Manager", 38000.0, 76000.0);
		executive02.printInfo();
		System.out.println(line);
		
		System.out.println();
		System.out.println(">> Rule Announcement");
		String rule = "No nap during working hours";
		executive01.announceRule(rule);
		System.out.println(line);
		
		System.out.println();
		System.out.println(">> Rule Follower");
		employee01.followRule(rule);
		employee02.followRule(rule);
		System.out.println(line);
		
		System.out.println();
		System.out.println(">> CEO Information");
		CEO ceo01 = new CEO("Sipol", "Tongyai", 19, 9, 1956, "FutureTech CO.", "President", 150000.0, 500000.0, "BMW A5");
		ceo01.printInfo();
		System.out.println(line);
		
		System.out.println();
		System.out.println(">> CEO Vision");
		ceo01.showVision("becoming ISO standard");
		System.out.println(line);
		
		System.out.println(); 
		System.out.println(">> Number of Person");
		Person.printNumberOfPerson();
	}

}
