Feature: Men test
  As User I want to add products to shopping cart on Luma website
  @sanity @regression
  Scenario: User should add product successfully to shopping cart
    Given I am On Homepage
    When I mouse hover on Men menu
    And I moose hover on Bottoms
    And I click on Pants
    And I mouse hover on Product name Cronus Yoga pant
    And I click on size 32
    And I mouse hover on Product name Cronus Yoga pant
    And I click on colour Black
    And I mouse hover on Product name Cronus Yoga pant
    And I click on Add to Cart button
    And verify the text "You added Cronus Yoga Pant to your shopping cart."
    And I click on Shopping Cart Link into message
    And verify the text on "Shopping Cart"
    And Verify the product name "Cronus Yoga Pant"
    And verify the product size "32"
    Then verify the product colour "Black"