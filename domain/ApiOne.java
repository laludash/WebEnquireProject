package WebEnquireForm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name  = "Enquiry")
@Entity
public class ApiOne {

	@Id
	@GeneratedValue
	private int Id;
	private String firstname;
	private String lastname;
	private String emailid;
	private String mobilenumber;
	private String remark;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public ApiOne(int id, String firstname, String lastname, String emailid, String mobilenumber, String remark) {
		super();
		Id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.mobilenumber = mobilenumber;
		this.remark = remark;
	}
	public ApiOne() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
