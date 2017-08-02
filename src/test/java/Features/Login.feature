Feature: LoginFeature
  This Login feature deals with the Login feature of Application

  Scenario: Login with correct username and password
    Given I Navigate to the login page of the application
    And I enter the username as "admin" and password as "adminpassword"
    And I Click login button
    Then I Should see the home page


  Scenario: I want to test google.com
    Given I Navigate to the login page of the application
