@regression
Feature: Magento Test
  Scenario: Filter products and perform checkout
    Given User navigate to Magento test website
    And User access the shop
    When User filter for a certain category
    And User open the product page
    Then User should be able to add multiple product quantities to cart
    And User should be able to perform a checkout