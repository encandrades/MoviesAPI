package com.movies.service;

import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.movies.maps.Movie;

public class MoviesAPIService {

	protected String urlMovie;
	
	public MoviesAPIService(String urlMovie) {
		this.urlMovie = urlMovie;
	}

	public Movie readFromUrl(Map<String, String> params) {

		return new RestTemplate().getForObject(urlMovie, Movie.class, params);

	}
}