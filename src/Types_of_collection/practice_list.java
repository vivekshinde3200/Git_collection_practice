package Types_of_collection;

import java.util.*;

public class practice_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList <String> a=new ArrayList<String>();
						   a.add("Swapnali");
						   a.add("Vivekrao");
						   a.add("Shinde");
			//using Iterator		   
		Iterator a1= a.iterator();
		while(a1.hasNext()) {
			System.out.println(a1.next());
		}
			System.out.println("********");
			
			//using enhanced for loop
			
			for(String a2:a)
			{
				System.out.println(a2);
			}
			System.out.println("********");
			
		LinkedList <Character> b= new LinkedList<Character>();
							   b.add('S');
							   b.add('V');
							   b.add('S');
			//using iterator				   
			Iterator b1=b.iterator();
			{
				while(b1.hasNext())
					System.out.println(b1.next());
			}
			
			System.out.println("********");
			
			//using enhanced for loop
			for(Character b2:b) {
				System.out.println(b2);
			}
			System.out.println("********");
			
			Vector<Float> f=new Vector<Float>();
						  f.add(11.5f);
						  f.add(101.3f);
						  f.add(20.4f);
						  
			//using iterator
			Iterator f1=f.iterator();
				while(f1.hasNext()) {
					System.out.println(f1.next());
			}
				System.out.println("********");
			//using enhanced for loop
				for(Float f2:f) {
					System.out.println(f2);
				}
				System.out.println("********");
				
		ArrayList <Boolean> bb= new ArrayList <Boolean>();
							bb.add(true);
							bb.add(false);
							
			//using iterator
			Iterator bb1=bb.iterator();
			while(bb1.hasNext())
			{
				System.out.println(bb1.next());
			}
			System.out.println("********");
			//using enhance for loop
			for(Boolean bb2:bb) {
				System.out.println(bb2);
			}
			System.out.println("********");
			
			LinkedList <Short> s=new LinkedList<Short>();
							   s.add((short) 32767);
							   s.add((short) -31000);
							   s.add((short) 32000);
							   
			//Using Iterator
			Iterator s1=s.iterator();
			while(s1.hasNext()) {
				System.out.println(s1.next());
			}
			System.out.println("********");
			//using enhanced for loop
			for(Short s2:s)
			{
				System.out.println(s2);
			}
							   
			
			
			
			
			
			
			
		
		
		
	}

}
