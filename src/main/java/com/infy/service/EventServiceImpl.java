package com.infy.service;

import java.util.List;

import com.infy.dto.ParticipantDTO;
import com.infy.exception.EventRegistrationException;
import com.infy.repository.EventRepository;
import com.infy.repository.ParticipantRepository;

public class EventServiceImpl implements EventService{
	
	private EventRepository eventRepository;
	
	private ParticipantRepository participantRepository;
	
	@Override
	public List<ParticipantDTO> getParticipantsByEventVenue(String venue) throws EventRegistrationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParticipantDTO registerParticipant(ParticipantDTO participantDTO) throws EventRegistrationException {
		// TODO Auto-generated method stub
		return null;
	}

}
