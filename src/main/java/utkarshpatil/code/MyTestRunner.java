package utkarshpatil.code;



public class MyTestRunner {

	private void fun() {
		System.out.println("I am from MyTestRunner");
		
	}
		public static void main(String[] args) {
			
			MyTestRunner fn=new Utkarsh();
			fn.fun();
			
			
		
	}
}

class Utkarsh extends MyTestRunner{
	
	private void fun() {
		System.out.println("I am from Utkarsh class");
	}
	
	
}

