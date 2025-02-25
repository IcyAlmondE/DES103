
public class Person {
	Name name;
	Date dateOfBirth;
	static int numPerson = 0;
	int age;
	
	Person(String firstName, String lastName, int day, int month, int year){
		this.name = new Name(firstName, lastName);
		this.dateOfBirth = new Date(day, month, year);
		numPerson++;
	}
	
	void printInfo() {
		System.out.print("Name: ");
		name.printName();
		System.out.print("DOB: ");
		dateOfBirth.printDate();
	}
	
	void printAgeAtYear(int year) {
		this.age = year-dateOfBirth.year;
		if (dateOfBirth.month>2) age--;
		System.out.println("Age: " + age);
	}
	
	static void printNumberOfPerson() {
		System.out.println("The total number of Persons is " + numPerson + " persons.");
	}
}
