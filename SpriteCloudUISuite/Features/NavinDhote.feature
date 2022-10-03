Feature: Login
Background: setup
Given first user launch the browser
And enduser launch portal "http://www.uitestingplayground.com/"

@UITestRun
Scenario: Verification of Text Input field
#Given first user launch the browser
#And enduser launch portal "http://www.uitestingplayground.com/"
When enduser click on "Text Input" link
And click on on the textbox and insert text as "ABC"
And click on the button
Then Verify the provide test in textbox and the name of button is same

@UITestRun
Scenario: Verification of Sample App field
#Given first user launch the browser
#And enduser launch portal "http://www.uitestingplayground.com/"
When enduser click on "Sample App" link
And User enter the userID as "ABC"
And User enter the password as "pwd"
Then click on the login button


@UITestRun
Scenario: Verification of Click field
#Given first user launch the browser
#And enduser launch portal "http://www.uitestingplayground.com/"
When enduser click on "Click" link
Then click on button

@UITestRun
Scenario: Verification of Load Delay field
#Given first user launch the browser
#And enduser launch portal "http://www.uitestingplayground.com/"
When enduser click on "Load Delay" link
And wait until the button get visible and click on it

@UITestRun
Scenario: Verification of Mouse Over field
#Given first user launch the browser
#And enduser launch portal "http://www.uitestingplayground.com/"
When enduser click on "Mouse Over" link
Then make the 2 click on the provided link and check the click count



Scenario: Verification of Visibility field
#Given first user launch the browser
#And enduser launch portal "http://www.uitestingplayground.com/"
When enduser click on "Visibility" link
Then click on the hide button
And check the visibility of other elements

@UITestRun
Scenario: Verification of Scrollbars field
#Given first user launch the browser
#And enduser launch portal "http://www.uitestingplayground.com/"
When enduser click on "Scrollbars" link
Then scroll to the button
And click the scrolling button



