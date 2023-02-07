package in.dite.library.librarian;

public class Books {

	private Integer callNo ;
	private String name;
	private String author;
	private String publisher;
	private Integer quantity;
	
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Books(Integer callNo, String name, String author, String publisher, Integer quantity) {
		super();
		this.callNo = callNo;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
	
	public Books() {
		super();
	}
	@Override
	public String toString() {
		return "Books [callNo=" + callNo + ", name=" + name + ", author=" + author + ", publisher=" + publisher
				+ ", quantity=" + quantity + "]";
	}

}
