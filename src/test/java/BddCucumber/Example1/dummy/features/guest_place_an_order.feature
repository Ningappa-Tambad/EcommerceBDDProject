
Feature: Place an order


  @scenario2
  Scenario: Guest place an order using default payment option
   Given I am guest customer
    When I add "Blue Shoes" to the cart
    And I'm on the checkout page
   When I provide billing details
      | firstname  | lastname    | country              | address       | city     | state      | zip_code | phone      | email             |
      | John       | Doe         | United States (US)   | 123 Main St   | New York | California | 10001    | 1234567890 | guest1@gmail.com  |
  And I place an order
  Then I see order confirmation message
