@delete
Feature:Delete article

  Scenario: Delete article
    Given user is on the login page logs in given username and password
    When user signInWithEmail
    Then user click NewPost
    And user Publish Article
    When user delete article
    Then user see "No articles are here... yet."
