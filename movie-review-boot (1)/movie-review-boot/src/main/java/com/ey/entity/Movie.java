package com.ey.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="films")
public class Movie {

	@Id
	private int mid;
	private String title;
	private String genre;
	private LocalDate released;
	
	@JsonManagedReference
	@OneToMany(mappedBy="movie")
	List<Review> reviews = new ArrayList<>();

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

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public LocalDate getReleased() {
		return released;
	}

	public void setReleased(LocalDate released) {
		this.released = released;
	}
	
	
}
