package com.gechackfest.events.vo;

import java.util.Set;

public class CategoryVO {
	private Long id;

	private String categoryName;

	private String categoryDesc;

	private Set<EventDetailsVO> events;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	public Set<EventDetailsVO> getEvents() {
		return events;
	}

	public void setEvents(Set<EventDetailsVO> events) {
		this.events = events;
	}
}
