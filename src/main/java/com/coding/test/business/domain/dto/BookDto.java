/**
 * 
 */
package com.coding.test.business.domain.dto;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * @author cristian.zapata
 *
 */

public class BookDto {

	@NotNull
	@Size(min = 9, max = 10)
	String id;

	@NotNull
	@Size(min = 2, max = 50)
	String name;

	@NotNull
	@Size(min = 2, max = 50)
	String lastname;

	@NotNull
	@Min(18)
	@Max(100)
	Integer age;

	@NotNull
	@Size(min = 9, max = 20)
	String phoneNumber;

	@NotNull
	Date startDate;

	@NotNull
	Date endDate;

	@NotNull
	@Size(min = 6, max = 15)
	String houseId;

	@NotNull
	@Size(min = 8, max = 8)
	String discountCode;

	public String getId() {
		return id;
	}

	public void setId(String userId) {
		this.id = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getHouseId() {
		return houseId;
	}

	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}
}
