
Feature:  Search the Products

  @smoke
  Scenario: Simple Search in Main page of Amazon
    When User Searched the Product "Mobile"
    Then Search Results will be displayed
  @e2e
  Scenario: To Select the items from All Category
    Given User Selected the value in All Categories as "Deals"
    When User Searched the Product "mobile"
    Then Search Results will be displayed