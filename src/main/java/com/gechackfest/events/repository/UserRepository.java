package com.gechackfest.events.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gechackfest.events.model.UserHibVO;

public interface UserRepository extends JpaRepository<UserHibVO, Long> {
    UserHibVO findByUserName(String username);
}
