#Author: andres4715@gmail.com
#Date: 10/08/2022
#Description: rindus mobile practice.

Feature: Add and delete an element

  @appium
  Scenario: Navigate through the app adding a new task and delete it
    Given the user opens the rindus test app
    When the user taps over a user
    And he adds a new task to do
    Then the user can see the the new task added
    And he can delete the new task added
    And he return to the Users Page

