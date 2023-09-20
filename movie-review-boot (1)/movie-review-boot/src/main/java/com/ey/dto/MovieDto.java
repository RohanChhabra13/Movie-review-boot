package com.ey.dto;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class MovieDto {
	
	@Min(value=99,message="mid should have a minimun value of 99")
	private int mid;
	@Size(min=10,message="Title size should be atleaset 10")
	private String title;
	@NotNull(message="Genre cannot be Null")
	private String genre;
	@Past(message="Release Date cannot be in past")
	private LocalDate released;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public LocalDate getReleased() {
		return released;
	}
	public void setReleased(LocalDate released) {
		this.released = released;
	}
	
	
}
