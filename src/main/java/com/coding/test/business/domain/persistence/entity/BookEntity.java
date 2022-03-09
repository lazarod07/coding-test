/**
 * 
 */
package com.coding.test.business.domain.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

/**
 * @author cristian.zapata
 *
 */

@Entity
@Table(name = "book", schema = "bf")
public class BookEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	Long bookId;

	@NotNull
	@Column(name = "id")
	String id;

	@NotNull
	@Column(name = "name")
	String name;

	@NotNull
	@Column(name = "lastname")
	String lastname;

	@NotNull
	@Column(name = "age")
	Integer age;

	@NotNull
	@Column(name = "phone_number")
	String phoneNumber;

	@NotNull
	@Column(name = "start_date")
	Date startDate;

	@NotNull
	@Column(name = "end_date")
	Date endDate;

	@NotNull
	@Column(name = "housei_d")
	String houseId;

	@Column(name = "discount_code")
	String discountCode;

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

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
