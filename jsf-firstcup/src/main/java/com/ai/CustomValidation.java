package com.ai;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.validation.ValidationException;

@ManagedBean
public class CustomValidation {

	private String name;
	private String email;
	private String postalCode;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public void validatePostalCode(FacesContext context, UIComponent component, Object value) throws ValidationException {
		if(value == null) {
			return;
		}
		String data = value.toString();
		if(!data.startsWith("MM")) {
			FacesMessage message = new FacesMessage("Postal Code must start with MM");
			throw new ValidatorException(message);
		}
	}
	
	
}
