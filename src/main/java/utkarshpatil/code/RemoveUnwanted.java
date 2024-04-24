package utkarshpatil.code;

public class RemoveUnwanted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="%%%%$@!~ Utkarsh 你好，世界！ 4273182121211442 mxncnak";
		
		name=name.replaceAll("[^A-Za-z0-9]", "");
		
		System.out.println(name);

	}

}