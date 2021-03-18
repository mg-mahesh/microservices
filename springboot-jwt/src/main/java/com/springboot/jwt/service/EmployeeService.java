/**
 * 
 */
package com.springboot.jwt.service;

import java.util.List;

import com.springboot.jwt.models.Employee;


/**
 * @author GEDEPUDI
 *
 */
public interface EmployeeService {
	public String saveAllEmployees(List<Employee> listOfEmps);
	public String saveEmployee(Employee employee);
	public List<Employee> getAllEMployees();
	public Employee updateEmployee(Integer empId, String empName);

}
