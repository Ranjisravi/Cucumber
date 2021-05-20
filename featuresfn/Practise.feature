Feature: In order to test the home page of the application as a registered user  
  I want to specify the features of the home page.  
  
  Background: Flow till home page  
   Given user on application landing page  
   When user enter username  
   And user enter password  
   And user click on login button  
   Then user navigates to application home page.  
  
  Scenario: Home page default contents  
   Then user validate contents of home page  
  