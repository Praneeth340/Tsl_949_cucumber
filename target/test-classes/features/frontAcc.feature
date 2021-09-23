Feature: login Functionality


   Scenario Outline: To do data driven testing on Login Functionality 
    Given User is on Login Page
    When user enters username as "<userName>" & password as "<passWord>" & clicks on login 
    Then login "<loginType>" be happen

    Examples:

     | userName | passWord | loginType |
     | demouser | password | should    |
     | password | admin123 | shouldNot |
     | hr       | hr123    | shouldNot |
     | demo     | demo123  | shouldNot |
  

