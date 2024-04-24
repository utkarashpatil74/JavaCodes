package utkarshpatil.code;

public class Circle {
	
	
	public double circumference(double radius) {
		
		double c=2*(Math.PI)*radius;
		
		return c;
	}
	
public double area(double radius) {
		
		double c=(Math.PI)*radius*radius;
		
		return c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle obj=new Circle();
		double v=obj.circumference(8.3);
		System.out.println(v);
		
		double c=obj.area(8.3);
		System.out.println(c);

	}

}
