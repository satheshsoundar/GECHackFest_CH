package com.gechackfest.events.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gechackfest.events.model.RoleHibVO;

public interface RoleRepository extends JpaRepository<RoleHibVO, Long>{
}
