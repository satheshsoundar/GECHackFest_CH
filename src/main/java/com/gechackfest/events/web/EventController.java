package com.gechackfest.events.web;

import java.text.ParseException;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gechackfest.events.helper.EventHelper;
import com.gechackfest.events.model.EventDetailsHibVO;
import com.gechackfest.events.repository.EventRepository;
import com.gechackfest.events.vo.EventDetailsVO;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@RestController
public class EventController {

	@Autowired
	EventRepository eventRepository;

	@RequestMapping(value = "/events")
	public List<EventDetailsVO> getAllEvents() {

		List<EventDetailsHibVO> eventDetailsHibVOList = eventRepository.findAll();
		List<EventDetailsVO> eventDetailsVOList;
		try {
			eventDetailsVOList = EventHelper.convertHibVoToVO(eventDetailsHibVOList);
		return eventDetailsVOList;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value = "/eventsbyuser")
	public List<EventDetailsVO> getAllEventsForUser() {

		List<EventDetailsHibVO> eventDetailsHibVOList = eventRepository.findAll();
		List<EventDetailsVO> eventDetailsVOList;
		try {
			eventDetailsVOList = EventHelper.convertHibVoToVO(eventDetailsHibVOList);
		return eventDetailsVOList;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value = "/upcomingevents")
	public List<EventDetailsVO> getUpcomingEvents() {

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		List<EventDetailsHibVO> eventDetailsHibVOList = eventRepository.findByStartDateGreaterThanEqual(cal.getTime());
		List<EventDetailsVO> eventDetailsVOList;
		try {
			eventDetailsVOList = EventHelper.convertHibVoToVO(eventDetailsHibVOList);
		return eventDetailsVOList;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping(value = "/createevent", method = RequestMethod.POST)
	public List<EventDetailsVO> createNewEvents(@RequestBody EventDetailsVO eventDetailsVO) {
		
		try {
			EventDetailsHibVO eventDetailsHibVO = EventHelper.convertVoToHibVo(eventDetailsVO);
			eventRepository.save(eventDetailsHibVO);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
