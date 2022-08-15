#Author: andres4715@gmail.com
#Date: 10/08/2022
#Description: rindus mobile practice.

Feature: Add and delete an element

  Background: User wants to add a new task
    Given the user opens the rindus test app
    When the user taps over an user
    And he adds a new task to do

  #Add and delete task e2e flow
  @appium
  Scenario: Navigate through the app adding a new task and delete it
    Then the user can see the the new task added
    And he can delete the new task added
    And he return to the Users Page

    #Tap on an element, Confirm elements are present, Checkmark an element
  @appium
  Scenario: Navigate through the app clicking on the see more and returning to the home page
    Then he return to the Users Page

        #Uncheck task selected by default
  @appium
  Scenario: Navigate through the app clicking on the see more and unselecting the default values
    Then he unselect a default value

