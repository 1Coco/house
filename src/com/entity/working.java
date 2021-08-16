package com.entity;

import java.util.*;

public class working {

	private Integer id;
	private String title;
	private String content;
	private String createDate;
	private Integer type;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "working [id=" + id + ", title=" + title + ", content="
				+ content + ", createDate=" + createDate + ", type=" + type
				+ "]";
	}
	public working(Integer id, String title, String content, String createDate,
			Integer type) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.createDate = createDate;
		this.type = type;
	}
	public working() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
