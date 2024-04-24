package frequentlyAsked;

public class MultiplyWithoutOp {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=multiply(5,30);
		
		System.out.println(c);
		

	}
	
	public static int multiply(int a,int b) {
		
		int sum=0;
		
		for(int i=0;i<b;i++) {
			
			sum=sum+a;
		}
		return sum;
	}

}
