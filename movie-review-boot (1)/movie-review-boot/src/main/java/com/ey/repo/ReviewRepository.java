package com.ey.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ey.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
	
	@Query("FROM Review WHERE movie.mid=:mid ")
	List<Review> findByMovie(int mid);

}
