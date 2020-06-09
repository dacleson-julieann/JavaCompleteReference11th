package MathHypotenus;

public class MathHypotenuse {
	public static void main(String[] args) {
		double a = 3, b = 4;
		double c, d;
		
		c = ((a*a + b*b) / 2);
		System.out.println("Hypotenuse is " + c);
		
		d = Math.sqrt(a*a + b*b);
		System.out.println("Hypotenuse is " + d);
	}
}
