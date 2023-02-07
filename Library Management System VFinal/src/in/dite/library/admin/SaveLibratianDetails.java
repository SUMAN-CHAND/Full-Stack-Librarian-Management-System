package in.dite.library.admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import in.dite.library.librarian.LibrarianDetails;

public class SaveLibratianDetails {
	
	public static ArrayList<Object> listOfLibrarianName = new ArrayList<>();
	public static ArrayList<Object> listOfLibrarianPassword = new ArrayList<>();
	public static ArrayList<Object> listOfLibrarianId = new ArrayList<>();
	
	public static Map<Integer, Object> listOfLib =  new HashMap<>();
	
	public static void main(String[] args) {
		
		SaveLibratianDetails saveObj = new SaveLibratianDetails();	
		
	} 
	
	public static void addLibrarians() {
		LibrarianDetails librarian1 = new LibrarianDetails(1, "Suman", "suman07","sumanchand@gmail.com" , "9883845357", "Bankura");
		LibrarianDetails librarian2 = new LibrarianDetails(2, "Munna", "munna07","munnasabir@gmail.com" , "9685749685", "Dumkal");
		
		int id1 = librarian1.getId();
		int id2 = librarian2.getId();
		
		SaveLibratianDetails.listOfLib.put(id1, librarian1);
		SaveLibratianDetails.listOfLib.put(id2, librarian2);
		
		SaveLibratianDetails.listOfLibrarianName.add(librarian1.getName());
		SaveLibratianDetails.listOfLibrarianPassword.add(librarian1.getPassword());
		SaveLibratianDetails.listOfLibrarianId.add(librarian1.getId());
		
		SaveLibratianDetails.listOfLibrarianName.add(librarian2.getName());
		SaveLibratianDetails.listOfLibrarianPassword.add(librarian2.getPassword());
		SaveLibratianDetails.listOfLibrarianId.add(librarian2.getId());
	}

}
