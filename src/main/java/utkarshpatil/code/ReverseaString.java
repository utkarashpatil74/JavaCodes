package utkarshpatil.code;

public class ReverseaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ReverseaString 
		
		//1. Method
		String name="Vaibhav Patil";
		
		int len=name.length();
		
		String rev="";
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+name.charAt(i);
		}
		
		System.out.println(rev);
		
		//2. StringBuffer method
		
		StringBuffer df=new StringBuffer(name);
		
		
		System.out.println(df.reverse());

		
		
		
	}

}
