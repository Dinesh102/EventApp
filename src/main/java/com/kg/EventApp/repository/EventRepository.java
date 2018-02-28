package com.kg.EventApp.repository;

import com.kg.EventApp.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository("eventRepository")
public interface EventRepository extends JpaRepository<Event, Long> {

}