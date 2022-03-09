/**
 * 
 */
package com.coding.test.business.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.test.business.domain.persistence.entity.BookEntity;
import com.coding.test.business.domain.persistence.repository.BookRepository;
import com.coding.test.business.domain.service.IBookService;

/**
 * @author cristian.zapata
 *
 */

@Service
public class BookService implements IBookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public BookEntity save(BookEntity bookEntity) {
		return bookRepository.save(bookEntity);
	}

}
