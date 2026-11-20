# selenium-java-automation-framework

# Selenium Java Test Automation Framework

### UI Test Automation | Selenium WebDriver | Java | TestNG | Maven | Page Object Model

## Project Overview

This project demonstrates a scalable and maintainable web test automation framework built using **Selenium WebDriver, Java, TestNG, and Maven**.

The framework follows industry-standard automation design principles, including the **Page Object Model (POM)**, reusable utilities, data-driven testing, and structured test reporting.

It is designed to demonstrate practical test automation capabilities for real-world web applications.

## Technology Stack

| Technology | Purpose |
|---|---|
| Java | Automation programming |
| Selenium WebDriver | Browser automation |
| TestNG | Test execution and assertions |
| Maven | Dependency management |
| Page Object Model | Framework design |
| Apache POI | Excel-based test data |
| Extent Reports | HTML test reporting |
| Git & GitHub | Version control |
| Jenkins | CI/CD integration |

## Key Features

- Modular and maintainable automation framework
- Page Object Model implementation
- Cross-browser testing support
- Data-driven testing using Excel
- Reusable Selenium utilities
- Explicit wait handling
- TestNG assertions and test grouping
- Screenshot capture on test failures
- HTML execution reports
- Maven-based test execution
- CI/CD integration readiness

## Project Structure

```text
Selenium-Java-Automation/
│
├── src/
│   ├── main/java/
│   │   ├── pages/
│   │   │   ├── LoginPage.java
│   │   │   └── DashboardPage.java
│   │   └── utils/
│   │       ├── DriverFactory.java
│   │       ├── ConfigReader.java
│   │       └── ExcelUtils.java
│   │
│   └── test/java/
│       ├── base/
│       │   └── BaseTest.java
│       └── tests/
│           ├── LoginTest.java
│           └── DashboardTest.java
│
├── testdata/
│   └── TestData.xlsx
├── reports/
├── screenshots/
├── pom.xml
├── testng.xml
└── README.md
```

## Test Scenarios

The framework is structured to automate common functional testing scenarios.

**Login Functionality**
- Verify successful login with valid credentials
- Validate error messages for invalid credentials
- Verify mandatory field validations
- Verify logout functionality

**Dashboard Functionality**
- Verify dashboard navigation
- Validate displayed UI elements
- Verify user-specific information

**Regression Testing**
- Execute automated regression suites
