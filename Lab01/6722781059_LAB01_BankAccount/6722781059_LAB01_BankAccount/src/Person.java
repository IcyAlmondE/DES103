
public class Person {
	String name, surname, sex, occupation, organization;
	
	Person(){}
	
	Person(String newName, String newSurname, String newSex, String newOccu, String newOrg){
		this.name = newName;
		this.surname = newSurname;
		this.sex = newSex;
		this.occupation = newOccu;
		this.organization = newOrg;
	}
	
	void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Surname: " + surname);
		System.out.println("Sex: " + sex);
		System.out.println("Occupation: " + occupation);
		System.out.println("Organization: " + organization);
	}
}
