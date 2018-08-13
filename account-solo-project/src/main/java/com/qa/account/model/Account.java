package com.qa.account.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue //(strategy = GenerationType.AUTO)
	public Long id;
	public String firstName;
	public String lastName;
	public String accountNumber;
	public String address;
	public String email;
	public String age;
	

	public Account() {
		super();			//super() keeps jpa happy
	}

	public Account(Long id, String firstName, String lastName, String accountNumber, String address, String email, String age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.address = address;
		this.email = email;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
