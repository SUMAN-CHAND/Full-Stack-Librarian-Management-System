package in.dite.library.librarian;

public class LibrarianDetails {
	
	
		private Integer id ;
		private String name;
		private String password;
		private String email;
		private String contect;
		private String city;
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getContect() {
			return contect;
		}
		public void setContect(String contect) {
			this.contect = contect;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "LibrarianDetails [Id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", contect="
					+ contect + ", city=" + city + "]";
		}
		public LibrarianDetails(Integer id, String name, String password, String email, String contect, String city) {
			super();
			this.id = id;
			this.name = name;
			this.password = password;
			this.email = email;
			this.contect = contect;
			this.city = city;
		}
		public LibrarianDetails() {
			super();
		}	
	
}
