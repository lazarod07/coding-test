/**
 * 
 */
package com.coding.test.business.domain.mapper;

import org.springframework.stereotype.Component;

import com.coding.test.business.domain.dto.BookDto;
import com.coding.test.business.domain.persistence.entity.BookEntity;

/**
 * @author cristian.zapata
 *
 */

@Component
public class BookMapper {

	public BookEntity dtoToEntity(BookDto bookDto) {

		BookEntity bookEntity = new BookEntity();
		bookEntity.setId(bookDto.getId());
		bookEntity.setName(bookDto.getName());
		bookEntity.setLastname(bookDto.getLastname());
		bookEntity.setAge(bookDto.getAge());
		bookEntity.setPhoneNumber(bookDto.getPhoneNumber());
		bookEntity.setStartDate(bookDto.getStartDate());
		bookEntity.setEndDate(bookDto.getEndDate());
		bookEntity.setHouseId(bookDto.getHouseId());
		bookEntity.setDiscountCode(bookDto.getDiscountCode());

		return bookEntity;
	}

}
