
public class BankAccount {
	Person person = new Person();
	String accountNumber;
	double balance;
	
	BankAccount(String newName, String newSurname, String newSex, String newOccupation, String newOrganization, String newAccountNumber, double newBalance){
		this.person.name = newName;
		this.person.surname = newSurname;
		this.person.sex = newSex;
		this.person.occupation = newOccupation;
		this.person.organization = newOrganization;
		this.accountNumber = newAccountNumber;
		this.balance = newBalance;
	}
	
	void deposit(double x) {
		balance += x;
	}
	
	void withdraw(double x) {
		balance -= x;
	}
	
	void printInfo() {
		System.out.println("Name: " + person.name);
		System.out.println("Surname: " + person.surname);
		System.out.println("Sex: " + person.sex);
		System.out.println("Occupation: " + person.occupation);
		System.out.println("Organization: " + person.organization);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
	}
	
	void printBalance() {
		System.out.println("Balance = " + balance + " million USD");
	}
	
	double convertBalanceToTHB() {
		return balance*34.08;
	}
}
