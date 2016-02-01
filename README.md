# MoviesAPI

Example creating an API using Spring Boot and Spring Security. This API returns a film given the title.

##Authentication

This application provides a simple authentication using Spring Security WebSecurityConfigurerAdapter class. There are two hardcoded users with differents roles each one. At the moment, both roles have the same privileges.

    ROLE USER:
    username: user
    password: user
    
    ROLE ADMIN:
    username: admin
    password: admin
    
##Using example

  - Url request example:
  
  http://localhost:8080/movies?title=Love Actually
  
  - Response for the above request:
  
{"Title":"Love Actually","Year":"2003","Genre":"Comedy, Drama, Romance","Director":"Richard Curtis","Actors":"Bill Nighy, Gregor Fisher, Rory MacGregor, Colin Firth","Country":"UK, USA, France","Awards":"Nominated for 2 Golden Globes. Another 10 wins & 24 nominations.","Poster":"http://ia.media-imdb.com/images/M/MV5BMTY4NjQ5NDc0Nl5BMl5BanBnXkFtZTYwNjk5NDM3._V1_SX300.jpg","Metascore":"55","imdbRating":"7.7","imdbVotes":"306,036","imdbID":"tt0314331","Type":"movie","Response":"True"}
