package com.gechackfest.events.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gechackfest.events.model.EventDetailsHibVO;
import com.gechackfest.events.vo.EventDetailsVO;

public class EventHelper {

	public static List<EventDetailsVO> convertHibVoToVO(List<EventDetailsHibVO> eventDetailsHibVOList) throws ParseException { 
		List<EventDetailsVO> eventDetailsVOList = new ArrayList<>();
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
		for (EventDetailsHibVO eventDetailsHibVO : eventDetailsHibVOList) {
			EventDetailsVO eventDetailsVO = new EventDetailsVO();
			eventDetailsVO.setCreatedBy(eventDetailsHibVO.getCreatedBy());
			Date endDate = eventDetailsHibVO.getEndDate();
			eventDetailsVO.setEndDate(sdfDate.parse(sdfDate.format(endDate)));
			Date endTime = eventDetailsHibVO.getEndTime();
			eventDetailsVO.setEndTime(sdfTime.parse(sdfTime.format(endTime)));
			eventDetailsVO.setEventName(eventDetailsHibVO.getEventName());
			eventDetailsVO.setId(eventDetailsHibVO.getId());
			Date startDate = eventDetailsHibVO.getStartDate();
			eventDetailsVO.setStartDate(sdfDate.parse(sdfDate.format(startDate)));
			Date startTime = eventDetailsHibVO.getStartTime();
			eventDetailsVO.setStartTime(sdfTime.parse(sdfTime.format(startTime)));
			eventDetailsVOList.add(eventDetailsVO);
		}
		return eventDetailsVOList;
	}
	
	public static EventDetailsHibVO convertVoToHibVo(EventDetailsVO eventDetailsVO) throws ParseException { 
		EventDetailsHibVO eventDetailsHibVO = new EventDetailsHibVO();
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
			
		eventDetailsHibVO.setCreatedBy(eventDetailsVO.getCreatedBy());
			Date endDate = eventDetailsVO.getEndDate();
			eventDetailsHibVO.setEndDate(sdfDate.parse(sdfDate.format(endDate)));
			Date endTime = eventDetailsVO.getEndTime();
			eventDetailsHibVO.setEndTime(sdfTime.parse(sdfTime.format(endTime)));
			eventDetailsHibVO.setEventName(eventDetailsVO.getEventName());
			eventDetailsHibVO.setId(eventDetailsVO.getId());
			Date startDate = eventDetailsVO.getStartDate();
			eventDetailsHibVO.setStartDate(sdfDate.parse(sdfDate.format(startDate)));
			Date startTime = eventDetailsVO.getStartTime();
			eventDetailsHibVO.setStartTime(sdfTime.parse(sdfTime.format(startTime)));
		
		return eventDetailsHibVO;
	}
}
