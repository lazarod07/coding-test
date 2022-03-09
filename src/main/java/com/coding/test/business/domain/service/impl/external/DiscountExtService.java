/**
 * 
 */
package com.coding.test.business.domain.service.impl.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.test.business.domain.dto.DiscountDto;
import com.coding.test.business.domain.dto.util.ResponseDiscountDto;
import com.coding.test.business.http.feign.DiscountFeign;

/**
 * @author cristian.zapata
 *
 */

@Service
public class DiscountExtService {
	
	@Autowired
	private DiscountFeign discountFeign;
	
	public ResponseDiscountDto validateDiscount(DiscountDto discountDto) {
		return this.discountFeign.validateDiscount(discountDto);
	}

}
