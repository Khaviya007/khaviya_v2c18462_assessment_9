package vector;
import java.util.Stack;
import java.util.Iterator;
public class Vectcls {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(null);
		s.push(10);
		s.push(50);
		s.push(30);
		s.push(25);
		System.out.println("The list1 is: "+s);
		Iterator<Integer> i=s.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(100);
		s1.push(70);
		s1.push(60);
		s1.push(90);
		s1.push(85);
		System.out.println("The list2 is: "+s1);
        for(Integer d :s1)
        	System.out.println(d);
        
        if((s.isEmpty()))
      	  System.out.println("The list1 is empty");
        else
      	  System.out.println("The list1 is not empty");
        
        Stack<Integer> s2 = new Stack<Integer>(); 
        if((s2.isEmpty()))
      	  System.out.println("The list3 is empty");
        else
      	  System.out.println("The list3 is not empty");
        	
        
        System.out.println("The list1 is :"+s.contains(30));
  	    System.out.println("The list2 is :"+s1.contains(150));
  
  	    System.out.println("The search list1 is :"+s.search(30)); 
  	    System.out.println("The list2 is :"+s1.search(150));
  	

        System.out.println("The size of Vector list1 is: "+s.size());
        System.out.println("The size of Vector list2 is: "+s1.size());
   
        System.out.println("The capacity of Vector list1 is: "+s.capacity());
        System.out.println("The capacity of Vector list2 is: "+s1.capacity());
    
         s.set(0,15);
         System.out.println("The replace of Vector list1 is: "+s);
               
         if((s.equals(s1)))
         	  System.out.println("The list is equal");
           else
         	  System.out.println("The list is not equal");   
         
         Stack<String> s3 = new Stack<String>();
         s3.push("Tom");
         s3.push("Sam");
         
         Stack<String> s4 = new Stack<String>();
         s4.push("Tom");
         s4.push("SAm");
         
         if((s3.equals(s4)))
        	  System.out.println("case sensitive equal");
          else
        	  System.out.println("case sensitive not equal");   
    
	}

}
