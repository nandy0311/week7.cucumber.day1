Feature: Leaftaps Login functionality
Background:
Given Open Chromebrowser
And Enter the url

Scenario Outline: Launch leaftaps application for edit lead flow
Given Enter the username <username>
And Enter the passoword <password>
And Click on Login button
When Run editleadmethod
Then EditLead completed successfully
Examples:
|username|password|
|'DemoCSR'|'crmsfa'|
