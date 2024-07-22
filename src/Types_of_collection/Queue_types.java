package Types_of_collection;

import java.util.*;

public class Queue_types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// There are two types of Queue.....
		//1.PriorityQueue && 2.ArrayDeque
				
		PriorityQueue <String> p= new PriorityQueue<String>();
							   p.add("sdds");
							   p.add("gfhf");
							   p.add("Csdf");
							   p.add("hgjh");
							   
		Iterator p1= p.iterator();
		while(p1.hasNext())
		{
			System.out.println(p1.next());
		}
							   
		System.out.println("*********");
		
		ArrayDeque <String> a= new ArrayDeque<String>();
							a.add("Vivek");
							a.add("Narayanrao");
							a.add("Shinde");
		Iterator a1=a.iterator();
		while(a1.hasNext())
		{
			System.out.println(a1.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
