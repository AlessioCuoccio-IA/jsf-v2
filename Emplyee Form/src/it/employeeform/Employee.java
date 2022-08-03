package it.employeeform;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class Employee {
	
	private String fullname;
	private Integer age;
	private String genre;
	private String status;
	private String[] prefDep;
	private String refCode;
	private String additionalComments;
	private String email;
	
	public Employee() {}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}



	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String[] getPrefDep() {
		return prefDep;
	}

	public void setPrefDep(String[] prefDep) {
		this.prefDep = prefDep;
	}

	public String getRefCode() {
		return refCode;
	}

	public void setRefCode(String refCode) {
		this.refCode = refCode;
	}

	public String getAdditionalComments() {
		return additionalComments;
	}

	public void setAdditionalComments(String additionalComments) {
		this.additionalComments = additionalComments;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void validateEmail(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		String email = value.toString();
		if (!email.endsWith("@email.com")) 
			throw new ValidatorException(new FacesMessage("Invalid email"));
	}
	
	
	
}
