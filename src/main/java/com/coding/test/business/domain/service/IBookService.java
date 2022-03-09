/**
 * 
 */
package com.coding.test.business.domain.service;

import com.coding.test.business.domain.persistence.entity.BookEntity;

/**
 * @author cristian.zapata
 *
 */
public interface IBookService {
	
	BookEntity save(BookEntity bookEntity);

}
