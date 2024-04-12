package com.example1.ce2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
   @GetMapping("/studentName")
   public String print(@RequestParam String studentName)
   {
      return "Welcome "+studentName+"!";
   } 
}
