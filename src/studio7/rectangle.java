package studio7;

public class rectangle {
	
	//instance vars
	private double length;
	private double width;
	
	//constructors?
	public rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double perimeter(double length, double width) {
		return 2*length + 2*width;
	}
	public double area(double length, double width) {
		return length*width;
	}
	
	public boolean square(double length, double width) {
		if (length == width)
			return true;
		else
			return false;
	}
	public boolean isBiggerThan(double length, double width) {
		if (this.length > length || this.width > width)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
