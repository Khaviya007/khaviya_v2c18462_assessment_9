package deque;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class dequecls {
	public static void main(String[] args) {
		ArrayDeque<String> q=new ArrayDeque<String>();
		q.add("Ram");
		q.add("John");
		q.add("Sam");
		q.add("Tom");
		  System.out.println("list is: ");
	      for(String s: q) 
	       System.out.println(s);
	      System.out.println("The contained list1 is :"+q.contains("ram"));
		  System.out.println("The contained list1 is :"+q.contains("Ram"));
	     
	      System.out.println("removing element in list is: "+ q.remove("John"));
	      System.out.println("After removing list is: "+q);
	      
	      System.out.println("poll in list is: "+ q.poll());
	      System.out.println("The list after poll is: "+q);
	      
	      System.out.println("adding first in list is: "+ q.offerFirst("Tinku"));
	      System.out.println("Adding in list is at first: "+q);
	      
	      System.out.println("adding last in list is: "+ q.offerLast("Reena"));
	      System.out.println("Adding in list is at last: "+q);
	       
	      ArrayDeque<String> q1=new ArrayDeque<String>();
			q1.addAll(q);
			  System.out.println("list2 is: ");
			  Iterator<String> i= q.iterator();
		      while(i.hasNext())
		    	System.out.println(i.next());  
		      
		      
			  System.out.println("The contained list2 is :"+q1.contains("Tom"));
			  System.out.println("The contained list2 is :"+q1.contains("ToM"));
		      
		      
		      System.out.println("The size of Vector list1 is: "+q.size());
		      System.out.println("The size of Vector list2 is: "+q1.size());
		      
		      q1.removeAll(q1);
		      System.out.println("The removing elements in list2 is: "+q1);
		      
		      if((q.isEmpty()))
		    	  System.out.println("The list1 is empty");
		      else
		    	  System.out.println("The list1 is not empty");
		      
		      if((q1.isEmpty()))
		    	  System.out.println("The list2 is empty");
		      else
		    	  System.out.println("The list2 is not empty");
		      
		     
	}

}
