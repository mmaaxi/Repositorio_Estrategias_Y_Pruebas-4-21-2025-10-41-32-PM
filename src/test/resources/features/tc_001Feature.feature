Feature: Verify GitHub repository creation

  Scenario: Create a new repository on GitHub
    Given I am logged into GitHub
    When I create a new repository with name "TestRepo"
    Then I should see the repository created successfully and retrieve the URL