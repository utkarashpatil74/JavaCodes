package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arraylist :- Dynamic array,its a class, can store the object of different 
		//datatypes
		//maintains the insertion order and is non synchronized.
		//the elements stored in an arraylist can randomly be accessed.
		
		
		
//		ArrayList<String> r=new ArrayList<>();
//		
//		r.add("Utkaarsh");
//		r.add("jhd");
//		r.add("xcxncxnc");
//		r.add("ywqqywyiqwq");
//		
//		Iterator<String> it=r.iterator();
//		
//		System.out.println(it.hasNext());
//		
//		while(it.hasNext()) {
//			
//			System.out.println(it.next());
//		}
		
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("Utkaarsh");
		ll.add("jhd");
		ll.add("xcxncxnc");
		ll.add("ywqqywyiqwq");
		ll.add("Utkaarsh");
		ll.add("jhd");
		
		Iterator<String> it=ll.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		
		System.out.println("#################################");
		Vector<String> v=new Vector<String>();
		
		v.add("tunks");
		v.add("zmn");
		v.add("hsdsjdja");
		v.add("tunks");
		
		System.out.println(v.size());
		
		Iterator<String> gv=v.iterator();
		
		while(gv.hasNext()) {
			System.out.println(gv.next());
		}
		
		
		System.out.println("############## Stack ###################");
		Stack<Object> st=new Stack<Object>();
		
		st.push("hjashjaa");
		st.push("nzxnnaaaszx");
		st.push("rhqqjwsxmcsn");
		st.push("Utkarsh");
		//st.pop();
		
		System.out.println(st);
		
		Iterator<Object> bc=st.iterator();
		
		while(bc.hasNext()) {
			
			System.out.println(bc.next());
		}

	}

}
