package studio7;

public class Die {
	
	private int n;
	
	
	public Die(int n) {
		this.n = n;
	}
	
	public int thrown(int n) {
		return (int)(Math.random())*n + 1;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
