@login
Feature:User can login given credentials
  @smoke
  Scenario:User can login given username and password
    Given user is on the login page logs in given username and password
    Then user see title BBlog

  Scenario:User can sign in username and password
    Given user is on the login page logs in given username and password
    When user sign in
    Then user able to sign in
#this scenario fail do to username box did not accept username
#but except email
  Scenario Outline:User can see error message username and password
    Given user is on the login page logs in given username and password
    When user sign in with wrong credientials "<username>" and "<password>"
    Then user able to see error message
    Examples:
      | username          | password           |
      | werem123          | 21neden123         |
      | asdfre123         | nergcsdnkjhgghj123 |
      |                   |                    |
      | gkjhhgg@gmail.com | HJKI*&HNB          |

#  Scenario:User see error message when use wrong credentilas
#    Given user is on the login page logs in wrong username and password
#    Then user see error mesage
