Feature: SauceDemo Login

  Background:
    Given User is on Login page

  @UI
  Scenario: Verify login page loads successfully
    Then Login page title should be "Swag Labs"

  @UI
  Scenario: Verify Username and Password fields are displayed
    Then Username and Password fields should be visible

  @UI
  Scenario: Verify Login button is displayed and enabled
    Then Login button should be visible and enabled

  @Positive
  Scenario: Login with valid user (standard_user)
    When User enters "standard_user" and "secret_sauce"
    And Clicks login
    Then Inventory page should be displayed

  @Negative
  Scenario Outline: Invalid login attempts
    When User enters "<username>" and "<password>"
    And Clicks login
    Then Error message "<error>" should be shown

    Examples:
      | username        | password      | error                                                                |
      | locked_out_user | secret_sauce  | Epic sadface: Sorry, this user has been locked out.                  |
      |                 | secret_sauce  | Epic sadface: Username is required                                   |
      | standard_user   |               | Epic sadface: Password is required                                   |
      |                 |               | Epic sadface: Username is required                                   |
      | invalid_user    | invalid_pass  | Epic sadface: Username and password do not match any user in this service |

  @Negative
  Scenario: Login with problem_user
    When User enters "problem_user" and "secret_sauce"
    And Clicks login
    Then Inventory page should be displayed with broken images

  @Negative
  Scenario: Login with performance_glitch_user
    When User enters "performance_glitch_user" and "secret_sauce"
    And Clicks login
    Then Inventory page should load within 5 seconds

  @Negative
  Scenario: Verify error icon and close button
    When User enters "" and ""
    And Clicks login
    Then Error message "Epic sadface: Username is required" should be shown
   

  @Security
  Scenario: Verify session persists until logout
    When User enters "standard_user" and "secret_sauce"
    And Clicks login
    Then Inventory page should be displayed
   
    