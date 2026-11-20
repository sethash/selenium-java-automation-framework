# Selenium Java Test Automation Framework — Portfolio Demo

A self-contained **QA automation portfolio sample** testing the public [SauceDemo](https://www.saucedemo.com/) demonstration store. This is an independently authored demonstration, **not a client engagement**.

## Tech stack
Java 17 · Selenium WebDriver 4 · TestNG 7 · Maven · Page Object Model · GitHub Actions · Jenkins pipeline sample

## Covered workflows
- Valid login (smoke)
- Invalid and locked-out user authentication (data-driven, two inputs)
- Add backpack to cart and verify item
- Complete checkout and verify confirmation (smoke)

There are **five test invocations** across four test methods, including the two DataProvider inputs.

## Prerequisites
- JDK 17+
- Maven 3.9+
- Chrome or Firefox installed
- Internet access to SauceDemo and, on first use, browser driver resolution via Selenium Manager

## Run locally
```bash
mvn clean test
mvn clean test -Dheadless=true
mvn clean test -Dbrowser=firefox -Dheadless=true
```

Run smoke tests only:
```bash
mvn test -Dgroups=smoke -Dheadless=true
```

## Results
- TestNG / Maven Surefire reports: `target/surefire-reports/`
- Failure screenshots: `target/screenshots/`
- GitHub Actions workflow: `.github/workflows/tests.yml`
- Jenkins declarative pipeline: `Jenkinsfile` (requires configured `JDK17`, `Maven3`, browser installation)

## Framework structure
```text
src/test/java/com/portfolio/
  base/BaseTest.java             browser setup and teardown
  pages/LoginPage.java           login page object
  pages/ProductsPage.java        products page object
  pages/CartPage.java            cart page object
  pages/CheckoutPage.java        checkout page object
  tests/LoginTests.java          login tests and data provider
  tests/ShoppingTests.java       cart and checkout tests
  utils/Screenshots.java         failure screenshot helper
src/test/resources/testng.xml    TestNG suite
```

## Notes
- The site and demo credentials are public, supplied by SauceDemo for learning and testing.
- This framework uses Selenium Manager for browser drivers; no hard-coded local driver paths.
- Tests have not been executed in this delivery environment. Run locally or in CI and attach authentic reports to your Upwork portfolio.
- Do not claim measured execution speed, coverage percentages, or production impact without evidence.
