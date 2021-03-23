package vector;
import java.util.Vector;
import java.util.Iterator;
public class veccls {

	public static void main(String[] args) {
		
      Vector<String> v=new Vector<String>();
      v.add("Dog");
      v.add("cat");
      v.add("rat");
      v.add("cow");
      System.out.println("Vector list1 is: ");
      for(String s: v) 
       System.out.println(s);
      
      Vector<String> v1=new Vector<String>();
      v1.add("Lion");
      v1.add("Tiger");
      v1.addElement("Wolf");
      v1.addElement("fox");
      System.out.println("Vector list2 is: ");
      Iterator<String> i= v1.iterator();
      while(i.hasNext())
    	System.out.println(i.next());  
      
     v.addAll(v1);
      System.out.println("The changed Vector list1 is: "+v);
    
      System.out.println("The size of Vector list1 is: "+v.size());
      System.out.println("The size of Vector list2 is: "+v1.size());
     
      System.out.println("The capacity of Vector list1 is: "+v.capacity());
      System.out.println("The capacity of Vector list2 is: "+v1.capacity());
      
      System.out.println("The index of Vector list1 is: "+v.indexOf("rat"));
      System.out.println("The index of Vector list2 is: "+v1.indexOf("Lion"));  
      System.out.println("The index of Vector list2 is: "+v.indexOf("Lion")); 
      
      if((v.isEmpty()))
    	  System.out.println("The list1 is empty");
      else
    	  System.out.println("The list1 is not empty");
      
      if((v1.isEmpty()))
    	  System.out.println("The list2 is empty");
      else
    	  System.out.println("The list2 is not empty");
      
      System.out.println("The first value of Vector list1 is: "+v.firstElement());
      System.out.println("The first value of Vector list2 is: "+v1.firstElement());
    
      System.out.println("The last value of Vector list1 is: "+v.lastElement());
      System.out.println("The last value of Vector list2 is: "+v1.lastElement());
      
      v.insertElementAt("sheep",3);
      System.out.println("The insert value of Vector list1 is: ");
      for(String s: v) 
          System.out.println(s);
      
      v1.insertElementAt("elephant",1);
      System.out.println("The insert value of Vector list2 is: ");
      Iterator<String> i1= v1.iterator();
      while(i1.hasNext())
    	System.out.println(i1.next());  
      
      

	  System.out.println("The list1 is :"+v.contains("cat"));
	  System.out.println("The list1 is :"+v.contains("cAt"));
	  System.out.println("The list2 is :"+v1.contains("wolf"));
	  System.out.println("The list2 is :"+v1.contains("Wolf"));
	  
	  Vector<String> v2=new Vector<String>();
	  System.out.println("The cloned list3 is :"+v.clone());
	  v2.clear();
	  System.out.println("The clear list3 is :"+v2);
	  
	}

}
