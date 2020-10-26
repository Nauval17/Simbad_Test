@Web
Feature: Visa

  Background:
    Given User open website "https://www.phptravels.net/"
    When User is at home page
    When User choose to login
    And User input credential "user@phptravels.com" "demouser"
    And User click login
    Then User is at home page

  @Visa_1
  Scenario Outline: Input Visa
    Given User is at home page
    When User input origin country "<origin>"
    And User input destination country "<destination>"
    And User input date "<date>"
    And User click submit
    Then User is at visa detail form page
    When User input name "<firstName>" "<lastName>"
    And User input email "<email>"
    And User input contact number "<phoneNumber>"
    And User submit data
    Then User see confirmation page
    When User go to invoice detail page
    And User see invoice detail
    Then User compare data "<firstName>" "<lastName>" "<phoneNumber>" "<origin>" "<destination>" "<date>"
    Examples:
      | origin    | destination | date       | firstName | lastName | email               | phoneNumber |
      | Indonesia | Australia   | 01-12-2020 | Demo      | User     | user@phptravels.com | 0812000000  |