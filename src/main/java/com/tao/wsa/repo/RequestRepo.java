package com.tao.wsa.repo;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.tao.wsa.entity.Request;



@Repository
public interface RequestRepo extends CouchbaseRepository<Request, Long>
{
		
	/*	@Query(value="select * from JavaCodeGeeks")
		public List<Book> getBooksByContainedWord(String containedString);*/
		
		
}
