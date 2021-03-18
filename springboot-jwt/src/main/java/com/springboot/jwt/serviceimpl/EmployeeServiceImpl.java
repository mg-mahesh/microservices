/**
 * 
 */
package com.springboot.jwt.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jwt.models.Employee;
import com.springboot.jwt.repo.EmployeeRepository;
import com.springboot.jwt.service.EmployeeService;

/**
 * @author GEDEPUDI
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	
	public static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Override
	public String saveEmployee(Employee employee) {
		employeeRepo.save(employee);
		logger.info("Employee record inserted successfully");
		return "employee record inserted Successfully...!";
	}

	@Override
	public List<Employee> getAllEMployees() {
		
		return employeeRepo.findAll();
	}

	@Override
	public Employee updateEmployee(Integer empId, String empName) {
		
		 employeeRepo.updateByEmpId(empName, empId);
		 logger.info("record updated successfully..!");
		 Optional<Employee> empOptional =employeeRepo.findById(empId);
		 return empOptional.get();
		 
	}

	@Override
	public String saveAllEmployees(List<Employee> listOfEmps) {
		employeeRepo.saveAll(listOfEmps);
		logger.info("all records are inserted Successfully..!");
		return "all records are inserted Successfully..!";
	}
	
	

}
