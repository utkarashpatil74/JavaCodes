package frequentlyAsked;

public class SwapVariablesWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=36;
		int b=58;
		
//		a=a+b;  //94
//		b=a-b; // 94-58 =36
//		a=a-b; // 
//		
//		System.out.println(a);
//		System.out.println(b);
		
		
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println(a);
		System.out.println(b);
		

	}

}
