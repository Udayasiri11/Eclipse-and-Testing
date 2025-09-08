Feature: Product navigation on SauceDemo

  Scenario Outline: Click product and return to inventory page
    Given I am logged into SauceDemo as "standard_user" with password "secret_sauce"
    When I click on product "<product>"
    Then I should be on the product detail page for "<product>"
    When I click on the Back to products button
    Then I should be redirected to the inventory page

    Examples:
      | product                 |
      | Sauce Labs Backpack     |
      | Sauce Labs Bike Light   |
      | Sauce Labs Bolt T-Shirt |
