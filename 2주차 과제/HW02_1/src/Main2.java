
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		double D;
		double x1, x2;
		
		a=3.0;
		b=-1.0;
		c=9.0;
		
		System.out.println("a="+a+" b="+b+" c="+c);
		
		D=b*b-4*a*c;
		x1=(-b+Math.sqrt(D))/(2.0*a);
		x2=(-b-Math.sqrt(D))/(2.0*a);
		
		System.out.println("The solution is either "+x1+" or "+x2);
	}

}
