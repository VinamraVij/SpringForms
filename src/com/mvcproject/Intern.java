package com.mvcproject;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Intern 
{
	@Override
	public String toString() {
		return "Intern [internFirstName=" + internFirstName + ", internMiddleName=" + internMiddleName
				+ ", internLastName=" + internLastName + ", internGender=" + internGender + ", internPhone="
				+ internPhone + ", internAddress=" + internAddress + ", internEmail=" + internEmail + "]";
	}
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String internFirstName;

	private String internMiddleName;
	
	@NotNull(message="is required")
	private String internLastName;
	@NotNull(message="is required")
	private String internGender;
	
	@Pattern(regexp="^[0-9]{10}",message="enter a valid phone number")
	private String internPhone;
	
	private String internAddress;
	@NotNull(message="is required")
	
	private String internEmail;
	
	public String getInternFirstName() {
		return internFirstName;
	}
	public void setInternFirstName(String internFirstName) {
		this.internFirstName = internFirstName;
	}
	public String getInternMiddleName() {
		return internMiddleName;
	}
	public void setInternMiddleName(String internMiddleName) {
		this.internMiddleName = internMiddleName;
	}
	public String getInternLastName() {
		return internLastName;
	}
	public void setInternLastName(String internLastName) {
		this.internLastName = internLastName;
	}
	public String getInternGender() {
		return internGender;
	}
	public void setInternGender(String internGender) {
		this.internGender = internGender;
	}
	public String getInternPhone() {
		return internPhone;
	}
	public void setInternPhone(String internPhone) {
		this.internPhone = internPhone;
	}
	public String getInternAddress() {
		return internAddress;
	}
	public void setInternAddress(String internAddress) {
		this.internAddress = internAddress;
	}
	public String getInternEmail() {
		return internEmail;
	}
	public void setInternEmail(String internEmail) {
		this.internEmail = internEmail;
	}
	
	
	
}