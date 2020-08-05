package com.boom.kaka.model;

public class QueryVo {
	private String pusername;
	private String ppsd;
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
	@Override
	public String toString() {
		return "QueryVo [pusername=" + pusername + ", ppsd=" + ppsd + "]";
	}

	public QueryVo(String pusername, String ppsd) {
		this.pusername = pusername;
		this.ppsd = ppsd;
	}
}
