#Author: your.email@your.domain.com

@tag
Feature: To Test Demo Functionality
  

  @tag1
  Scenario: Verify the login with valid credentials
    Given The user is in guru login page
    When The user enters valid username and submit
    And The user clicks the  submit button
    Then The user should be in managers home page

 @tag2
 Scenario: New Customer Information
 Given The user Select New Customer option
 When The user Should enters all manatory fields
 						|Customer name|Sathya|
 						|Gender|Female|
 						|D.O.B|12/04/1991|
 						|Address|Katpadi|
 						|City|Vellore|
 						|State|TN|
 						|Pin|632519|
 						|Telephono no|9597626749|
 						|E-mail|sathya@gmail.com|
 					
 	And The user click submit button
 	Then The user should be done Registeration successfully 					