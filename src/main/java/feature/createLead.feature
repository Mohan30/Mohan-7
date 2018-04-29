Feature: Create a Lead

@Smoke
Scenario Outline: Create a Lead positive


Given Enter the username as DemoCSR
And Enter the password as crmsfa
And Click Login
And Click CRMSFA
And Click Leads Link
And Click CreateLead Link
And Enter Company Name as <cName>
And Enter First Name as <fName>
And Enter Last Name as <lName>
When Click CreateLead Button
Then verify FirstName as <fName>

Examples:
|cName|fName|lName|
|amazon|mohan|N|
|cts|Ravi|k|



@Sanity
Scenario Outline: Create a Lead Negative

Given Enter the username as DemoCSR
And Enter the password as crmsfa
And Click Login
And Click CRMSFA
And Click Leads Link
And Click CreateLead Link
And Enter Company Name as <cName>
And Enter First Name as <fName>
And Enter Last Name as <lName>
When Click CreateLead Button
Then verify FirstName as sai

Examples:
|cName|fName|lName|
|tcs|kutra|s|