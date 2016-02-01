package com.movies.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movies.maps.Movie;
import com.movies.response.MoviesResponse;
import com.movies.response.Response;
import com.movies.service.MoviesAPIService;

@RestController
public class MoviesController {

	@Autowired
	private MoviesAPIService moviesAPIService;

	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	public Response movie(@RequestParam(value = "title") String title) {

		Map<String, String> params = new HashMap<String, String>();
		params.put("title", title);
		Movie json = moviesAPIService.readFromUrl(params);

		return new MoviesResponse(true, json);
	}
}
