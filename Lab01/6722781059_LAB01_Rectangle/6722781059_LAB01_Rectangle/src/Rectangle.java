
public class Rectangle {
	int width;
	int length;
	
	Rectangle(){
		this.width = 1;
		this.length = 1;
	}
	
	Rectangle(int newWidth, int newLength){
		this.width = newWidth;
		this.length = newLength;
	}
	
	double findArea() {
		return width*length;
	}
	
	double findPerimeter() {
		return 2*(width+length);
	}
	
	double findDiagonal() {
		return Math.sqrt(width*width + length*length);
	}
	
	boolean isSquare() {
		if (width==length) return true;
		else return false;
	}
	
	void printBasicInfo() {
		System.out.println("The width is " + width);
		System.out.println("The length is " + length);
	}
}
