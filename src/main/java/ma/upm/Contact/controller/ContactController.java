package com.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.contact.model.CContact;
import com.contact.repository.ContactRepository;

@RestController
public class ContactController {
	@Autowired
	private ContactRepository pContactRepository;
	
	//method create
	@CrossOrigin
	@PostMapping("contact/create")
	public ResponseEntity<Object> createContact(@RequestBody CContact cContact){
		try {
			CContact newRole = new CContact();
			newRole.setName(cContact.getName());
			newRole.setEmail(cContact.getEmail());
			newRole.setTel(cContact.getTel());
			newRole.setContenString(cContact.getContenString());
			CContact saveRole = pContactRepository.save(newRole);
			return new ResponseEntity<>(saveRole,HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return new ResponseEntity<>(e.getCause().getCause().getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//method get all contact
	@CrossOrigin
	@GetMapping("contact/all")
	public ResponseEntity<Object> getContact() {
		try {
			return new ResponseEntity<>(pContactRepository.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(e.getCause().getCause().getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
}

