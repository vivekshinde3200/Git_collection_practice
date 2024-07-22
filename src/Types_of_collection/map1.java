package Types_of_collection;

import java.util.*;

public class map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map
		//in map we are storing element in key and value format
		//key & value pair is called as entrySet
		//when we have data in key wise format then we prefer map.
		//There are 3 types like SET
		//1.HashMap  2.LinkedHashMap  3.TreeMap (Properties are also same as Set interface )
		// Only diffrence betn set and map is, in set we take only values and in map we are taking key and value in pair.
		
		//1. HashSet(Random data shown & Null value can be add)
	HashMap <Integer,String> h= new HashMap<Integer,String>();
							 h.put(10, "Vivek");
							 h.put(20, "Narayanrao");
							 h.put(null, null);
							 h.put(30, "Shinde");
	for(Map.Entry h1:h.entrySet())
	{
		System.out.println(h1.getKey()+" "+ h1.getValue());
	}
		System.out.println("*******");
		
		/*
		//2. LinkedHashMap (Insertion order will preserve & Null values can accepted)
	
	LinkedHashMap<Integer,String> l= new LinkedHashMap<Integer,String>();
								  l.put(101, "Sakshi");
								  l.put(102, "Vivek");
								  l.put(null, null);
								  l.put(103, "Shinde");
								  
	for(Map.Entry l1:l.entrySet())
	{
		System.out.println(l1.getKey()+" "+ l1.getValue());
	}
	 System.out.println("********");
	 
	 //3.TreeMap(Ascending order will follow & Null values can not be accepted)
	 
	 TreeMap<Integer,String> t= new TreeMap<Integer,String>();
	 						 t.put(1001, "Vaibhav");
	 						// t.put(null, null);
	 						 t.put(1002, "Narayanrao");
	 						 t.put(1003, "Shinde");
	 						 
	 for(Map.Entry t1:t.entrySet())
	 {
		 System.out.println(t1.getKey()+" "+ t1.getValue());
	 }*/
		
		
		
		
		
		
	}
	}
