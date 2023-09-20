package com.ey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ey.dto.ReviewDto;
import com.ey.entity.Movie;
import com.ey.entity.Review;
import com.ey.repo.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService {
	
	@Autowired
	private ReviewRepository repo;
	
	@Autowired
	private MovieService service;
	
	@Override
	public int add(ReviewDto r, int mid) {
		Review rv = new Review();
		rv.setCaption(rv.getCaption());
		rv.setComment(rv.getComment());
		rv.setMovie(rv.getMovie());
		rv.setRid(rv.getRid());
		Movie movie = service.find(mid);
		rv.setMovie(movie);
		repo.save(rv);
		return rv.getRid();
	}

	@Override
	public List<Review> ListByMovie(int mid) {
		return repo.findByMovie(mid);
	}

}
