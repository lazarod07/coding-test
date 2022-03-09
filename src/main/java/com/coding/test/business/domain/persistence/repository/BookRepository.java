/**
 * 
 */
package com.coding.test.business.domain.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coding.test.business.domain.persistence.entity.BookEntity;

/**
 * @author cristian.zapata
 *
 */

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {

}
