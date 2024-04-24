package utkarshpatil.code;

public class ReverseanInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long num=122312;
		
		long rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
//		long num1=2337881;
//		
//		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
