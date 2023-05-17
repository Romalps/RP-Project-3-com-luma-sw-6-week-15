Feature: Gear Test
  As a user I want to add product to shopping cart on Luma website
  @smoke @regression
Scenario: user should add product successfully to Shopping cart
  Given I am On Homepage
  When I mouse hover on Gear menu
  And I click on Bags
  And I click on product name Overnight Duffle
  And verify the Overnight duffle text "Overnight Duffle"
  And I change Qty 3
  And I click on Add to cart button on overnight duffle
  And verify the product added to shopping cart text "You added Overnight Duffle to your shopping cart"
  And click on Shopping cart link into message
  And verify the Cronus Yoga Pant product name "Cronus Yoga Pant"
  And verify the Qty is "3"
  And verify the product price "$135.00"
  And I change Qty to "5"
  And I click on "Update Shopping Cart" button
  Then verify the product price change "$225.00"