package frequentlyAsked;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Automation Testing";
		char b[]=a.toCharArray();
		
		for(int i=a.length()-1;i>=0;i--) {
			
			System.out.print(a.charAt(i));
		}
		
		StringBuffer sb=new StringBuffer();
		sb.append(a);
		
		sb.reverse();
		
		System.out.println("\n"+sb);
		

	}

}
