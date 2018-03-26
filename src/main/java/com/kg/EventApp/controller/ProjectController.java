package com.kg.EventApp.controller;

import com.kg.EventApp.model.Project;
import com.kg.EventApp.service.ProjectService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

//import com.kgfsl.forum.Agenda;

@RestController
// @CrossOrigin(origins = "http://localhost:10001", maxAge = 3600)
@CrossOrigin()
@RequestMapping("api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/get")
    public @ResponseBody ResponseEntity<List<project>> all() {
        return new ResponseEntity<>(projectService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<?> post(@RequestBody Project project, UriComponentsBuilder ucBuilder) {
        projectService.save(project);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/get/{id}").buildAndExpand(event.getId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);

    }

    @GetMapping("/get/{ID}")
    public @ResponseBody ResponseEntity<?> getById(@PathVariable Long ID) {

        Project project = projectService.find(ID);
        return new ResponseEntity<>(project, HttpStatus.OK);

    }

    @PutMapping("/put/{ID}")
    public ResponseEntity<?> put(@PathVariable Long ID, @RequestBody Project project) {
		projectService.save(project);
        return new ResponseEntity<>(project, HttpStatus.OK);
    }

//     @DeleteMapping("/delete/{eventId}")
//     public ResponseEntity<?> delete(@PathVariable Long eventId) {
//         //Event currentevent = eventService.find(eventId);
//         eventService.delete(eventId);
//         return new ResponseEntity<>(HttpStatus.OK);
//     }
	
// 	 @GetMapping("/getThree")
//         public @ResponseBody ResponseEntity<List<Event>> get3(){
//             return new ResponseEntity<>(eventService.get3(),HttpStatus.OK);
//         }
    }
