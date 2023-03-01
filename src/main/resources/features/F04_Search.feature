@smoke

  Feature: F04_Search | User searches on products using product name and sku

    Scenario Outline: user could search using product name
      Given user go to home page
      When user enters <product name>
      And user clicks on search button
      Then searching By product name should be successful
      Examples:
      | product name |
      |     book     |
      |    laptop    |

    Scenario Outline: user could search using sku
      Given user go to home page
      When user enters <sku>
      And user clicks on search button
      Then searching By Sku should be successful
      Examples:
        |    sku    |
        | SCI_FAITH |
        | APPLE_CAM |