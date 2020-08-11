@read
Feature:Read the article

  Scenario:User can Read article
    Given user is on the login page logs in given username and password
    When user signInWithEmail
    When user click user profile
    When user click read more
    Then user can read the article
#readmore didnot work
  @1 @smoke
  Scenario:User can Read article when click tags
    Given user is on the login page logs in given username and password
    When user signInWithEmail
    When user click tags
    When user click read more
    Then user can read the article