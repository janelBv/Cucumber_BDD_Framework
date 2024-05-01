Cucumber BDD Framework from Scratch

Title: Automated Test for Magento Shopping Website

This repository contains the test suite implemented using Java, Cucumber, and Selenium WebDriver to automate testing of the Magento web application based on specific steps provided for the Heartland Retail and Heartland Restaurant interview process.

Stack & Frameworks Used:
Java - Programming language
Cucumber - BDD framework
Selenium WebDriver - Automation tool for web applications

Problem Statement:
The task involves automating the following steps on the Magento web application:
Access the Magento application at https://magento.softwaretestingboard.com/.
Navigate to the Shop section.
Filter products by a specific category (e.g., JavaScript).
Open a product page.
Add multiple quantities of the product to the cart.
Perform a checkout process.

Prerequisites:
Ensure Java is installed on your machine.
Set up Maven for managing project dependencies.
Install dependencies: mvn clean install.

Running the Test:
Compile the project: mvn compile
Run the test: mvn test

How to Run:
Clone this repository to your local machine.
Navigate to the project directory.
Install project dependencies using Maven.
Run the test suite.

Points of Evaluation:
Code Execution: Ensure that the test cases run successfully without errors.
Code Structure and Organization: Maintain clean and modular code structure.
Code Style: The code follows standard naming conventions and formatting practices, with clear and concise names for classes, methods, and variables.
Documentation: Javadoc comments have been used to provide documentation for classes, methods, and fields.
Self-descriptive Code: The code is written in a way that is easy to understand without excessive comments.
Assertions: Assertions are included at appropriate places to verify the behavior of the application under test.Implement assertions to validate test outcomes.

Artifacts:
Test cases implemented using Cucumber feature files (src/test/resources/features).
Step definitions written in Java (src/test/java/steps).
Selenium WebDriver configurations and utility classes (src/test/java/utils).
Test execution reports and logs generated during Maven build.

Project Structure:
The project follows a well-organized structure:
src/test/java: Contains the test code.
stepDefinitions: Contains the Cucumber step definitions.
pages: Contains the Page Object classes.
runners: Contains the test runner class.
Utils: to store "Reusable" methods in a specific class (BrowserUtils)
Screenshot: If test fails, it will take a screenshot.
src/test/resources: Contains the Cucumber feature file.
target/cucumber-reports: Contains the generated Cucumber reports after running the test.
Configuration properties: to hide sensitive data, securirity

==========================================================================================
About my Framework: 
My current framework is Page Object Model Cucumber (BDD) Framework. 
Main programming language is Java and I use IntelliJ IDE in my company. 
Our framework uses Selenium WebDriver for browser automation, Maven for dependencies, JUnit for Assertions and Jenkins for CI/CD.
My framework consists of 4 main packages.

First is the PAGES package. We use a POM Structure to keep my code organized, easy to maintain and clean. So, we basically created a separate Java class for each page of my application where we store all the WebElements and related Methods. 

Second is the RUNNERS package. Here I store my RUNNER class that I execute all my test cases from with DryRun annotations. DryRun is very useful to save time for getting Snips. It will give you snips without executing the steps which is so fast.
We have some components that: @RunWith will run the cucumber classes and @CucumberOptions is special annotation which has some keywords. For example, plugins It is all about failed Tests run and report creation. With help of this class, I can run my failed tests. tags="@regression" It is all about filtration your test cases.

Third is the STEP_DEFINITIONS package. Here I keep My implemented step definitions. Also, I store my HOOK CLASS where I have Before and After methods that setup my test data and tearDown activities, like clearing a database or closing browser sessions. 

Fourth is the UTILS package. Here I stored my BrowserUtils class.  In my framework I have ConfigReaderClass to protect and hide my private/personal data in a configuration.properties file, where I store data as “Key and Value”.

I have my DriverHelper class to centralize my driver. With help of this class, we are using Private Constructor for Singleton Pattern Design, which ensures only one driver instance of the entire project.

I have a RESOURCES directory where I created Cucumber Feature Files which use GHERKIN language to describe my Test Scenarios. My framework supports Data Driven Testing by using Scenario Outlines. We are also using Excel by using the Apache POI Libraries.

My framework generates HTML reports with Screenshots using the Maven-Cucumber-Report Plugin. Screenshots are important, because sometimes your failures do not mean there is a bug. This failure can be caused by Environment (QA), SERVERS. Environment/ Servers might be down or there might be glitch on the website. Screenshot can help first analyze, before you go deep (Save time).
Our framework Performed RESTAPI Testing by using REST Assured Library. Also, we perform Database testing through JDBC driver. For repositories we are using GitHub.
