package com.gechackfest.events.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class CategoryHibVO {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="category_id")
    private Long id;
	@Column(name="category_name")
    private String categoryName;
	@Column(name="category_desc")
    private String categoryDesc;
	@ManyToMany(mappedBy = "categories")
    private List<EventDetailsHibVO> events;
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
	public List<EventDetailsHibVO> getEvents() {
		return events;
	}
	public void setEvents(List<EventDetailsHibVO> events) {
		this.events = events;
	}
}
