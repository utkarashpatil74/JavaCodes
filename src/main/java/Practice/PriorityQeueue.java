package Practice;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQeueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Object> pf = new PriorityQueue<Object>();
		
//		pf.add("Abc");
//		pf.add("Kerala");
//		pf.add("Thekady");
//		pf.add("Goa");
//		pf.add("Calangute");
		pf.add(12);
		pf.add(14);
		pf.add(3234);
		pf.add(92723);
		pf.add(324);
		pf.add(1);
		pf.add(3);
		
		
		
		//System.out.println("head:"+pf.element());
		System.out.println("head:"+pf.element());
		
		
		
		System.out.println(pf.poll());
		
		System.out.println("head:"+pf.peek());
		
		Iterator it=pf.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		pf.poll();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
