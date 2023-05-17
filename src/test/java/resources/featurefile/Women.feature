Feature: Women test
  As User I want to filter products on Luma website

  @sanity @regression
  Scenario: Verify the sort by product name filter
    Given I am On Homepage
    When I mouse hover on Women menu
    And I mouse hover on Tops
    And I click on Jackets
    And select Sort by filter Product Name
    Then verify the products name display in alphabetical order

  @smoke @regression
  Scenario: Verify the Sort By Price filter
    Given I am On Homepage
    When I mouse hover on Women menu
    And I mouse hover on Tops
    And I click on Jackets
    And I select Sort By filter Price
    Then verify the products price display in Low to High
