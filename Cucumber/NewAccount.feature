Feature: Create an account on Amazon.com
Scenario: Sucessfully create an account
Given I am on Amazon Web Page
When I click sign in button
And I click on Create your Amazon Account Button
And I enter Full name
And I enter Email
And I enter Password
And I reenter Password
And I click on Create your Amazon account button
Then I find a message that says your Amazon account is created successfully.
