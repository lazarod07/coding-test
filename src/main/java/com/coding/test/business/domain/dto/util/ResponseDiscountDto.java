/**
 * 
 */
package com.coding.test.business.domain.dto.util;

/**
 * @author cristian.zapata
 *
 */
public class ResponseDiscountDto {

	Boolean status;

	String userId;

	String houseId;

	String discountCode;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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
