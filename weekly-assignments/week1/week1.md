# Week 1 – Hello World & Log4j Integration

## MSSE672 – Component Based Software 
**Student:** John Michael Kreski 
**Week:** 1  
**Assignment:** Activity 3 – Instrument Code with Log4j

---

## 📋 Description

This module serves as the initial setup for the MSSE672 course. It verifies the Java development environment, imports the project structure, and introduces logging via Log4j 2.

### Objectives:
- Confirm working development environment (Java 17+, Maven, IntelliJ)
- Create a basic `Hello World` Java application
- Integrate Apache Log4j 2 for console-based logging
- Log informational, warning, and error messages

---

## 🧱 Project Structure

```
week1/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/App.java
│   │   └── resources/
│   │       └── log4j2.xml
└── Docs/
    ├── HWExecution.doc
    └── HWUnitTestExecution.doc
```

---

## 🔧 Build & Run

### Prerequisites:
- Java 17+
- Maven
- IntelliJ IDEA (or compatible IDE)

### Run from IntelliJ:
1. Right-click `App.java` → Run `App.main()`
2. Check the output console for Log4j messages

### Run from Terminal:

```bash
cd week1
mvn compile
mvn exec:java -Dexec.mainClass="com.example.App"
```

---

## 📝 Logging Output Example

```
2025-07-06 10:00:00 [main] INFO  com.example.App - Hello, Log4j2 World!
2025-07-06 10:00:00 [main] WARN  com.example.App - This is a warning.
2025-07-06 10:00:00 [main] ERROR com.example.App - This is an error.
```

---

## 📄 Documentation

- **HWExecution.doc**: Screenshot of successful compilation and execution
- **HWUnitTestExecution.doc**: Will contain unit test results (if applicable)

---

## 📚 Notes

- Project is structured as a Maven module under the `msse672-assignments` parent project
- Logging is configured using `log4j2.xml` in `src/main/resources`
- All messages go to the console via Log4j's ConsoleAppender
