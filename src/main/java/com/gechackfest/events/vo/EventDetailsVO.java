package com.gechackfest.events.vo;

import java.util.Date;
import java.util.Set;

public class EventDetailsVO {
	private Long id;
	private String eventName;
	private Date startDate;
	private Date endDate;
	private Date startTime;
	private Date endTime;
	private String createdBy;
	private Set<CategoryVO> categories;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Set<CategoryVO> getCategories() {
		return categories;
	}

	public void setCategories(Set<CategoryVO> categories) {
		this.categories = categories;
	}
}
