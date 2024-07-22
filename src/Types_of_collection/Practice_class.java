package Types_of_collection;

import java.util.*;


public class Practice_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List
		ArrayList<String> a= new ArrayList<String>();
						  a.add("Vivek");
						  a.add("Narayanrao");
						  a.add("Shinde");
						  
		Iterator a1= a.iterator();
		while(a1.hasNext())
		{
			System.out.println(a1.next());
		}
				System.out.println("*******");
				
		LinkedList<String> l= new LinkedList<String>();
						   l.add("Vaibhav");
						   l.add("Narayanrao");
						   l.add("Shinde");
						   
		Iterator l1=l.iterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		System.out.println("*******");
		
		Vector<String> v=new Vector<String>();
					   v.add("Sakshi");
					   v.add("Vivek");
					   v.add("Shinde");
		
		Iterator v1=v.iterator();
		while(v1.hasNext())
		{
			System.out.println(v1.next());
		}
		System.out.println("*******");
		
		Stack<String> s= new Stack<String>();
					  s.push("VS");
					  s.push("NS");
					  s.push("SS");
					  s.push("VV");
					  s.pop();
					  System.out.println(s.peek());
					  
		System.out.println("*******");
		
		//Queue
		
		PriorityQueue<String> p=new PriorityQueue<String>();
							  p.add("Alpha");
							  p.add("Beta");
							  p.add("Gamma");
							  
		Iterator p1=p.iterator();
		while(p1.hasNext())
		{
			System.out.println(p1.next());
		}
		System.out.println("*******");
		
		ArrayDeque<String> e= new ArrayDeque<String>();
						   e.add("La");
						   e.add("kasa");
						   e.add("de");
						   e.add("Pepal");
						   
		Iterator e1=e.iterator();
		while(e1.hasNext())
		{
			System.out.println(e1.next());
		}
		System.out.println("*******");
		
		//Set
		
		HashSet<String> h= new HashSet <String>();
		h.add("Harry");
		h.add("Hermine");
		h.add("Ron");
		
		Iterator h1=h.iterator();
		while(h1.hasNext())
		{
			System.out.println(h1.next());
		}
		System.out.println("*******");
		
		LinkedHashSet<String> n= new LinkedHashSet<String>();
		n.add("Rancho");
		n.add("Farhan");
		n.add("Raju");
		
		Iterator n1=n.iterator();
				while(n1.hasNext())
				{
					System.out.println(n1.next());
				}
		System.out.println("*******");
		 
		TreeSet<String> r= new TreeSet<String>();
		r.add("Ajay");
		r.add("Ranveer");
		r.add("Akshay");
		
		Iterator r1=r.iterator();
		while(r1.hasNext()) {
			System.out.println(r1.next());
		}
		System.out.println("*******");
		
		//Map
		
		HashMap<Integer,String> is= new HashMap<Integer,String>();
		is.put(301, "Vivek room");
		is.put(302, "Vaibhav room");
		is.put(303, "Bunty room");
		
		for(Map.Entry is1:is.entrySet())
		{
			System.out.println(is1.getKey()+" "+is1.getValue());
		}
		System.out.println("*******");
		
		LinkedHashMap<Integer,Character> ic= new LinkedHashMap<Integer,Character>();
		ic.put(401, 'K');
		ic.put(402, 'M');
		ic.put(403, 'N');
		
		for(Map.Entry ic1:ic.entrySet())
		{
			System.out.println(ic1.getKey()+" "+ic1.getValue());
		}
		
		System.out.println("*******");
		
		TreeMap<Character,Integer> il= new TreeMap<Character,Integer>();
		il.put( 'I',301);
		il.put( 'H',201);
		il.put( 'G',501);
		
		for(Map.Entry il1:il.entrySet())
		{
			System.out.println(il1.getKey()+" "+il1.getValue());
		}
	}

}
