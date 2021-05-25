package com.infy.service;
import java.util.List;

import com.infy.dto.ParticipantDTO;
import com.infy.exception.EventRegistrationException;

public interface EventService {
	List<ParticipantDTO> getParticipantsByEventVenue(String venue) throws EventRegistrationException;
	ParticipantDTO registerParticipant(ParticipantDTO participantDTO) throws EventRegistrationException;
}
