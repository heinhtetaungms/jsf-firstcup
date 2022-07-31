package com.ai;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

@ManagedBean
public class DisplayListObject {
	
	private Employee employee;
	private List<Employee> employees;
	
	@Inject
	private EmployeeRepo repo;
	
	@PostConstruct
	public void init() {
		employee = new Employee();
		employees = repo.getEmployees();
	}

	public String addEmployee() {
		repo.addEmpoyee(employee);
		employees = repo.getEmployees();
		return "page12-1?faces-redirect=true";
	}
	
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
}
