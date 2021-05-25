package com.infy.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.infy.entity.Event;

public interface EventRepository extends CrudRepository<Event, Integer>{

}
