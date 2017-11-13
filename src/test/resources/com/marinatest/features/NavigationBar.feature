Feature: Navigation Bar testing

#REQ-UI-03 - When I click on the Home button, I should get navigated to the Home page
#REQ-UI-04 - When I click on the Home button, it should turn to active status
  Scenario: Navigate to Home Page
    Given I am on the form page
    And I click on the Homepage in the header
    Then I should navigate to Home Page
    And Homepage becomes active element

#REQ-UI-05 - When I click on the Form button, I should get navigated to the Form page
#REQ-UI-06 - When I click on the Form button, it should turn to active status
    Scenario: Navigate to Form Page
      Given I open the landing page
      When I click the Form button in the header
      Then I should navigate to the Form Page
      And Form Page becomes active element

#REQ-UI-07 - When I click on the Error button, I should get a 404 HTTP response code
    Scenario: Navigate to 404
      Given I open the landing page
      When I click the Error button in the header
      Then I should navigate to Error Page
      #And I should get 404 response code - WebDriver does not handle response codes, it needs to be parsed

#REQ-UI-08 - When I click on the UI Testing button, I should get navigated to the Home page
    Scenario: Click UI Testing button and navigate to Home Page
      Given I am on the form page
      And I click the UI Testing Button in the Navbar
      Then I should navigate to Home Page
