package Types_of_collection;

import java.util.*;

public class ListTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method ;
		//Arraylist		
		ArrayList <String>a1= new ArrayList<String>();
						   a1.add("Vivek");
						   a1.add("Narayanrao");
						   a1.add("Shinde");
						   
		// with iterator
		Iterator i=a1.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
		}
		System.out.println("********");
		
		//with enhanced for loop
		for(String a2:a1) 
		{
			System.out.println(a1);
		}
		System.out.println("********");
		
		//Linked List
		LinkedList <Integer> b= new LinkedList <Integer>();
							 b.add(100);
							 b.add(200);
							 b.add(300);
							 b.add(400);
							 b.add(500);
		//using iterator					 
		Iterator b1=b.iterator();
		while(b1.hasNext()) {
			System.out.println(b1.next());
		}
		System.out.println("********");
		//using enahaced for loop
		for(Integer b2:b) {
			System.out.println(b2);
		}
		System.out.println("********");
		//Vector
		
		Vector <Character> v= new Vector <Character>();
						   v.add('V');
						   v.add('N');
						   v.add('S');
						   
		//Using Iterator
			Iterator v1=v.iterator();
			while(v1.hasNext()) {
				System.out.println(v1.next());
			}
			System.out.println("********");
		//Using enhanced for loop
			for(Character v2:v) {
				System.out.println(v2);
			}
			
			System.out.println("********");
			Stack<String> a= new Stack<String>();
			a.push("Vivek");
			a.push("Narayanrao");
			a.push("Shinde");
			a.push("Parli ves");
			a.pop();
			
			//System.out.println(a.peek());
			Iterator i1=a.iterator();
					while(i1.hasNext()) 
					{
						System.out.println(i1.next());
					}
	}
	
}
