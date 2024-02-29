package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;

import com.devsuperior.movieflix.entities.Movie;

@SuppressWarnings("serial")
public class MovieCardDTO implements Serializable{ 

	private Long id;
	private String title;
	private String subTitle;
	private Integer year;
	private String imgUrl;

	public MovieCardDTO(Movie entity) {

		BeanUtils.copyProperties(entity, this);

	}
	

	public MovieCardDTO(Long id, String title, String subTitle, Integer year, String imgUrl) {
		this.id = id;
		this.title = title;
		this.subTitle = subTitle;
		this.year = year;
		this.imgUrl = imgUrl;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
}
