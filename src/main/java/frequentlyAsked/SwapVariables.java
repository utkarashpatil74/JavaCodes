package frequentlyAsked;

public class SwapVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long a=625;
		
		long rev=0;
			
		while(a!=0) {
			rev=rev*10+a%10;
			a=a/10;
		}
		
		System.out.println(rev);

	}

}
