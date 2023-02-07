package in.dite.library.librarian;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class AllBookLists {
	static Map<Integer, Object > bookList = new HashMap<>();
	static Map<Integer, Integer > callNos = new HashMap<>();
	static Map<Integer, Object > bookListOfReturn = new HashMap<>();
	
	
	public static void main(String[] args) {
		
		AllBookLists bookObj = new AllBookLists();

		
	}
	
	public static void addBooksFun() {
	Books book1 = new Books(101,"Math","S. Chand","DIET",10);
			
			
	Books book2 = new Books(102, "Math2", "munna07", "Diet", 5);
			
			AllBookLists.bookList.put(book1.getCallNo(), book1);
			AllBookLists.bookList.put(book2.getCallNo(), book2);
			AllBookLists.callNos.put(book1.getCallNo(), book1.getCallNo());
			AllBookLists.callNos.put(book2.getCallNo(),book2.getCallNo());
	}

}
