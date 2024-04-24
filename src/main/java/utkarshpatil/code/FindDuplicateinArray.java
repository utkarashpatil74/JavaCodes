package utkarshpatil.code;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. Time complexity is O(n2) which is not feasible method.
		String[] name= {"Utkarsh","Vaibhav","Bhagyashri","Utkarsh"};
		
		for(int i=0;i<name.length;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i].equals(name[j])) {
					System.out.println("Duplicate name is: "+name[i]);
				}
					
				
			}
		}
		
		//2. Using Hashset
		
		Set<String> name1=new HashSet();
		
		for(String n: name) {
			
			if(name1.add(n)==false) {
				System.out.println("Duplicate name is: "+n);
			}
		}

	}

}
