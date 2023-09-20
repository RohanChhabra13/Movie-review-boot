package com.ey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ey.dto.MovieDto;
import com.ey.entity.Movie;
import com.ey.exception.CinemaException;
import com.ey.repo.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository repo;
	
	@Override
	public String add(MovieDto m) {
		Movie movie = new Movie();
		movie.setMid(m.getMid());
		movie.setTitle(m.getTitle());
		movie.setGenre(m.getGenre());
		movie.setReleased(m.getReleased());
		repo.save(movie);
		return "Movie Added";
		
		
	}

	@Override
	public Movie find(int mid) {
		return repo.findById(mid).orElseThrow(() -> new CinemaException("Movie not Found"));
	}

	@Override
	public List<Movie> list() {
		return repo.findAll();
	}

	@Override
	public void delete(int mid) {
		repo.deleteById(mid);
		
	}

}
