package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;

import com.devsuperior.movieflix.entities.Genre;

import jakarta.validation.constraints.NotBlank;

@SuppressWarnings("serial")
public class GenreDTO implements Serializable  {

    private Long id;
    @NotBlank(message = "Campo requerido")
    private String name;
    
    public GenreDTO() {
    		
    }
        

    public GenreDTO(Long id, @NotBlank(message = "Campo requerido") String name) {
		this.id = id;
		this.name = name;
	}


	public GenreDTO(Genre entity) {
    	BeanUtils.copyProperties(entity, this);
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
}
