package com.bakeryAddress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bakeryAddress.model.class1;
import com.bakeryAddress.service.classService;

@RestController
public class classController {
	
	@Autowired
	classService dso;
	@GetMapping("/fetchAll")
	   public List<class1>fetchAll()
	   {    
		  return dso.fetchAll();
	   }
}
