package com.tao;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import com.tao.wsa.entity.Request;
import com.tao.wsa.repo.RequestRepo;

public class AppTest
{

		
		public static void main(String[] args)
		{
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new ClassPathResource("spring-couchbase-integration.xml").getPath());
				RequestRepo reqRepo = context.getBean(RequestRepo.class);
				
				
				Request req = new Request();
				req.setReqId(1);
				req.setCalId(11);
				req.setTaskerId("sujitbehera27@gmail.com");
				req.setReqState("waiting");
				req.setReqState("inProgress");
				
				reqRepo.save(req);
				
				Request req1 = new Request();
				req1.setReqId(2);
				req1.setCalId(12);
				req1.setTaskerId("sambitsahu@gmail.com");
				req1.setReqState("accepted");
				req1.setReqState("completed");
				
				reqRepo.save(req1);
				
				Request resReq = reqRepo.findOne(new Long(2));
				
//				Book retreivedBook = bookRepo.findOne(123l);
				
				System.out.println(resReq);
				
//				bookRepo.delete(456l);
				
				//bookRepo.getBooksByContainedWord("The");
				
				context.close();
		}

}