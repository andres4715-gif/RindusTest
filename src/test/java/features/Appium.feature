#Author: andres4715@gmail.com
Feature: Tap on an element

  @appium
  Scenario: Check if is possible to tap over an element
    Given the user opens the rindus test app
    When the user taps over the first user
    Then the user can see the user details page
    And he can see his name

