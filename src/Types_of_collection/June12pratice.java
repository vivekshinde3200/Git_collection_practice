package Types_of_collection;


import java.util.*;
import java.util.Iterator;



public class June12pratice {

	public static void main(String[] args) {

		
		ArrayList<String> a= new ArrayList<String>();
					      a.add("Vivek");
					      a.add("Narayanrao");
					      a.add("Shinde");
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("*******");
		
		LinkedList <String> l= new LinkedList <String> ();
							l.add("Sakshi");
							l.add("Vivek");
							l.add("Shinde");
		Iterator i1=l.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		String s="Vivek";
		String s1="";
		for(int i11=s.length()-1;i11>=0;i11--)
		{
			s1=s1+s.charAt(i11);
			System.out.println(s1);
			
		}
		
		String n="12345";
		String n1="";
		for(int o=n.length()-1;o>=0;o--)
		{
			n1=n1+n.charAt(o);
			System.out.println(n1);
		}
		
		int d[]= {23,945,9,48,583,94,3950,39230,33059,459,850,395,398,508,5935,9394,29};
		int max=23;
		for(int x=0;x<=d.length-1;x++)
		{
			if(d[x]>max)
			{
				max=d[x];
			}
		}
		System.out.println("The maximum number is :"+max);
		int min=23;
		for(int y=0;y<=d.length-1;y++)
		{
			if(d[y]<min)
			{
				min=d[y];
			}
		}
		System.out.println("Minimum number is :"+min);
	
	
		int x1=0,y1=1,z1;
		for(int q=1;q<=10;q++)
		{
			z1=x1+y1;
			System.out.println(z1);
			x1=y1;
			y1=z1;
		}
	
		int fact=1;
		for(int f=1;f<=5;f++)
		{
			fact=fact*f;
			System.out.println(fact);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

}
