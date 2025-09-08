Feature: Login and navigate to About page on SauceDemo

  Background:
    Given I am on the SauceDemo login page

  Scenario: Login and open About page
    When I login with username "<username>" and password "<password>"
    And I open the menu
    And I click on About
    Then I should be redirected to the About page
    And the About page title should contain "Sauce Labs"
    
    Examples:
            | username                | password     |
            |standard_user            | secret_sauce |
            |performance_glitch_user  | secret_sauce |