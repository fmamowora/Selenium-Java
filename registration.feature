Feature:Registration
  As s user of Giftrete, l want to register so l can use site

  Background:
  Given l navigate to dev.giftrt.com
    When l go to the registraton link


  Scenario: Valid Registration
    And l fill in all registration data
    Then l should be registered

  Scenario: Invalid Registration
    And l fill in all registration data
    And confirm with invalid password
    Then l should not registered