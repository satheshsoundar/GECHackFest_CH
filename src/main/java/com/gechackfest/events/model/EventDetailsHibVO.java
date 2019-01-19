package com.gechackfest.events.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "event_details")
public class EventDetailsHibVO {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "event_id")
	private Long id;
	@Column(name = "name")
	private String eventName;
	@Column(name = "start_date")
	private Date startDate;
	@Column(name = "end_date")
	private Date endDate;
	@Column(name = "start_time")
	private Date startTime;
	@Column(name = "end_time")
	private Date endTime;
	@Column(name = "created_by")
	private String createdBy;
	
	@ManyToMany
	@JoinTable(name = "event_category", joinColumns = @JoinColumn(name = "event_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
	private List<CategoryHibVO> categories;
	
	@ManyToMany(mappedBy = "events")
	private Set<UserHibVO> users;

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

	public List<CategoryHibVO> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryHibVO> categories) {
		this.categories = categories;
	}
}
