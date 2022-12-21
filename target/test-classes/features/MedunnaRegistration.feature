Feature: Register

  Background: login to website

    @register
    Scenario: user creates new record
      Given user goes to url
      And clicks the register button
      And user waits 2 seconds 
      And user enters 9 digit SSN with "-" after 3rd and 5th digits in SSN
      And user waits 2 seconds
      Then user sees SSN box is blue
      And user close the page
