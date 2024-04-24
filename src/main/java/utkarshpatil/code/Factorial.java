package utkarshpatil.code;

public class Factorial {
	
	
	public static void factorial(int n) {
		
		int fact=1;
		for(int i=1;i<=n;i++) {
			
			fact=fact*i; //1*1=1
			//1*2=2
			//2*3=6
			//6*4=24
		}
		
		System.out.println(fact);



		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		factorial(6);

	}

}
