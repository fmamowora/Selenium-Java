Feature:Login
  In order to perform an operation on site l need to logon

  Background:
    Given I navigate to dev.giftrt.com website
    When I click on Login link
    
  @valid  @smoke
  Scenario: Login with valid details
    And I enter email address
    And I enter the password
    And I click on Secure Sign In button
    Then I should be logged on


  @invalid  @regression
  Scenario: Login with invalid username
    And I enter invalid email address
    And I enter the password
    And I click on Secure Sign In button
    Then I should not be logged on

@invalid
  Scenario:Login with invalid password
    And I enter email address
    And I enter the invalid password
    And I click on Secure Sign In button
    Then I should not be logged on

@valid
  Scenario:valid login with parameters
    And I enter email address "fmamowora@hotmail.com"
    And I enter the password "ayodeji0607"
    And I click on Secure Sign In button
    Then I should be logged on



  Scenario:invalid login with parameters
    And I enter email address "fmamowora@hotmail.com"
    And I enter the invalid password "ayodeji0608"
    And I click on Secure Sign In button
    Then I should not be logged on


  Scenario Outline:login with multiple users
    And I enter username "<username>"
    And I enter password "<password>"
    And I click on Secure Sign In button
    Then I should be logged on
    And I log out

    Examples:

    |username|password|
    |fmamowora@hotmail.com|ayodeji0607|
    |fmamowora@gmail.com|ayodeji0607|
    