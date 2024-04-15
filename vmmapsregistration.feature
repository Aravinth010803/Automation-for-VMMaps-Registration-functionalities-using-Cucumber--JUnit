Feature: Validation of VMmaps Web aplication of Registration page

Scenario: Validation of VMmaps Registration valid details

Given user Launch the VMmaps web application 
When user click on Sign Up link
Then Sign Up page should be diaplayed
When user enter valid full name, valid Email Address,valid Mobile number, valid password and valid confirm password
And click on two cheak box and click on Register here link
Then user able two view the Email id page and enter valid OTP
Then user able to view the home page

Scenario: Validation of VMmaps Registration valid details

Given user Launch the VMmaps web application 
When user click on Sign Up link
Then Sign Up page should be diaplayed
When user enter valid full name, Invalid Email Address,valid Mobile number, valid password and valid confirm password
And click on two cheak box and click on Register here link
Then user able two view the Email id page 
Then user unable to getting for OTP