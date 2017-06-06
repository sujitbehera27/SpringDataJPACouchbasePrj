package com.tao.wsa.entity;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

@Document(expiry=0)
public class Request
{

		@Id
		private long reqId;
		
		@Field
		private String reqState;
		
		@Field
		private String reqStatus;
		
		@Field
		private long calId;
		
		@Field
		private String taskerId;
		
		@Field
		private Tasker tasker;
		
		static class Tasker {
			private long taskerId;
	        private String nickName;
	        private String phone;
	        
	       Tasker(long taskerId, String nickName, String phone) {
				//super();
				this.taskerId = taskerId;
				this.nickName = nickName;
				this.phone = phone;
			}

			public long getTaskerId() {
				return taskerId;
			}
	
			public void setTaskerId(long taskerId) {
				this.taskerId = taskerId;
			}
	
			public String getNickName() {
				return nickName;
			}
	
			public void setNickName(String nickName) {
				this.nickName = nickName;
			}
	
			public String getPhone() {
				return phone;
			}
	
			public void setPhone(String phone) {
				this.phone = phone;
			}

	    }

//		public Request() {}
//
//		public Request(long reqId, String reqState, String reqStatus, long calId, String taskerId) {
//			//super();
//			this.reqId = reqId;
//			this.reqState = reqState;
//			this.reqStatus = reqStatus;
//			this.calId = calId;
//			this.taskerId = taskerId;
//		}



		public long getReqId() {
			return reqId;
		}



		public Tasker getTasker() {
			return tasker;
		}



		public void setTasker(Tasker tasker) {
			this.tasker = tasker;
		}



		public void setReqId(long reqId) {
			this.reqId = reqId;
		}



		public String getReqState() {
			return reqState;
		}



		public void setReqState(String reqState) {
			this.reqState = reqState;
		}



		public String getReqStatus() {
			return reqStatus;
		}



		public void setReqStatus(String reqStatus) {
			this.reqStatus = reqStatus;
		}



		public long getCalId() {
			return calId;
		}



		public void setCalId(long calId) {
			this.calId = calId;
		}



		public String getTaskerId() {
			return taskerId;
		}



		public void setTaskerId(String taskerId) {
			this.taskerId = taskerId;
		}



		@Override
		public String toString()
		{
				return "Request [reqId=" + reqId + ", reqState=" + reqState + ", reqStatus=" + reqStatus  + ", calId=" + calId +  ", taskerId=" + taskerId + "]";
		}
		
}