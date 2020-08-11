@create @1 @smoke
Feature:Create article

  Scenario: Create article
    Given user is on the login page logs in given username and password
    When user signInWithEmail
    Then user click NewPost
    When user Publish Article
    Then user verify the title
