package com.ey.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ey.dto.MovieDto;
import com.ey.dto.ReviewDto;
import com.ey.entity.Movie;
import com.ey.entity.Review;
import com.ey.service.MovieService;
import com.ey.service.ReviewService;

@RestController
public class MovieController {
	
	@Autowired
	private MovieService service;
	
	@Autowired
	private ReviewService Reservice;
	
	@PostMapping(value="/movie/add",consumes="application/json")
	public String add(@RequestBody @Valid MovieDto m) {
		service.add(m);
		return "Service Added !";
	}
	@GetMapping(value="/movie/{mid}",produces="application/json")
	public Movie find(@PathVariable int mid) {
		return service.find(mid);
	} 
	@GetMapping(value="/moives",produces="application/json")
	public List<Movie> list(){
		return service.list();
	}
	@DeleteMapping(value="/movies/{mid}",produces="application/json")
	public String delete(@PathVariable int mid) {
		service.delete(mid);
		return "Movie Deleted";
	}
	
	@PostMapping(value="/review/{mid}",consumes="application/json")
	public String add(@RequestBody @Valid ReviewDto r, @PathVariable int mid) {
		Reservice.add(r, mid);
		return "Review Added";
	}
	
	@GetMapping(value="/reviews/{mid}",produces="application/json")
	public List<Review> list(@PathVariable int mid){
		return Reservice.ListByMovie(mid);
	}
	
}
