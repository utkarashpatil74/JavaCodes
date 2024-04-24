package utkarshpatil.code;

public class Maths {

	int c=0;
	public int addition(int a, int b) {
		c=a+b;
		
		return c;
	}
	
	public int substraction(int a, int b) {
		c=a-b;
		
		return c;
	}
	
	public int multiplication(int a, int b) {
		c=a*b;
		
		return c;
	}
	
	public int division(int a, int b) {
		c=a/b;
		
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maths obj=new Maths();
		int a=obj.addition(2, 3);
		System.out.println(a);
		int b=obj.multiplication(2, 3);
		System.out.println(b);
		int c=obj.division(2, 3);
		System.out.println(c);
		int d=obj.substraction(2, 3);
		System.out.println(d);

	}

}
