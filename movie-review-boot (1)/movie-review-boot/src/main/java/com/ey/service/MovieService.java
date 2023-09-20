package com.ey.service;

import java.util.List;

import com.ey.dto.MovieDto;
import com.ey.entity.Movie;

public interface MovieService {
	
	String add (MovieDto m);
	Movie find (int mid);
	List<Movie> list();
	void delete (int mid);
}
