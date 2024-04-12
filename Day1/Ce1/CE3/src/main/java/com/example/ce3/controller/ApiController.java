package com.example.ce3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
   @GetMapping("/favouriteColor")
   public String display(@RequestParam String color)
   {
      return "My favourite color is "+color+"!";
   } 
}
