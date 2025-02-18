
public class TestPeopleID {

	public static void main(String[] args) {
		Date dobObj = new Date(23, 4, 2000);
		Name nameObj = new Name("Somchai", "Yodying");
		Address addressObj = new Address("81/9", "2", "ChiangMai-HangDong", "Sunpakwan", "Hang Dong", "Chiang Mai", "50230");
		String idObj = "3-5015-00274-987";
		
		PeopleID peopleIDObj = new PeopleID(nameObj, idObj, dobObj, addressObj);
		
		peopleIDObj.printPeopleID();
		System.out.println("--------------------------------------------");
		
		System.out.print("The name of peopleIDObj is ");
		peopleIDObj.name.printName();
		
		System.out.println("The postcode of peopleIDObj is " + peopleIDObj.address.postcode);
		System.out.println("--------------------------------------------");
	}
}
