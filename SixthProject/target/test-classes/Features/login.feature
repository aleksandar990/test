Feature: Login user

  Scenario: User is succesfully loged in with walid credentials
    Given I am on the aut page
    When I provide valid credentials
    And I click on the sign in button
    