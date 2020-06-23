# new feature
# Tags: optional

Feature: Sign up user to browser stack
@smokeTest
  Scenario Outline: Sign up
    Given User navigate to browserstack page
    When  click on Getfreebutton
    And I enter the user details "<Fullname>""<Email>""<Password>" and click on signup
    Then user is registered

    Examples:
      |Fullname|Email|Password|
      |Fenley33|jyothsnaimmanni13@gmail.com|Tanngocool@12|

