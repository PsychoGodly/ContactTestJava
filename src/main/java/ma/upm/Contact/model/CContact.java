package com.contact.model;

import javax.persistence.*;

@Entity
@Table(name = "get_contact")
public class CContact {

	private Long id;
	
	
	private String name;

	private String email;

	private String tel;

	private String contenString;
	
	

	public CContact(Long id, String name, String email, String tel, String contenString) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.tel = tel;
		this.contenString = contenString;
	}
	
	
	public CContact() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getContenString() {
		return contenString;
	}

	public void setContenString(String contenString) {
		this.contenString = contenString;
	}
	
	
}
