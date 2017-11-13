Feature: Landing Page

#REQ-UI-01 (M) - The Title should be "UI Testing Site" on every site
  Scenario: Page title should be "UI Testing Site" on every page
    Given I open the landing page
    Then The page title should be "UI Testing Site"

#REQ-UI-02 (M) - The Company Logo should be visible on every site
  Scenario: The company logo should be visible on every site
    Given I open the landing page
    Then The company logo should be visible

#REQ-UI-09 (L) - The following text should be visible on the Home page in <h1> tag: "Welcome to the Docler Holding QA Department"
  Scenario: Homepage h1 text should contain welcome sentence
    Given I open the landing page
    Then The H1 text should contain welcome sentence

#REQ-UI-10 (L) - The following text should be visible on the Home page in <p> tag: "This site is dedicated to perform some exercises and demonstrate automated web testing."
  Scenario: Homepage paragraph should contain the test demonstration text
    Given I open the landing page
    Then The paragraph should contain the testing text


