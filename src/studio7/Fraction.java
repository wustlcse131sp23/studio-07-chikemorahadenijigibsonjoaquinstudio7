package studio7;

public class Fraction {

	private int top;
	private int bottom;
	
	public Fraction(int top, int bottom) {
		this.top = top;
		this.bottom = bottom;
	}
	
	public Fraction add(int top, int bottom) {
		
		int newTop = this.top*bottom + this.bottom*top;
		int newBottom = this.bottom*bottom;
		Fraction added = new Fraction(newTop,newBottom);
		return added;
	}
	public Fraction subtract(int top, int bottom) {
		int newTop = this.top*bottom - this.bottom*top;
		int newBottom = this.bottom*bottom;
		Fraction subtracted = new Fraction(newTop, newBottom);
		return subtracted;
	}
	public static void main(String[] args) {
		Fraction k = new Fraction(1,2);
		Fraction c = new Fraction(2,3);
		k.add(c.top, c.bottom); 
		

	}

}
