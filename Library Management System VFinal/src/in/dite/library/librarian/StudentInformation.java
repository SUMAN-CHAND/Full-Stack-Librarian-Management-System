package in.dite.library.librarian;

public class StudentInformation {

	private Integer callNo ;
	private String name;
	private Integer studentId;
	private String contactNo;
	
	public Integer getCallNo() {
		return callNo;
	}
	public void setCallNo(Integer callNo) {
		this.callNo = callNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	@Override
	public String toString() {
		return "StudentInformatin [callNo=" + callNo + ", name=" + name + ", studentId=" + studentId + ", contactNo="
				+ contactNo + "]";
	}
	
	public StudentInformation(Integer callNo, String name, Integer studentId, String contactNo) {
		super();
		this.callNo = callNo;
		this.name = name;
		this.studentId = studentId;
		this.contactNo = contactNo;
	}
	
	
	public StudentInformation() {
		super();
	}

}
