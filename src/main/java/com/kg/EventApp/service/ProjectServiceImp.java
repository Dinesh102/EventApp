package com.kg.EventApp.service;

import com.kg.EventApp.model.Event;
import com.kg.EventApp.repository.EventRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;

@Service("projectService")
public class ProjectServiceImp implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> getAll() {
        // TODO Auto-generated method stub
        return projectRepository.findAll();
    }

    @Override
    public Project save(Project project) {
        // TODO Auto-generated method stub
        return projectRepository.saveAndFlush(project);

    }

 //   @Override
 //   public Event find(long id) {
        // TODO Auto-generated method stub
  //      return eventRepository.findOne(id);
   // }

   // @Override
   // public void delete(Long id) {
        // TODO Auto-generated method stub
    //    eventRepository.delete(id);
    //}
    
     // @Override
   // public List<Event> get3() {
        // TODO Auto-generated method stub
       // return eventRepository.findAll().stream().limit(3).collect(Collectors.toList());
    //}

}
