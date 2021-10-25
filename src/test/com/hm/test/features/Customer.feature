Feature: Customer Creation Feature
  This feature is responsible for customer creation in XYZ Bank

  Scenario: Check Adding Customer with Providing all the details
    And I Ensure application is opened successfully
    When I click on Bank Manager Login Button
    Then I click on Add Customer Button
    When I enter First_Name Last_Name And Post Code
      | First_Name | Last_Name | Post_Code |
      | Auto        |  User      |  400023   |
    And I click on Add Customer Button Below
#    Then I Should see the customer should not added
#    And I should see the tooltip for First Name


