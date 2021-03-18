/**
 * 
 */
package com.employee.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.employee.model.Employee;

/**
 * @author GEDEPUDI
 *
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
	@Transactional(rollbackOn = Exception.class)
	@Modifying
    @Query(value = "update Employee e set e.emp_name =:empName where e.emp_id = :empId",nativeQuery = true)
	public void updateByEmpId(@Param("empName") String empName, @Param("empId") Integer empId);


}
