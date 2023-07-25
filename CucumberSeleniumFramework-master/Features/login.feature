
Feature: Login with valid user

  Scenario: Free CRM Login Test Scenario

    Given user is already on Login Page
    When title of login page is Free CRM
    Then user enters username and password
      | username | password|
      | standard_user | secret_sauce@123 |
    Then user clicks on login button
    Then User land on the homepage
    Then Close the browser


