package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		List<String> list=new ArrayList<String>();

		list.add("Dog");
		list.add("cat");
		list.add("Rat");

		System.out.println(list.remove("cat"));
		System.out.println(list);

		for(String st:list){
			System.out.println(st);
		}

		Iterator it=list.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}



		ConnectToSqlDB connect=new ConnectToSqlDB();

		try{
			//connect.insertDataFromArrayListToSqlTable("Rahman","column 1");
		connect.readDataBase("Table1","column 1");
		}catch(Exception e){
			System.out.println(e);

		}

	

	}

}
