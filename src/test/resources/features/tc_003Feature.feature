Feature: Verify strategy matrix generation

  Scenario: Open Google Sheets with provided URL
    Given I open Google Sheets with the URL "https://docs.google.com/spreadsheets"
    Then Google Sheets should load with the expected information