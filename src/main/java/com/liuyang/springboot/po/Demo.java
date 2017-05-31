package com.liuyang.springboot.po;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFilter;

public class Demo {
	private Integer id;
	private String name;
	@JsonFilter("yyyy-MM-dd hh-mi")
	private Date createDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	
}
