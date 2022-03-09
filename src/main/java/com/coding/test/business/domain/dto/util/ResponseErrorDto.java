/**
 * 
 */
package com.coding.test.business.domain.dto.util;

import java.util.List;

/**
 * @author cristian.zapata
 *
 */
public class ResponseErrorDto {

	Integer statusCode;

	String message;

	List<String> error;

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getError() {
		return error;
	}

	public void setError(List<String> error) {
		this.error = error;
	}
	
}
