# Cucumber-Framework
Test Automation Framework (Java + Selenium + Cucumber + TestNG)

A robust and scalable BDD (Behavior Driven Development) automation
framework designed using Java, Selenium WebDriver, Cucumber, and TestNG.

------------------------------------------------------------------------

Tech Stack - Language: Java - UI Automation: Selenium WebDriver - BDD:
Cucumber (Gherkin) - Test Runner: TestNG - Build Tool: Maven -
Reporting: Extent Reports / Cucumber Reports - Version Control: Git

------------------------------------------------------------------------

Features - BDD framework using Gherkin syntax - Page Object Model
(POM) - TestNG integration - Tag-based execution - Parallel execution
support - Config-driven setup - Reusable utilities - Detailed reporting

------------------------------------------------------------------------

Project Structure

project-root |– src/test/java | |– stepdefinitions | |– runners | |–
hooks | |– pages | |– utils | |– src/test/resources | |– features | |–
config | |– testdata | |– testng.xml |– pom.xml |– README.md

------------------------------------------------------------------------

How to Run Tests

Run all tests: mvn clean test

Run by tag: mvn clean test -Dcucumber.filter.tags=“@Smoke”

Run via TestNG: Use testng.xml

------------------------------------------------------------------------

Sample Feature

Feature: Login Functionality

Scenario: Successful Login Given User is on login page When User enters
valid credentials Then User should be logged in successfully

------------------------------------------------------------------------

Reporting

Reports generated in: /target/

Includes: - Cucumber Reports - Extent Reports - Screenshots

------------------------------------------------------------------------

Configuration

config.properties

Example: baseUrl=https://example.com browser=chrome implicitWait=10

------------------------------------------------------------------------

Author Ashay Zemse Senior SDET

