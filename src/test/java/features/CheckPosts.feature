#Author: andres4715@gmail.com
#Date: 10/08/2022
#Description: rindus mobile practice.

Feature: Checkig the comment post for a user

  @appium
  Scenario Outline: Navigate through the app to see the comment for a post
    Given the user opens the rindus test app
    When the user wants to see any post
    And he choose <post> of the list
    Then the user can see the comment post
    Examples:
      | post                                               |
      | voluptatem eligendi optio                          |
      | et ea vero quia laudantium autem                   |
      | in quibusdam tempore odit est dolorem              |
      | dolorum ut in voluptas mollitia et saepe quo animi |
