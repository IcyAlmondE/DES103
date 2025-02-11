
public class TestBankAccount {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount("Wang", "TaLu", "Male", "Actor", "SIIT", "000-000-0000", 10);
		
		bankAccount.printInfo();
		
		bankAccount.person.name = "Natthapon";
		bankAccount.person.surname = "Chantaracha";
		bankAccount.person.sex = "Male";
		
		bankAccount.printInfo();
		
		bankAccount.deposit(15);
		
		bankAccount.printBalance();
		
		bankAccount.withdraw(5);
		
		bankAccount.printBalance();
		
		System.out.println("Balance in THB = " + bankAccount.convertBalanceToTHB() + " million baht");
	}
}
