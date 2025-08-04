# How this project is created

## Prerequisites
- Install Gradle
  ```
  gradle -v
  ```
- Install JDK
  ```
  java --version
  javac --version
  ```
- Install Kotlin Compiler
  ```
  kotlinc -version
  ```
- For VS Code, please install extension:
  - Extension Pack for Java
  - Kotlin
  - Code Runner

## Initialize Projects
Open Terminal and Run
```
gradle init
```
Gradle will prompt you with some choices:

1. Select type of project:

- application
- library
- basic (if you want just the minimal setup)

2. Choose language:

- Java, Kotlin, Groovy, Scala

3. Build script DSL:

- Groovy (default)
- Kotlin

4. Test framework:

- JUnit, TestNG, Spock, etc.

5. Project name (default is folder name)


## Build and Run

### Build Project
```
./gradlew build
```

### Run Application (if applicaiton type)
```
./gradlew run
```