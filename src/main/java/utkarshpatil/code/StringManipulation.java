package utkarshpatil.code;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Utkarsh Patil Patil";
		
		System.out.println(name.length());
		System.out.println(name.indexOf('P'));
		System.out.println(name.indexOf('a'));
		System.out.println(name.indexOf('a',name.indexOf('a')+1)); //9
		System.out.println(name.indexOf("Patil"));
		System.out.println(name.subSequence(10, 13));
		

	}

}
