package com.devsuperior.movieflix.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;

import com.devsuperior.movieflix.entities.User;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@SuppressWarnings("serial")
public class UserDTO implements Serializable{ 

	private Long id;
	@NotBlank(message = "Campo obrigatório")
	private String name;
	@Email(message = "Entre com email válido")
	private String email;
	
	Set<RoleDTO> roles = new HashSet<>();
	
	public UserDTO() {
	}

	public UserDTO(Long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public UserDTO(User entity) {
		 BeanUtils.copyProperties(entity, this);
		 entity.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));
		 
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
	
	public Set<RoleDTO> getRoles() {
		return roles;
	}
}
