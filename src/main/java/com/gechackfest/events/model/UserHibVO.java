package com.gechackfest.events.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user_details")
public class UserHibVO {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long userId;
	@Column(name = "full_name")
	private String fullName;
	@Column(name = "email")
	private String email;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "password")
	private String password;
	@Column(name = "ph_number")
	private String phoneNumber;
	@ManyToMany
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<RoleHibVO> roles;
	
	@ManyToMany
	@JoinTable(name = "registered_events", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "event_id"))
	private Set<EventDetailsHibVO> events;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Set<RoleHibVO> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleHibVO> roles) {
		this.roles = roles;
	}

	public Set<EventDetailsHibVO> getEvents() {
		return events;
	}

	public void setEvents(Set<EventDetailsHibVO> events) {
		this.events = events;
	}
	
}
