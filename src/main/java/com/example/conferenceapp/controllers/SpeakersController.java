package com.example.conferenceapp.controllers;

import com.example.conferenceapp.models.Speaker;
import com.example.conferenceapp.repositories.SpeakerRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/speakers")
public class SpeakersController {

  @Autowired
  private SpeakerRepository speakerRepository;

  @GetMapping
  @JsonIgnore
  public List<Speaker> getList() {
    return speakerRepository.findAll();
  }

  @GetMapping
  @RequestMapping("{id}")
  public Speaker get(@PathVariable long id){
    return speakerRepository.getOne(id);
  }


}
