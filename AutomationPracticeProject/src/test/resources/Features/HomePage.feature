Feature: Home Page
  In order to further utilize the website
  I will first need to validate each elements on its home page

  Scenario: Call Us Now, Women Dresses T-shirts tabs, Popular Best Sellers tabs, and Follow Us section
    Given I navigate to Automation Practice website
    When I scroll around the home page
    Then I will see the Call Us Now number
    And I will see the three main tabs for Women, Dresses and T-shirts
    And I will see another two main tabs for Popular and Best Sellers
    And I will see the Follow Us section which redirects to their Social Media pages

  Scenario: Women tab mouse over validation
    Given I navigate to Automation Practice website
    When I hover to Woman tab
    Then I will see the Tops and Dresses category

  Scenario: Women tab page
    Given I navigate to Automation Practice website
    When I click the Woman tab
    Then I will be redirected to Women tab page

  Scenario: Dresses tab mouse over validation
    Given I navigate to Automation Practice website
    When I hover to Dresses tab
    Then I will see the Casual, Evening, and Summer Dresses category

  Scenario: Dresses tab page
    Given I navigate to Automation Practice website
    When I click the Dresses tab
    Then I will be redirected to Dresses tab page

  Scenario: T-shirts tab page
    Given I navigate to Automation Practice website
    When I click the T-shirts tab
    Then I will be redirected to T-shirts tab page

  Scenario: Contact Us button validation
    Given I navigate to Automation Practice website
    When I click Contact Us button
    Then I will navigate to Contact Us Page

  Scenario: Send a message from Contact Us page
    Given I navigate to Automation Practice website
    And I click Contact Us button
    And I fill all the empty fields in the Send a Message section
    When I click Send button
    Then There will be green successful message

  Scenario: Sign In button validation
    Given I navigate to Automation Practice website
    When I click the Sign In button
    Then I will navigate to Sign In page

  Scenario: Specials validation
    Given I navigate to Automation Practice website
    When I click Specials on its Information section
    Then I will navigate to Specials page

  Scenario: New Products validation
    Given I navigate to Automation Practice website
    When I click New Products on its Information section
    Then I will navigate to New Products page

  Scenario: Best Sellers validation
    Given I navigate to Automation Practice website
    When I click Best Sellers on its Information section
    Then I will navigate to Best Sellers page

  Scenario: Our Stores validation
    Given I navigate to Automation Practice website
    When I click Our Stores on its Information section
    Then I will navigate to Our Stores page

  Scenario: Terms and Conditions of Use validation
    Given I navigate to Automation Practice website
    When I click Terms and Conditions of Use on its Information section
    Then I will navigate to Terms and Conditions of Use page

  Scenario: About Us validation
    Given I navigate to Automation Practice website
    When I click About Us on its Information section
    Then I will navigate to About Us page
