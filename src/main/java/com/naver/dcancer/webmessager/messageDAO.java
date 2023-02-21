package com.naver.dcancer.webmessager;

import javax.websocket.Session;

public class messageDAO extends DbC {

	public messageDAO() {
		// TODO Auto-generated constructor stub
	}
	public void sendmsg(String text,String id) {
		try {
			
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			DbClose();
		}
	}
}
