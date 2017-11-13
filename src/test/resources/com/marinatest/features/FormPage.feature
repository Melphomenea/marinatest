Feature: FormPage

#REQ-UI-01 - The Title should be "UI Testing Site" on every site
  Scenario: Page title should be "UI Testing Site" on every page
    Given I am on the form page
    Then The page title on the FormPage should be "UI Testing Site"

#REQ-UI-02 - The Company Logo should be visible on every site
  Scenario: The company logo should be visible on every site
    Given I am on the form page
    Then The company logo should be visible on the FormPage

#REQ-UI-11 - On the Form page, a form should be visible with one input box and one submit button
  Scenario: Form should be visible with one input box and one submit button
    Given I am on the form page
    Then A form should be visible
    And Input box should be visible
    And Submit button should be visible

#REQ-UI-12 - Value and result - Form submission
  Scenario Outline: Form submission
    Given I am on the form page
    And I type "<value>" in the form input field
    And I click Submit button
    Then The text "<result>" should appear on the Hello page

Examples:
    | value   | result        |
    | John    | Hello John!   |
    | Sophia  | Hello Sophia! |
    | Charlie | Hello Charlie!|
    | Emily   | Hello Emily!  |



