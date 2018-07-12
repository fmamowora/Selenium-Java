Feature:Wishlist
  As a user of Giftrete, l want to create a Wishlist on site

  Scenario: Create Wishlist
    Given l am logged on to dev.giftrt.com
    When  l click on wishlist link
    And l click on create a wishlist button
    And l fill in all wishlist data
    Then l should have created a wishlist

