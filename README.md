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
  
{"Title":"Love Actually","Year":"2003","Genre":"Comedy, Drama, Romance","Actors":"Bill Nighy, Gregor Fisher, Rory MacGregor, Colin Firth","Country":"UK, USA, France"}
