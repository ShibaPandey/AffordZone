package com.affordzone.ecom.Afordzone;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@GetMapping("/employeeprofile")
	public Employee getEmployee() {
		Employee employee = new Employee("shiba", "pandey", "2301","newyork");
		return employee;
		
	}

}
