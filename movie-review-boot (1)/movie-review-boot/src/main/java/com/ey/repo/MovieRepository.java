package com.ey.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ey.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
