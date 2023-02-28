@smoke
Feature: F03_currencies | users could choose currencies from dropdown list

  Scenario: User could choose Euro currency from dropdown list
    When User chooses Euro currency
    Then verify that the euro currency was appeared