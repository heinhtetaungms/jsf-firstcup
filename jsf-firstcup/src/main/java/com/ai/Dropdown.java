package com.ai;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Dropdown {
	private String email;
	private String password;
	private String role;
	private List<String> roleOption;
	
	
	
	public Dropdown() {
		roleOption = Arrays.asList("User", "Admin", "Super Admin");
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
	
	
	
}
