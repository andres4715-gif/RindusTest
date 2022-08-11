#Author: andres4715@gmail.com
#Date: 10/08/2022
#Description: rindus mobile practice.

Feature: Tap on an element

  @appium
  Scenario: Check if is possible to tap over an element
    Given the user opens the rindus test app
    When the user taps over the first user
    Then the user can see the user details page
    And he can see his name

