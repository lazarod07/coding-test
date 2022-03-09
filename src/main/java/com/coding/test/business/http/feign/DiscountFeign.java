/**
 * 
 */
package com.coding.test.business.http.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.coding.test.business.domain.dto.DiscountDto;
import com.coding.test.business.domain.dto.util.ResponseDiscountDto;

/**
 * @author cristian.zapata
 *
 */

@FeignClient(name = "miscount", url = "https://622271e2666291106a26a17c.mockapi.io")
public interface DiscountFeign {

	@PostMapping(value = "/discount/v1/new")
	public ResponseDiscountDto validateDiscount(@RequestBody DiscountDto discountDto);

}
