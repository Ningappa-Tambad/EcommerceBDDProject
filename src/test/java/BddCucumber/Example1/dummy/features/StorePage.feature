@featuretag
Feature: Add to Cart Functionality


    @scenario1
  Scenario Outline: Add product from store to cart
   Given I am on the stores page
    When I add "<Product name>" to the cart
    #Then I see 1 "Blue Shoes" in the cart

  Examples:
    | Product name  |
    | Blue Shoes   |
    | Red Shirt    |
    | Black Hat    |





