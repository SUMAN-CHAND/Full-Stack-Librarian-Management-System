package in.dite.library.librarian;

import java.util.HashMap;
import java.util.Map;

public class StudentList {

	static Map<Integer, Object > studentList = new HashMap<>();
	public static void main(String[] args) {
		
		StudentList studentObj = new StudentList();

		
	}
	
	public static void addStudent() {
	StudentInformation student1 = new StudentInformation(1001,"Sourav",50,"969696969");
	StudentInformation student2 = new StudentInformation(1002,"Sudip",52,"969696969");
			
		StudentList.studentList.put(student1.getCallNo(), student1);
		StudentList.studentList.put(student2.getCallNo(), student2);
	}

}
