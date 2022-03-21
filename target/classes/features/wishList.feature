Feature: Wishlist features
Acceptance Criteria:
  GIVEN I add four different products to my wish list
  WHEN I view my wishlist table
  THEN I find total four selected items in my Wishlist
  WHEN I search for lowest price product
  AND I am able to add the lowest price item to my cart
  THEN I am able to verify the item in my cart

  Background: user lands to homepage
    Given user land to the homePage

  Scenario: User should be able to see wishlist items sorted low to high and add to mycart

    Given I add four different products to my wish list
    When I view my wishlist table
    Then I find total four selected items in my Wishlist
    When I search for lowest price product
    And I am able to add the lowest price item to my cart
    Then I am able to verify the item in my cart