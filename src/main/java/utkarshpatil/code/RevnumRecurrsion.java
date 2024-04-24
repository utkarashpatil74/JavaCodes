package utkarshpatil.code;

public class RevnumRecurrsion {

	public static void getReverseNum(long num) {
		
		if(num<10) {
			System.out.print(num);
			return;
		}
		else {
			System.out.print(num%10);
			getReverseNum(num/10);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getReverseNum(321);
	}

}
