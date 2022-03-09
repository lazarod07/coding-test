/**
 * 
 */
package com.coding.test.business.http.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding.test.business.domain.dto.BookDto;
import com.coding.test.business.domain.dto.DiscountDto;
import com.coding.test.business.domain.dto.util.ResponseDiscountDto;
import com.coding.test.business.domain.dto.util.ResponseErrorDto;
import com.coding.test.business.domain.dto.util.ResponseSuccessDto;
import com.coding.test.business.domain.mapper.BookMapper;
import com.coding.test.business.domain.persistence.entity.BookEntity;
import com.coding.test.business.domain.service.IBookService;
import com.coding.test.business.domain.service.impl.external.DiscountExtService;

/**
 * @author cristian.zapata
 *
 */

@RestController
@RequestMapping("/bideafactory")
public class BookController {

	@Autowired
	DiscountExtService discountService;

	@Autowired
	IBookService bookService;

	@Autowired
	BookMapper bookMapper;

	@PostMapping("/book")
	public ResponseEntity<?> book(@Valid @RequestBody(required = true) BookDto bookDto, BindingResult result) {
		
		if (result.hasErrors()) {

			ResponseErrorDto responseError = new ResponseErrorDto();
			
			List<String> errors = result.getFieldErrors().stream()
					.map(err -> "required property '" + err.getField() + "'")
					.collect(Collectors.toList());

			responseError.setError(errors);
			responseError.setStatusCode(400);

			return new ResponseEntity<ResponseErrorDto>(responseError, HttpStatus.BAD_REQUEST);

		}

		if (bookDto.getDiscountCode() != null) {

			DiscountDto discountDto = new DiscountDto();
			discountDto.setUserId(bookDto.getId());
			discountDto.setHouseId(bookDto.getHouseId());
			discountDto.setDiscountCode(bookDto.getDiscountCode());

			ResponseDiscountDto responseDiscountDto = this.discountService.validateDiscount(discountDto);

			if (!responseDiscountDto.getStatus()) {

				ResponseErrorDto responseError = new ResponseErrorDto();

				responseError.setError(Arrays.asList("Conflict"));
				responseError.setStatusCode(409);
				responseError.setMessage("invalid discount");
				return new ResponseEntity<ResponseErrorDto>(responseError, HttpStatus.CONFLICT);
			}
		}

		BookEntity bookEntity = this.bookMapper.dtoToEntity(bookDto);

		bookService.save(bookEntity);

		ResponseSuccessDto responseSuccessDto = new ResponseSuccessDto();

		responseSuccessDto.setCode(200);
		responseSuccessDto.setMessage("Book Accepted");

		return new ResponseEntity<ResponseSuccessDto>(responseSuccessDto, HttpStatus.OK);
	}
}
