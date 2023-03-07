package com.hibernate.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="registration")
//User class will be inherited to passenger and admin to access its fields id, username etc
@Inheritance(strategy= InheritanceType.JOINED) 
//foreign key (registration table to passenger, registration table to admin)
public class User {
	//private fields for encapsulation
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //for auto-increment
	private int id;
	@Column(length = 50)
	//maximum 50 characters
	private String userName;
	@Column(length = 50)
	private String password;
	//role can be admin or passenger
	@Column(name="roles", length = 50)
	private String role;

}
