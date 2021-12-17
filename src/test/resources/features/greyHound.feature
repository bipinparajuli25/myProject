@smokeTest @regression
Feature: greyhounds book a trip feature

  @smokeTest
  Scenario Outline: book a trip scenario
    Given I launch the grehound website
    And I fill the reservation details "<from>" , "<to>", "<startDate>" , "<returnDate>" and "<passengerCount>"
    When I click on search button
    Then verify the list of busses available

    Examples:
    |from        |to         |startDate   |returnDate  |passengerCount| expected |
    |chicago     |Dallas     |12/15/2021  |01/15/2022  |2             | result should match for search |
#    |columbus    |log angles |12/15/2021  |01/15/2022  |2             | result should match for search |

#  Scenario: explore places scenario
#    Given I launch the grehound website
#    And I click on expore places
#    When I click on travel stories link
#    Then verify the verify the content
#
