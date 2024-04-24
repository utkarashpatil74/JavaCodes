package utkarshpatil.code;

public class Product {
	
	double c=0;
	public double product(double a, double b) {
		
		c=a*b;
		
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product obj=new Product();
		double b=obj.product(2.3,7.89);
		
		System.out.println(b);
		
	}

}
