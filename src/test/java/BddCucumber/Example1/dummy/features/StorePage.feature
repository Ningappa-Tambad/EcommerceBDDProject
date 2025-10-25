@featuretag
Feature: Add to Cart Functionality



  @scenario1
  Scenario: Add product from store to cart
   Given I am on the stores page
    When I add "Blue Shoes" to the cart
    Then I see 1 "Blue Shoes" in the cart



