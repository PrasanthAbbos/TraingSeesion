Feature: Login Feature
	verify the login 

Scenario Outline: Verify user to login
Given Launch the url
When Go to the login page
And Enter the username as "<username>" and password as "<password>"
Then Verify successful login

Examples:
|username|password|
|blog.cucumber@gmail.com|Cucumber@blog|
