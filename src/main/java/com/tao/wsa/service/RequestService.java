package com.tao.wsa.service;

import java.util.List;

import com.tao.wsa.entity.Request;


public interface RequestService {
	
	 Request findRequest(long id);
	 public void update(Request request);
	 public List<Request> findRequestsByState(String state);
}
