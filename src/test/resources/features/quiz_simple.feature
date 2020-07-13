Feature: Checking the home page of Quiz application

  Scenario: Check the available elements in Quiz Home Page
    Given I visit the kavin school quiz url "https://quiz.kavinschool.com"
    When I Select "C Sharp" from the dropdown
    Then I should see "C# and .Net Framework"
