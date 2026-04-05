# 🥒 Cucumber-Framework

> **Test Automation Framework** — Java · Selenium · Cucumber · TestNG

A robust and scalable **BDD (Behavior Driven Development)** automation framework built with Java, Selenium WebDriver, Cucumber, and TestNG. Designed for maintainability, reusability, and clear test reporting.

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java |
| UI Automation | Selenium WebDriver |
| BDD | Cucumber (Gherkin) |
| Test Runner | TestNG |
| Build Tool | Maven |
| Reporting | Extent Spark Reports / Cucumber Reports |
| Version Control | Git |

---

## ✨ Features

- **BDD Framework** using Gherkin syntax for human-readable test scenarios
- **Page Object Model (POM)** for clean separation of UI logic
- **TestNG Integration** for test lifecycle management
- **Tag-Based Execution** — run only `@Smoke`, `@Regression`, or any custom tag
- **Parallel Execution** support for faster test runs
- **Config-Driven Setup** via `config.properties`
- **Reusable Utilities** for common actions across tests
- **Detailed Reporting** with screenshots on failure

---

## 📁 Project Structure

```
Cucumber-Framework/
├── selenium-cucumber-framework-sparkreport/
│   ├── src/
│   │   └── test/
│   │       ├── java/
│   │       │   ├── stepdefinitions/    # Cucumber step definitions
│   │       │   ├── runners/            # TestNG + Cucumber runners
│   │       │   ├── hooks/              # Before/After hooks
│   │       │   ├── pages/              # Page Object classes
│   │       │   └── utils/              # Utility/helper classes
│   │       └── resources/
│   │           ├── features/           # Gherkin .feature files
│   │           ├── config/             # config.properties
│   │           └── testdata/           # Test data files
│   ├── testng.xml                      # TestNG suite configuration
│   └── pom.xml                         # Maven build config & dependencies
└── README.md
```

---

## ⚙️ Configuration

Edit `src/test/resources/config/config.properties` before running:

```properties
baseUrl=https://example.com
browser=chrome
implicitWait=10
```

---

## 🚀 How to Run Tests

### Prerequisites

- Java 8+
- Maven 3.6+
- Chrome / Firefox browser installed
- ChromeDriver / GeckoDriver on system PATH (or managed via WebDriverManager)

### Run All Tests

```bash
mvn clean test
```

### Run by Tag

```bash
# Smoke tests only
mvn clean test -Dcucumber.filter.tags="@Smoke"

# Regression tests only
mvn clean test -Dcucumber.filter.tags="@Regression"

# Exclude a tag
mvn clean test -Dcucumber.filter.tags="not @WIP"
```

### Run via TestNG XML

```bash
mvn clean test -DsuiteXmlFile=testng.xml
```

---

## 📝 Sample Feature File

```gherkin
Feature: Login Functionality

  @Smoke
  Scenario: Successful Login with valid credentials
    Given User is on the login page
    When User enters valid credentials
    Then User should be logged in successfully

  @Regression
  Scenario: Failed Login with invalid credentials
    Given User is on the login page
    When User enters invalid credentials
    Then an error message should be displayed
```

---

## 📊 Reporting

After a test run, reports are generated in the `/target/` directory:

| Report Type | Location |
|---|---|
| Cucumber HTML Report | `target/cucumber-reports/` |
| Extent Spark Report | `target/spark-reports/` |
| Screenshots (on failure) | Embedded in Extent Report |

Open the HTML file in any browser to view the full test execution summary, step-by-step results, and failure screenshots.

---

## 🏗️ Framework Architecture

```
┌──────────────────────────────────────────┐
│             Feature Files (.feature)      │  ← Written in Gherkin
└────────────────────┬─────────────────────┘
                     │
┌────────────────────▼─────────────────────┐
│           Step Definitions               │  ← Java methods mapped to steps
└────────────────────┬─────────────────────┘
                     │
┌────────────────────▼─────────────────────┐
│           Page Object Model (Pages)      │  ← UI element interactions
└────────────────────┬─────────────────────┘
                     │
┌────────────────────▼─────────────────────┐
│     Selenium WebDriver + Utilities       │  ← Browser automation layer
└────────────────────┬─────────────────────┘
                     │
┌────────────────────▼─────────────────────┐
│         Extent Spark / Cucumber Reports  │  ← Test results & screenshots
└──────────────────────────────────────────┘
```

---

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch: `git checkout -b feature/my-new-test`
3. Commit your changes: `git commit -m 'Add new test scenario for X'`
4. Push to the branch: `git push origin feature/my-new-test`
5. Open a Pull Request

---

## 👤 Author

**Ashay Zemse**  
Senior SDET  
[GitHub: @ashayz](https://github.com/ashayz)

---

## 📄 License

This project is open-source and available for educational and professional use.
