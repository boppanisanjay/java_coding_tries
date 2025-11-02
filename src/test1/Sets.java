package test1;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void treeset() {
        Set<String> cities = new TreeSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Kolkata");

        System.out.println("Cities in sorted order: " + cities);
    }
    
    public static void linkedHashSet() {
    	Set<Object> data = new java.util.LinkedHashSet<Object>();
    	
    	  data.add(10);
          data.add(5);
          data.add(20);
          data.add(5); // duplicate ignored

          System.out.println("Numbers: " + data); // Maintains insertion order  	
    }
    
    public static void main(String[] args) {
		linkedHashSet();
		treeset();
	}
}
