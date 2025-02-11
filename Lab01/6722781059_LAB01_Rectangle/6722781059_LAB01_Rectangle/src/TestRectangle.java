
public class TestRectangle {
	public static void main(String[] args) {
		Rectangle box1 = new Rectangle();
		
		box1.printBasicInfo();
		
		double perimeter = box1.findPerimeter();
		System.out.println("perimeter = " + perimeter);
		
		double diagonal = box1.findDiagonal();
		System.out.println("diagonal = " + diagonal);
		
		if (box1.isSquare()) System.out.println("It is a square box.");
		else System.out.println("It is not a square box.");
		
		
		Rectangle box2 = new Rectangle(3, 4);
		
		box2.printBasicInfo();
		
		System.out.println("perimeter = " + box2.findPerimeter());
		
		System.out.println("diagonal = " + box2.findDiagonal());
		
		if (box2.isSquare()) System.out.println("It is a square box.");
		else System.out.println("It is not a square box.");
	}
}
