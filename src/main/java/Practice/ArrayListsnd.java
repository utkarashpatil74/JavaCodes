package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListsnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList<String> arr=new ArrayList<String>(Arrays.asList("Utkarsh","Vaibhav","jsdhjs"));
//		
//		ArrayList<String> arr1=new ArrayList<String>(Arrays.asList("cdsa","qwer","iyirt"));
//		
//		
//		
//		
//		System.out.println(arr.retainAll(arr1));
//		System.out.println(arr);
//		
		
		
		  ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay");  
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Ravi");  
		  al2.add("Hanumat");  
		  al.retainAll(al2);  
		  System.out.println("iterating the elements after retaining the elements of al2");  
		  Iterator itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }
		  
		  
		 }  
		
		
		
		

	}


