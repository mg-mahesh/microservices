/**
 * 
 */
package com.employee.service;

import java.util.List;

import com.employee.model.Employee;


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
