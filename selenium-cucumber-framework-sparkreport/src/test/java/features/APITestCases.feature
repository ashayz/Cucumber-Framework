@APITestCases
Feature: API Test Cases Feature

  @APITC1
  Scenario: Verify Dummy api for GET
#    Given user launches the application
    Given Initialize Base URI with "https://dummy.restapiexample.com/"
    Then Verify that endpoint "api/v1/employees" gets 200 respose