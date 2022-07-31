package com.ai;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PrePopulateFormValue {

	private String email;
	
	private String role;
	
	private String active;
	
	private String[] permissions;
	
	public PrePopulateFormValue() {
		this.email = "maysu@gmail.com";
		this.role = "Admin";
		this.active = "Active";
		this.permissions = new String [] {"Create","Read"};
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String[] getPermissions() {
		return permissions;
	}

	public void setPermissions(String[] permissions) {
		this.permissions = permissions;
	} 
	
	
}
