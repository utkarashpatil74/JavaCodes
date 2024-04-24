package Practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> d=new ArrayDeque<String>();
		
		d.add("Utkarsh");
		d.add("Vaibhav");
		d.add("bhagya");
		d.add("xcbxnz");
		d.add("weewew");
		d.add("xcnxn");
		d.addFirst("tunnilal");
		d.addLast("tuntunmausi");
		d.push("cdata");
		
		
		
		for(String g:d) {
			System.out.println(g);
		}
		
		

	}

}
