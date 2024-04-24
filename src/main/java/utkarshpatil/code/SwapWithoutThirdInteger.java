package utkarshpatil.code;

public class SwapWithoutThirdInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y=5;
		
		// 1. with 3rd variable
		
//		int t;
//		t=x;
//		x=y;
//		y=t;
//		
//		System.out.println("X: "+x);
//		System.out.println("Y: "+y);
//		System.out.println("******************");
		
		// 2. without using 3rd variable - summation method
		
//		x=x+y; //15
//		y=x-y; //10
//		x=x-y; //5
//		
//		System.out.println("X: "+x);
//		System.out.println("Y: "+y);
		
		//3. Without using 3rd variable - product/multiplication method
		
//		x=x*y; //50
//		y=x/y; //10
//		x=x/y; //5
//		
//		System.out.println("X: "+x);
//		System.out.println("Y: "+y);
		
		//4. By using XOR method
		
		x=x^y; //15
		y=x^y; //10
		x=x^y; //5
		
		System.out.println("X: "+x);
		System.out.println("Y: "+y);
		
		

	}

}
