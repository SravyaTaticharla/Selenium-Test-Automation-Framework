## Test Automation Framework ##

This is a Java-based Test Automation Framework that uses TestNG, OpenCSV, Apache POI, Gson, and Faker for testing, data-driven execution, and fake data generation.

The framework is designed for cloud-based test execution with LambdaTest integration, and it supports headless execution to speed up test execution. The framework also generates detailed Extent Reports and Log4j logs for tracking test results.



## Author

- [Sravya](https://github.com/SravyaTaticharla)
- EmailAddress:sravyat61@gmail.com


## 🚀 About Me
Hi, My Name is Sravya taticharla and I have 6 years of experience in Automation Testing using technologies like Selenium Webdriver, RestAssured.

My major expertise is in Java Programming Language.


## Prerequisites

Before running the test automation framework, ensure you have the following installed:

- **Java** 11 or later

- **Maven** (for dependency management and test execution)
- Downlod Link: https://maven.apache.org/download.cgi

## Features
- **Data-Driven Testing**: Using OpenCSV, Apache POI, and Gson for reading test data from CSV and Excel files and JSON.
- **Cross-Browser Testing**: Supports running tests on different browsers.
- **Headless Mode**: Faster execution by running tests in headless mode.
- **Cloud Testing**: Integrated with LambdaTest to run tests on the cloud.
- **Logging**: Uses Log4j for detailed logs.
- **Reporting**: Generates detailed reports using Extent Reports.


##Technologies Used##
- Java 11
- TestNG
- OpenCSV
- Gson
- Apache POI
- Faker
- LambdaTest
- Log4j
- Extent Reports


## Setup Instructions

Clone the Repository:

```bash
  git clone https://github.com/SravyaTaticharla/Selenium-Test-Automation-Framework.git

  cd Test-Automation-Framework
```
 **Running Tests on LambdaTest**:
```bash
   mvn test  -Dbrowser=chrome -DisLambdaTest=true -DisHeadless=false -X
```

**Running Tests on Chrome browser on Local Machine in Headless Mode:**
```bash
   mvn test  -Dbrowser=chrome -DisLambdaTest=false -DisHeadless=true -X

   ```

## Reports & Logs ##

-Reports: After execution, a detailed HTML report will be generated at ./report.html.

The report contains information on test cases executed, passed, failed, and skipped, along with screenshots for failed tests.

## Logs: ##
Logs are created during the test execution and stored in the ./logs/ directory.

## Integrated the project Github Actions ##
This automation framework is integrated with github actions. The tests will be executed at 11:30PM IST every single day.
