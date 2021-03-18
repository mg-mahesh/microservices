/**
 * 
 */
package com.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author GEDEPUDI
 *
 */
@Entity
@Table(name = "address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "adds_id")
	private Integer addsId;
	@Column(name = "emp_id")
	private Integer empId;
	@Column(name = "street_name")
	private String streetName;
	@Column(name = "dist_name")
	private String distName;
	@Column(name = "state")
	private String state;
	@Column(name = "pincode")
	private Long pincode;
	
	
	/**
	 * @return the addsId
	 */
	public Integer getAddsId() {
		return addsId;
	}
	/**
	 * @param addsId the addsId to set
	 */
	public void setAddsId(Integer addsId) {
		this.addsId = addsId;
	}
	/**
	 * @return the empId
	 */
	public Integer getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}
	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	/**
	 * @return the distName
	 */
	public String getDistName() {
		return distName;
	}
	/**
	 * @param distName the distName to set
	 */
	public void setDistName(String distName) {
		this.distName = distName;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the pincode
	 */
	public Long getPincode() {
		return pincode;
	}
	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [addsId=" + addsId + ", empId=" + empId + ", streetName=" + streetName + ", distName="
				+ distName + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	

}
