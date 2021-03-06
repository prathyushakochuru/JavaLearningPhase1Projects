package CollectionsOp;
import java.util.*;

//Author: Prathyusha Kochuru
//Date: 02/09/2021

//Implementation of Map - HashMap & LinkedHashMap

public class MapCrud {

	public static void main(String[] args) {
		//Declare a Hashmap
		
		Map<Integer, String> hm = new HashMap();
		//adding key value pair
		hm.put(100, "Neena");
		hm.put(129, "Harsha");
		hm.put(200, "Aarush");
		hm.put(322, "Sai");
		hm.put(344, "Ramu");
		//reading the hashmap
		System.out.println("Hash Map is : " + hm);
		
		System.out.println("The Keys of Map is : " + hm.keySet());
		
		System.out.println("Is Raman present in the Map: " + hm.containsValue("Raman"));
		
		System.out.println("The value for key 100 : " + hm.get(100));
		
		
		//sorting the hashmap
		System.out.println("Map after sorting Asc order: ");
		hm.entrySet()
	      .stream() 
	      .sorted(Map.Entry.comparingByKey())   
	      .forEach(System.out::println);
		System.out.println("Map after sorting Desc order: ");
		hm.entrySet()
	      .stream() 
	      .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))   
	      .forEach(System.out::println);
		
		//deleting a value
		hm.remove(322);
		System.out.println("Map after deletion: " + hm);
		
		//adding a value again
		hm.put(355, "Abhi");
		System.out.println("Map after addition: " + hm);
		
		
		//Declare a LinkedHashMap
		
				Map<Integer, String> lhm = new LinkedHashMap();
				//adding key value pair
				lhm.put(1200, "Neena1");
				lhm.put(1299, "Harsha1");
				lhm.put(2040, "Aarush1");
				lhm.put(3522, "Sai1");
				lhm.put(3644, "Ramu1");
				//reading the linked hashmap
				System.out.println("Linked Hash Map is : " + lhm);
				
				System.out.println("Keys: "+lhm.keySet());  
			      
			    System.out.println("Values: "+lhm.values());  
				      
				System.out.println("Key-Value pairs: "+lhm.entrySet());  
					
				System.out.println("Is Raman2 present in the LinkedHashMap: " + lhm.containsValue("Raman2"));
				
				System.out.println("The value for key 1200 : " + lhm.get(1200));
				
				
				//sorting the linked hashmap
				System.out.println("LinkedHashMap after sorting Asc order: ");
				lhm.entrySet()
			      .stream() 
			      .sorted(Map.Entry.comparingByKey())   
			      .forEach(System.out::println);
				System.out.println("LinkedHashMap after sorting Desc order: ");
				lhm.entrySet()
			      .stream() 
			      .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))   
			      .forEach(System.out::println);
				
				//deleting a value
				lhm.remove(3522);
				System.out.println("LinkedHashMap after deletion: " + lhm);
				
				//adding a value again
				lhm.put(355, "Abhi");
				System.out.println("LinkedHashMap after addition: " + lhm);
		
		
		
	}

}
