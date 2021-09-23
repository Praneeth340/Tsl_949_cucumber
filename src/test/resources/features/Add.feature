Feature: Addition

  Scenario: Addition of two number
  Given I have two numbers as "10"  &"12"
  When  I do addition
  Then Result should display in console
  
  
  Scenario: Addition of two number with List
  Given I have two numbers as below list
  |7|
  |8|
  When  I do addition
  Then Result should display in console
  
   Scenario: Addition of two number with Map
  Given I have two numbers as below Map
      |num1 |4|
      |num2 |6|
  When  I do addition
  Then Result should display in console