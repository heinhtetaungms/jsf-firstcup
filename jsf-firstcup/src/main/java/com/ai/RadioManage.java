package com.ai;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class RadioManage {
	private String email;
	private String password;
	private String role;
	private List<String> roleOption;
	private String active;
	private List<String> statusOptions;
	
	
	public RadioManage() {
		roleOption = Arrays.asList("User", "Admin", "Super Admin");
		statusOptions = Arrays.asList("Active", "InActive");
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<String> getRoleOption() {
		return roleOption;
	}
	public void setRoleOption(List<String> roleOption) {
		this.roleOption = roleOption;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public List<String> getStatusOptions() {
		return statusOptions;
	}

	public void setStatusOptions(List<String> statusOptions) {
		this.statusOptions = statusOptions;
	}
	
	
	
	
	
}
