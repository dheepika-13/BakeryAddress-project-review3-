package com.bakeryAddress.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bakeryAddress.dao.interface1;
import com.bakeryAddress.model.class1;

@Service

public class classService {
		
		@Autowired
		interface1 repo;
		public List<class1> fetchAll()
		 { 
			 return repo.findAll();
		 }
}
