package Types_of_collection;

import java.util.*;

public class Set_types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//There are 3 types of set.
		//1.HashSet, 2.LinkedHashSet, 3.TreeSet
		
		
		HashSet <String> h= new HashSet<String>();
						 h.add("wp");
						 h.add("xq");
						 h.add("ay");
						 
		Iterator h1=h.iterator();
		while(h1.hasNext())
		{
			System.out.println(h1.next());
		}
		System.out.println("*******");
		
		LinkedHashSet <String> l= new LinkedHashSet <String>();
							   l.add("wp");
							   l.add("xz");
							   l.add("ay");
		Iterator l1=l.iterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		System.out.println("*******");
		
		TreeSet <String> t= new TreeSet <String>();
						 t.add("zlkd");
						 t.add("mskd");
						 t.add("acod");
		Iterator t1=t.iterator();
		while(t1.hasNext())
		{
			System.out.println(t1.next());
		}
		
		
		
		
		
		
		
		
	}

}
