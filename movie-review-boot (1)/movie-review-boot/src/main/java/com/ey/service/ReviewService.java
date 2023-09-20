package com.ey.service;

import java.util.List;

import com.ey.dto.ReviewDto;
import com.ey.entity.Review;

public interface ReviewService {
	
	int add(ReviewDto r, int mid);
	List<Review> ListByMovie(int mid);
}
