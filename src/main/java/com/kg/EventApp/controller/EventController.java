package com.kg.EventApp.controller;

import com.kg.EventApp.model.Event;
import com.kg.EventApp.service.EventService;
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
@RequestMapping("api/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/get")
    public @ResponseBody ResponseEntity<List<Event>> all() {
        return new ResponseEntity<>(eventService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<?> post(@RequestBody Event event, UriComponentsBuilder ucBuilder) {
        eventService.save(event);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/get/{id}").buildAndExpand(event.getId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);

    }

    @GetMapping("/get/{eventId}")
    public @ResponseBody ResponseEntity<?> getById(@PathVariable Long eventId) {

        Event event = eventService.find(eventId);
        return new ResponseEntity<>(event, HttpStatus.OK);

    }

    @PutMapping("/put/{eventId}")
    public ResponseEntity<?> put(@PathVariable Long eventId, @RequestBody Event event) {
		eventService.save(event);
        return new ResponseEntity<>(event, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{eventId}")
    public ResponseEntity<?> delete(@PathVariable Long eventId) {
        //Event currentevent = eventService.find(eventId);
        eventService.delete(eventId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
	
	 @GetMapping("/getThree")
        public @ResponseBody ResponseEntity<List<Event>> get3(){
            return new ResponseEntity<>(eventService.get3(),HttpStatus.OK);
        }
    }
