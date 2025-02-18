
public class Address {
	String houseNo = "-", soi = "-", road = "-", subDistrict = "-", district = "-", province = "-", postcode = "-";
	
	Address(String houseNo, String soi, String road, String subDistrict, String district, String province, String postcode){
		this.houseNo = houseNo;
		this.soi = soi;
		this.road = road;
		this.subDistrict = subDistrict;
		this.district = district;
		this.province = province;
		this.postcode = postcode;
	}
	
	Address(String province, String postcode){
		this.province = province;
		this.postcode = postcode;
	}
	
	void printFullAddress() {
		String[] prop = {houseNo, soi, road, subDistrict, district, province, postcode};
		for(int i=0; i<6; i++) {
			System.out.print(prop[i] + ", ");
		}
		System.out.println(postcode);
	}
	
	void printShortAddress() {
		System.out.println(district + ", " + province);
	}
}
