package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> list1= new ArrayList();
		list1.add("Dhaka");
		list1.add("Barisa");
		list1.add("Magura");

		List<String> list2 = new ArrayList();
		list2.add("NY");
		list2.add("NJ");
		list2.add("PA");

		//List<String> list3 = new ArrayList();
		//list3.add("");
		//list3.add("8th employee");
		//list3.add("9th employee");


		Map<String, List<String>> map = new HashMap<String,List<String>>();
		map.put("Bangladesh",list1);
		map.put("USA",list2);
		//map.put("Sales", employeesSales);

		//for each loop

		for(Map.Entry key: map.entrySet()){
			System.out.println(key.getKey()+" "+key.getValue());
		}



		//Iterator with for loop



		Iterator it =map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}






	}

}
