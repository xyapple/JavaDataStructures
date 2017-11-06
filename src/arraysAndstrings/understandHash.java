package arraysAndstrings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class understandHash {
public static void main(String[] args) {
	Integer obj1 = new Integer(2009);
	String obj2 = new String("2009");
	//System.out.println("hashCode for an integer is " + obj1.hashCode());
	//System.out.println("hashCode for a string is " + obj2.hashCode());
	
    ArrayList<Integer> obj4 = new ArrayList<Integer>();
    obj4.add(new Integer(2009));
    //System.out.println("\nhashCode for an arraylist " + obj4.hashCode());
    String[] words = new String("Nothing is as easy as it looks").split(" ");
    HashSet<String> hs = new HashSet<String>();
    for(String x: words) {
    		hs.add(x);
    		
    }
    
    System.out.println(hs.size() + " distinct words detected.");
    System.out.println(hs);
    
    String[] data = new String("Nothing is as easy as it looks").split(" ");

    HashMap <String, Integer> hm = new HashMap<String, Integer>();

    for (String key : data)
    {
    	Integer freq = hm.get(key); //returns the value associated with that key. 
    	if(freq == null) freq = 1; else freq ++;
    	hm.put(key, freq); //adds the key-value pair to the map.
    }
    System.out.println(hm);
}
}
