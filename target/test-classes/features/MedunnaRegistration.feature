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
      And user enters first name, last name, user name and e-mail address
      And The user enters a strong 7-character password consisting of at least 1 lowercase, 1 uppercase letter, at least 1 character and 1 number
      And user close the page
