@smoke
Feature: F06_followUs | users could open followUs links

  Scenario: user opens facebook link
    When user opens facebook link
    Then "https://www.facebook.com/nopCommerce" is opened in new tab


  Scenario: user opens twitter link
  When user opens twitter link
  Then "https://twitter.com/nopCommerce" is opened in new tab2
