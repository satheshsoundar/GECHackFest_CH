package com.gechackfest.events.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "role")
public class RoleHibVO {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "role_id")
	private Long roleId;
	@Column(name = "role_name")
	private String roleName;
	@Column(name = "role_desc")
	private String roleDesc;
	@ManyToMany(mappedBy = "roles")
	private Set<UserHibVO> users;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public Set<UserHibVO> getUsers() {
		return users;
	}

	public void setUsers(Set<UserHibVO> users) {
		this.users = users;
	}
}
