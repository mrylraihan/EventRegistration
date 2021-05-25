package com.infy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infy.entity.Participant;

public interface ParticipantRepository extends CrudRepository<Participant, Integer>{
	List<Participant> getParticipantsByEventVenue(String venue);
}
