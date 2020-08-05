package com.boom.kaka.model;

import java.util.List;

/*

 * */
public class Patient {
	private Integer pid;
	private String pname;
	private String pusername;
	private String ppsd;
	private String birth;
	private String phone;
	private String address;

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private List<Patient_msg> msgList;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPusername() {
		return pusername;
	}
	public void setPusername(String pusername) {
		this.pusername = pusername;
	}
	public String getPpsd() {
		return ppsd;
	}
	public void setPpsd(String ppsd) {
		this.ppsd = ppsd;
	}
	public List<Patient_msg> getMsgList() {
		return msgList;
	}
	public void setMsgList(List<Patient_msg> msgList) {
		this.msgList = msgList;
	}
	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pname=" + pname + ", pusername=" + pusername + ", ppsd=" + ppsd + ", msgList="
				+ msgList + "]";
	}
	
}
