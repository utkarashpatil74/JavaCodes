package utkarshpatil.code;

public class Chaining {

	
	
	public void t1() {
		System.out.println("t1 method");
		t2();
		System.out.println("------");
	}
	
	public void t2() {
		System.out.println("t2 method");
		t3();
		System.out.println("------");
	}
	
	public void t3() {
		System.out.println("t3 method");
		System.out.println("------");
	}
	
	public static void m1() {
		System.out.println("m1 method");
		m2();
		Chaining g=new Chaining();
		g.t2();
	}
	
	public static void m2() {
		System.out.println("m2 method");
		m3();
		Chaining g=new Chaining();
		g.t2();
	}
	
	public static void m3() {
		System.out.println("m3 method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chaining f=new Chaining();
		
//		f.t1();
//		f.t2();
//		f.t3();
		
		m1();
		m2();
		m3();
		

	}

}
