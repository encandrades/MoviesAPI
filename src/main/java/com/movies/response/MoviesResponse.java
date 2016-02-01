package com.movies.response;

import com.movies.maps.Movie;


public class MoviesResponse extends Response {

	private Movie movieRes;
	
	public MoviesResponse(){}
	
	public MoviesResponse(Boolean success, Movie movieRes){
		this.success = success;
		this.movieRes = movieRes;				
	}

	public Movie getMovieRes() {
		return movieRes;
	}

	public void setMovieRes(Movie movieRes) {
		this.movieRes = movieRes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((movieRes == null) ? 0 : movieRes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MoviesResponse other = (MoviesResponse) obj;
		if (movieRes == null) {
			if (other.movieRes != null)
				return false;
		} else if (success == null){
			if(other.movieRes != null)
				return false;
		} else if (!movieRes.equals(other.movieRes))
			return false;
		  else if (!success.equals(other.success))
			return false;
		return true;
	}
	
	
}

