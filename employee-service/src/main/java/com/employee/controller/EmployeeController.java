/**
 * 
 */
package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

import io.swagger.annotations.Api;

/**
 * @author GEDEPUDI
 *
 */

@RestController
@RequestMapping("/api")
@Api(value = "springboot-emp-service" )
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/saveAll")
	public String saveAllEmployees(@RequestBody List<Employee> listOfEmps) {
		 String result = employeeService.saveAllEmployees(listOfEmps);
		 return result;
	}
	
	@PostMapping("/save")
	public String saveEmployee(@RequestBody Employee employee) {
		 return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> findAllEmployees(){
		return employeeService.getAllEMployees();
	}
	
	@PutMapping("/update/{empId}/{empName}")
	public Employee updateEmployee(@PathVariable("empId") Integer empId, @PathVariable("empName") String empName) {
		return employeeService.updateEmployee(empId, empName);
	}

}
