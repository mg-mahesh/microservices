/**
 * 
 */
package com.springboot.jwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.jwt.models.Address;


/**
 * @author GEDEPUDI
 *
 */
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
