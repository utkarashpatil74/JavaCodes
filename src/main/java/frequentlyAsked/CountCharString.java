package frequentlyAsked;

public class CountCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountChar("Utkarsh Patil",'P');

	}

	private static void CountChar(String name, char character) {
		// TODO Auto-generated method stub
		
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==character) {
				count++;
			}
		}
		System.out.println(character+" "+count);
	}

}
