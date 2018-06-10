
Implementation of 2 RESTful API for Hokenso Cardio Challenge Search 

Implementation Approach and Design Considerations:

This RESTful API implementation of the Hokenso Cardio Challenge Search uses Spring 4.2.0 for ease of development.
The API is developed using Eclipse IDE and built with Maven and tested locally using Tomcat v8.0
This is an implementation of a RESTful API that returns responses in JSON format.

Using either one of the URLs below: 
1.) http://localhost:8080/SimpleChallengeService/name/{name}
2.) http://localhost:8080/SimpleChallengeService/level/{level}

calls the ChallengeRestController and returns a status code 200 and the challenge or list of challenges searched.
When there is no challenge found using the name or level filters, a status code 204 or HttpStatus.NO_CONTENT is returned.
The CardioChallengeRestTestClient test class runs several search cases. The result is recorded in the file - UnitTestingResult.txt

You can test the program by copying the war file - SimpleChallengeService.war into your webapps directory of your local 
working Tomcat base directory. Run the tomcat startup.sh script in your terminal and start accessing the service URLS.