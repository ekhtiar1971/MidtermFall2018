package datastructure;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> que=new LinkedList<String>();

		que.add("NY");
		que.add("NJ");
		que.add("PA");
		que.add("fl");

		System.out.println(que.peek());
		System.out.println(que.remove("fl"));
		System.out.println(que.poll());
		System.out.println(((LinkedList<String>) que).pollFirst());



		for(String st:que){
			System.out.println(st);
		}

		Iterator it=((LinkedList<String>) que).listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}


	}

}
