/**
 * 
 */
package com.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.model.Address;

/**
 * @author GEDEPUDI
 *
 */
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
