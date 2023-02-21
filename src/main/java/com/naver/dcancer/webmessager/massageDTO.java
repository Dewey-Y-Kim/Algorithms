package com.naver.dcancer.webmessager;

public class massageDTO {

	public massageDTO() {
		// TODO Auto-generated constructor stub
	}
	private String message;
	private String id;
	private String date;
	private String target;
	@Override
	public String toString() {
		return "massageDTO [" + (message != null ? "message=" + message + ", " : "")
				+ (id != null ? "id=" + id + ", " : "") + (date != null ? "date=" + date + ", " : "")
				+ (target != null ? "target=" + target : "") + "]";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	
}
