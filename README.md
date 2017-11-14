# marinatest

## Web Automation (Java, Selenium, Cucumber)

## Clone repo:
git clone git@github.com:Melphomenea/marinatest
Please check the .gitignore file and edit the path for the webdriver that is in the local.properties file
Please run command "mvn test" after cloning

## Requirements:
- Git: https://git-scm.com/book/id/v2/Getting-Started-Installing-Git
- Java: https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html
- Maven: http://www.baeldung.com/install-maven-on-windows-linux-mac

## Structure
#### marinatest/src/test/java/com/marinatest/ contains 4 folders:
- "pages": Contains java files with page objects and methods used by step procedures in "Steps" folder
- "properties": Contains settings for using global environment properties, as well as local properties (useful when setting up the path to local webdriver, especially on Windows nmachines)
- "steps": Contains step procedures used in all feature files
- "world:" Contains java files for webdriver, selenium and cucumber setup

#### marinatest/src/test/resources/ contains:

- properties files (app, cucumber-guice, local)
- com/marinatest/features: feature files with requirement scenarios
