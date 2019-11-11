# GitHubAPITest
GitHub API test using TestNG, Jackson Databind and Spring-Web frameworks.
## Prerequisites
* **JDK version >= 11.0.1**
* **Apache Maven version >= 3.6.0**
## Project structure
* [src/main/java/BaseUser.java](https://github.com/y-nochnyk/GitHubAPITest/blob/master/src/main/java/BaseUser.java) - detailed information about all the tests
* [src/test/java/GitHubUser.java](https://github.com/y-nochnyk/GitHubAPITest/blob/master/src/main/java/GitHubUser.java) - all the tests, which may be performed for each of three (Chrome, FireFox, Internet Explorer) browsers using TestNG
* [src/main/java/Endpoints.java](https://github.com/y-nochnyk/GitHubAPITest/blob/master/src/main/java/Endpoints.java) - the class describing all the elements of the website and the methods used for all the tests
* [src/main/resources/Info.txt](https://github.com/y-nochnyk/GitHubAPITest/blob/master/src/main/resources/Info.txt) - the class describing all the elements of the website and the methods used for all the tests
* [src/test/java/GitHubTest.java](https://github.com/y-nochnyk/GitHubAPITest/blob/master/src/test/java/GitHubTest.java) - the class describing all the elements of the website and the methods used for all the tests
## Run 
* **To run tests for Chrome:**
<br>Uncomment line 36 in the file BookingTest.java.
<br>Make sure lines 37 and 38 are commented. Then open terminal and use: 
```
mvn test
```
* **To run tests for Firefox:**
<br>Uncomment line 37 in the file BookingTest.java.
<br>Make sure lines 36 and 38 are commented. Then open terminal and use:
```
mvn test
```
* **To run tests for Internet Explorer:**
<br>Uncomment line 38 in the file BookingTest.java.
<br>Make sure lines 36 and 37 are commented. Then open terminal and use:
```
mvn test
```
