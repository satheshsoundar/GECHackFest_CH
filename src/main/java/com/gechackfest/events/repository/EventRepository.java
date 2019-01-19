package com.gechackfest.events.repository;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gechackfest.events.model.CategoryHibVO;
import com.gechackfest.events.model.EventDetailsHibVO;

public interface EventRepository extends JpaRepository<EventDetailsHibVO, Long>{
	public List<EventDetailsHibVO> findByStartDateGreaterThanEqual(Date startDate);
	public List<EventDetailsHibVO> findByCategories(Set<CategoryHibVO> categorySet);
}
