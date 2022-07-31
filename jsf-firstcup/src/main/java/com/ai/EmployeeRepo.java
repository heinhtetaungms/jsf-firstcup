package com.ai;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EmployeeRepo {

	private List<Employee> list;
	
	@PostConstruct
	public void init() {
		list = new ArrayList<>();
	}
	
	public void addEmpoyee(Employee employee) {
		list.add(employee);
	}

	public List<Employee> getEmployees() {
		return list;
	}

	
	
}
