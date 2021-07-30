Feature: Register new user

  Scenario: User is succesfully registered
    Given I am on the authentication page
    When I provide email with valid credentials
    Then I click on the create account button
    And I fill the registration form
    Then I click on the register button