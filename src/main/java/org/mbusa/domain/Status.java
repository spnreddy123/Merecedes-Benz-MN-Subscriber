package org.mbusa.domain;

public class Status {
	public int withPhone;
	public String type;
	public String id;
	public  String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getWithPhone() {
		return withPhone;
	}
	public void setWithPhone(int withPhone) {
		this.withPhone = withPhone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
