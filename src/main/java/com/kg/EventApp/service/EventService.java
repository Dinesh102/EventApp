package com.kg.EventApp.service;

import com.kg.EventApp.model.Event;
import java.util.List;



public interface EventService {

    public List<Event> getAll();

    public Event save(Event event);

    public Event find(long id);

    public void delete(Long id);

    public List<Event> get3();
}
