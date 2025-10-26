#
#Feature: Place an order1
#
#
#  @scenario5
#  Scenario:using default payment option
#    Given I am guest customer
#    And Add my billing details are
#      | firstname  | lastname    | country              | address       | city     | state      | zip_code | phone      | email             |
#      | John       | Doe         | United States (US)   | 123 Main St   | New York | California | 10001    | 1234567890 | guest1@gmail.com  |
#    And I'm on the checkout page
#    When I provide billing details
#    And I place an order
#    Then I see order confirmation message
