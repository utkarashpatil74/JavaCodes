package utkarshpatil.code;

public class Vote {
	
	
	public static boolean vote(int age) {
		
		boolean flag=false;
		if(age>0) {
		
		if(age>=18 && age<=200) {
			
		System.out.println("Eligible to vote");	
		flag=true;
		return flag;
		}
		else {
			System.out.println("Ineligible");
			return flag;
		}
		}
		else {
			System.out.println("Enter the valid age");
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean v=Vote.vote(17);
		System.out.println(v);

	}

}
