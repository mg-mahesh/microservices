package com.springboot.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jwt.models.Employee;
import com.springboot.jwt.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api")
@Api(value = "springboot-jwt-service", description = "Creates and Authenticates JWT Tokens" )
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@ApiOperation(value = "SaveAll", response = String.class, tags = "persists All Employees")
	@ApiResponses(value = {
			 	@ApiResponse(code = 200, message = "Success|OK"),
	            @ApiResponse(code = 401, message = "not authorized!"), 
	            @ApiResponse(code = 403, message = "forbidden!!!"),
	            @ApiResponse(code = 404, message = "not found!!!") 
	})
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
	public List<Employee> findAllEmployees() {
		return employeeService.getAllEMployees();
	}

	@PutMapping("/update/{empId}/{empName}")
	public Employee updateEmployee(@PathVariable("empId") Integer empId, @PathVariable("empName") String empName) {
		return employeeService.updateEmployee(empId, empName);
	}
}