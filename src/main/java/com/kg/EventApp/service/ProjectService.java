package com.kg.EventApp.service;

import com.kg.EventApp.model.Event;
import java.util.List;



public interface ProjectService {

    public List<Project> getAll();

    public Event save(Project project);

    //public Event find(long id);

   //public void delete(Long id);

    //public List<Event> get3();
}
