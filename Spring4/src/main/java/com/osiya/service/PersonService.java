package com.osiya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osiya.bean.Person;
import com.osiya.repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository pr;
	
	
	
public void insertForm(Person p)
{
      	pr.save(p);
     
}
public void selectForm(Person p)
{
     List l= pr.findAll();
     System.out.println(l);
     
}
}
