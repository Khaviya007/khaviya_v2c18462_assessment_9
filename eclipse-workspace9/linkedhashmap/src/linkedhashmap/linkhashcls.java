package linkedhashmap;
import java.util.LinkedHashMap;
//import java.util.Hashtable;
import java.util.Map;
public class linkhashcls {
public static void main(String[] args) {
		LinkedHashMap<Integer,Integer> h=new LinkedHashMap<Integer,Integer>();
		h.put(1,40);
		h.put(2,50);
		h.put(3, null);
		h.put(4, 10);
		System.out.println("The list1 is: ");
		for(Map.Entry<Integer,Integer> hm : h.entrySet())
		{
			System.out.println("Key: "+hm.getKey() +" " + "Value: " + hm.getValue());
		}
		
		
		LinkedHashMap<Integer,Integer> h1=new LinkedHashMap<Integer,Integer>();
		h1.putAll(h);
		h1.put(5, 90);
		System.out.println("The list2 is: ");
		for(Map.Entry<Integer,Integer> hm1 : h1.entrySet())
		{
			System.out.println("Key: "+hm1.getKey() +" " + "Value: " + hm1.getValue());
		}

		h1.remove(3,null);
		System.out.println("The list2 is: "+h1);
		h1.replace(2, 20);
		System.out.println("The list2 is: "+h1);
		
		System.out.println(" getting value in list2 is: "+h1.get(4));
		 
        } 
	}


