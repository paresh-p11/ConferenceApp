package com.example.conferenceapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

@RestController
public class DummyController {

  private static final String ORGKEY = "R76KWHRN";

  @RequestMapping(value = "orgs/{orgKey}/auditlog", method = RequestMethod.POST)
  public ResponseEntity<Boolean> logEvent(@PathVariable String orgKey, @RequestBody String description){
    System.out.println(" use this orgkey : R76KWHRN");
    PrintWriter printWriter = null;
    File file = new File("/tmp/lcmaudittest.txt");
    try {

      printWriter = new PrintWriter(file);
      if (description.isEmpty()) {
        description = "some dummy description from dummy controller !! @ " + System.currentTimeMillis();
      }
      printWriter.write("start - push audit log: " + orgKey + " :::  " + description + "\n");
      System.out.println("the org key is: " + orgKey);
      printWriter.append("\nend  - audit log pushed.\n");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      printWriter.close();
    }
    return new ResponseEntity<>(true, HttpStatus.OK);
  }
}
