package WebEnquireForm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "login")
public class LoginApi {

	@Id
	@GeneratedValue(strategy   =  GenerationType.IDENTITY)
	@Column(name   =   "id")
	private  Long id;
	@Column(name   =  "email")
	private String email;
     @Column(name   =  "password")
	private String  password;
	@Column(name   =  "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LoginApi(Long id, String email, String password, String firstName, String lastName) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public LoginApi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
