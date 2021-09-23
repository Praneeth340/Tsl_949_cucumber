Feature: Download Page

Scenario: Verification of Download Page Link
  Given User is on Home Page of Selinium
  When user clicks on Download link
  Then title should be "Downloads | Selenium" 