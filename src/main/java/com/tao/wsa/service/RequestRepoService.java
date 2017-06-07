package com.tao.wsa.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.couchbase.client.protocol.views.ComplexKey;
import com.couchbase.client.protocol.views.Query;
import com.tao.wsa.entity.Request;
import com.tao.wsa.repo.RequestRepo;

import org.springframework.data.couchbase.core.CouchbaseTemplate;
import org.springframework.stereotype.Service;

import com.couchbase.client.protocol.views.ComplexKey;
import com.couchbase.client.protocol.views.Query;

@Service
@Qualifier("PersonRepositoryService")
public class RequestRepoService implements RequestService{
	
	@Autowired
    private RequestRepo repo;
	
	
	public Request findRequest(long id) {
        return repo.findOne(id);
    }
	public void update(Request request) {
        repo.save(request);
	}
	public List<Request> findRequestsByState(String state) {
		Query query = new Query();
		//query.setKey(ComplexKey.of(convertor.convert(guest).getId()));
        List<Request> requests = new ArrayList<Request>();
        Iterator<Request> it  = repo.findAll().iterator();
       
        while(it.hasNext()) {
        	requests.add(it.next());
        }
        return requests;
    }
}
