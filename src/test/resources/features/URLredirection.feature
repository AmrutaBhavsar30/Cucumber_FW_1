@ui @healthcheck
@tag
Feature: URL redirection check
  
  
   @tag1
   Scenario: User is able to Open the browser, login to the URL and navigate to LandingPage url
    Given User login to base url
    And check the title of home page
    Then check user successfully navigate to LandingPage url
    
  

  
  
    
  