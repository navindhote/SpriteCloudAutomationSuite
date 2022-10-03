# SpriteCloudAutomationSuite

                                                  *************** SpriteCloudUIAutomation Suite **************


***** Introduction *****


The application SpriteCloudUIAutomation for Web UI Testing has been implemented using Java + Cucumber Framework. The main purpose on introducing Cucumber Framework is because we have followed the BDD i.e. Behaviour Driven Development Methodology during the requirement, analysis and code implementation for the problem statement. 

Our Behaviour Driven Development Principle is based on 3 things :-
 
 - Given -> Prerequisite, Example - Opern Browser, url.
 - When -> What are you actually ging to perform ( click, enter text etc)
 - Then -> Verfication part after the action



***** Requirements *****


All the mentioned scenarios on the website application http://www.uitestingplayground.com/ must be tested thoroughly following all the UI Testing Automation standards and principles.

In the Web UI Testing Suite, we have implementation for below 6 different types of TEST:-

- Verification of Text Input field
- Verification of Sample App field
- Verification of Click field
- Verification of Load Delay field
- Verification of Mouse Over field
- Verification of Visibility field
- Verification of Scrollbars field




***** Installation *****



The project files and structure is located at the below repository :-

https://github.com/navindhote/SpriteCloudAutomationSuite

Take a fresh checkout of the project on the local machine and import it on Eclipse or any required IDE of your choice.



***** Configuration *****



Operating System - Windows
Java Version - 1.7 or higher
Maven - Any Configurations
IDE - Eclipse, Intellij, VS studio etc
Plugins - Cucumber plugin for Eclipse
Jenkins - For Build Deployment
GitHub - To host the repository for application



***** Troubleshooting *****



- Project Compilation and Build Error - Check for Java version 1.7

- Deployment Error on Jenkins - Please check the Console Logs for job.

- Not able to run the application - Install the Plugin for Cucumber.



***** Run the test Locally *****



Running the Test Locally - Run as JUnit Test Case

Kindly refresh the folder - /SpriteCloudUIAutomation/target/reports/

All the reports for Test Run are stored in below location :-

/SpriteCloudUIAutomation/target/reports/report.html
/SpriteCloudUIAutomation/target/reports/report.xml
/SpriteCloudUIAutomation/target/reports/report.json

Each time the Test Case is run the new report gets generated.



***** Run the Test in CICD pipeline *****

- Open your terminal in your VM. Start Jenkins and Docker using the commands “systemctl start jenkins“, “systemctl enable jenkins“, “systemctl start docker“.

- Open your Jenkins on your specified port 8282. Click on New Item to create a Job.

- It will get the code which is already pulled and then it uses maven to install the package. So, it simply installs the dependencies and compiles the application.

- Create the new Job by clicking on New Item ""Build Job".

- Select freestyle project and provide the item name and click on OK.

- Select Source Code Management and provide the Git repository - https://github.com/navindhote/SpriteCloudAutomationSuite.git. Click on Apply and Save button.

- Then click on Build->Select Execute Shell. 

- Provide the shell commands. Here it will start the integration phase and build the Docker Container.

- Select Build Pipeline View and provide the view name - "CICD for Automation".

- Select the initial Job "Build Job" and click on OK.

- Click on Run button to start the the CI CD process.

- After successful build open chrome and hit the url - file:///C:/Study/Study_Workspace/SpriteCloudUIAutomation/target/cucumber-reports/report.html. It will run the application. 

NOTE - The URL path is the Path to your reports file - file:///C:/Study/Study_Workspace/SpriteCloudUIAutomation/ varies from machine to machine and location selection. Should be modified accordingly.




***** results in Calliope.pro *****

Pet Store Corporation Company - https://app.calliope.pro/companies/1455

Company - Pet Store Corporation
Project - Pet Store API and UI Automation

Test Report 

- https://app.calliope.pro/reports/150019 
- https://app.calliope.pro/reports/150043



***** Describe one improvement point and one new feature for the Calliope.pro platform;

- Calliope must provide a Screen UI for End User where he is asked about UI Testing details as shown below :-

  - Website Address which he needs to test for UI Componenets
  - Perform the Testing Activity and Generate a Report
  - The report must be able to must be available to user for downloading in various formats such as HTML, JSON, XML, Excel, PDF etc.

- Apart from Current features, new features can be introduced like

  - Load Testing
  - Security Test Framwork
  - Disaster Recovery Test

- New approaches to be introduced apart from Reporting as well example - Notification and Meeting for group of people in the company or Group.


***** What could be the next steps to your project *****

- The next steps is to make project more interactive and dynamic in Such a way that the Suite can be re-used for different applications and components in various different Websites.

- The User Interface screen allowing the end user to Dynamically configure the Test cases and provide the Website and Components which he wishes to Test.

- Once the User provieds all Website and Test Data and Click Run method, it should run the entire Test Suite and Generate the Report.

- The Report must be available to user for downloading in various formats such as HTML, JSON, XML, Excel, PDF etc.

- A PDF File containing all the test cases and screenshots as well.

