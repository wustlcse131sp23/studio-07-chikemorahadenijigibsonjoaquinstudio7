package studio7;

public class ComplexNum {
	
	private int a;
	private int b;
	private double i;
	
	public ComplexNum( int a, int b ) {
		this.a = a;
		this.b = b;
		i = Math.sqrt(-1);
	}
	
	public ComplexNum add( int a, int b) {
		int newa = this.a + a;
		int newb = this.b + b;
		ComplexNum added = new ComplexNum(newa, newb);
				return added;
	}
	
	@Override
	public String toString() {
		return "ComplexNum [a=" + a + ", b=" + b + "]";
	}

	
	public void print() {
		System.out.println(this.a + "+" + this.b + "i");
	}
	

	public static void main(String[] args) {
		ComplexNum thing = new ComplexNum(3,6);
		thing.print();
		ComplexNum otherthing = new ComplexNum(1,2);
		otherthing.print();
		ComplexNum newthing = thing.add(otherthing.a, otherthing.b);
		newthing.print(); //my own string method
		System.out.println(newthing); //automatically calls toString method
		

	}

	

	
}
