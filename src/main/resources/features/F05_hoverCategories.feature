@smoke
Feature: F03_hoverCategories | users could hover on main categories

  Scenario: User hovers on of three main categories
    When User selects random one of the three main categories and hover on it
    And User selects random one of the three sub categories and click on it
    And User gets text of the page title
    Then verify