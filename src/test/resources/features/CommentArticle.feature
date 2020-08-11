@comment @smoke
Feature:Comment the article

  Scenario:User can comment for article
    Given user is on the login page logs in given username and password
    When user signInWithEmail
    When user click NewPost
    When user Publish Article
    When user write a comment
    Then user see the comment
