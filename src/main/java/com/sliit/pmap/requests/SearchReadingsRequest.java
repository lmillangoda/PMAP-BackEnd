package com.sliit.pmap.requests;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchReadingsRequest {
	@JsonProperty("read_date_from")
	private Date readDateFrom;
	@JsonProperty("read_date_to")
	private Date readDateTo;
	
	public Date getReadDateFrom() {
		return readDateFrom;
	}
	public void setReadDateFrom(Date readDateFrom) {
		this.readDateFrom = readDateFrom;
	}
	public Date getReadDateTo() {
		return readDateTo;
	}
	public void setReadDateTo(Date readDateTo) {
		this.readDateTo = readDateTo;
	}
	
	
}
