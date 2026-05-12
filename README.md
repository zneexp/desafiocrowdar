## Repository

[github.com/zneexp/desafiocrowdar
](https://github.com/zneexp)

---

## Description

This project is a functional test automation framework built with **Java**, using **Selenium WebDriver**, **JUnit 5**, **Cucumber**, and **Gradle**.

It validates login and shopping cart features from [saucedemo.com](https://www.saucedemo.com), and also consumes and verifies a public API from Mercado Libre.

## Tech Stack

- Java 17+
- Cucumber
- Gradle
- Selenium WebDriver
- JUnit 5
- Chrome/Firefox 

## How to Run

### From Terminal

```bash
./gradlew test
```

### From Cucumber Runner

Run the class:

```
src/test/java/runner/RunCucumberTest.java
```

## Browser Switch

Default browser is **Chrome**, but you can change it to **Firefox** in:

```
src/test/java/steps/Hooks.java
```

Change the value:

```java
DriverType driverType = CHROME; --> change it to FIREFOX
```

## Reports and Screenshots

- Test reports (.html) are generated under:

```
target/
```

- Screenshots on failure are attached directly to the Cucumber HTML report.
