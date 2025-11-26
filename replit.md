# A Stack of Dishes (Java)

## Project Overview
This is a Java CLI application that implements a "Stack of Dishes" programming lab. The project uses Gradle as the build automation tool and Java 21 as the runtime environment.

## Project Structure
- **Language**: Java 21
- **Build Tool**: Gradle 8.10.2
- **Main Class**: `org.example.App`
- **Test Framework**: JUnit Jupiter 5.10.3
- **Dependencies**: Google Guava 33.2.1

## File Structure
```
app/
├── src/
│   ├── main/java/org/example/
│   │   ├── App.java        # Main application entry point
│   │   └── Dish.java       # Dish class for the stack implementation
│   └── test/java/org/example/
│       └── AppTest.java    # Unit tests
├── build.gradle            # Gradle build configuration
gradle/                     # Gradle wrapper files
```

## Running the Application
The application runs as a console application. Use the "Run Application" workflow or execute:
```bash
./gradlew run --quiet --console=plain
```

## Building and Testing
- **Build**: `./gradlew build`
- **Test**: `./gradlew test`
- **Run**: `./gradlew run --quiet --console=plain`

## Replit Setup
This project has been configured to run in the Replit environment:
- Java toolchain: GraalVM CE 22.3.1 (Java 19) with auto-provisioned Java 21 for builds
- Workflow configured for console output
- Gradle wrapper is executable and ready to use

## Recent Changes
- **2025-11-26**: Initial setup in Replit environment
  - Installed Java toolchain (GraalVM)
  - Made gradlew executable
  - Configured "Run Application" workflow
  - Verified build and test execution
