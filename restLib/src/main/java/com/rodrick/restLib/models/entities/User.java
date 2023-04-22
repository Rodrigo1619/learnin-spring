package com.rodrick.restLib.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data 
@AllArgsConstructor
public class User {
	private String username;
	private String email;
	private String name;
	
	//para no devolver la password
	@JsonIgnore
	private String password;
}
