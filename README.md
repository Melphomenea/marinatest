# marinatest

## Web Automation (Java, Selenium, Cucumber)

## Clone repo:
git clone git@github.com:Melphomenea/marinatest
Please check the .gitignore file and edit the path for the webdriver that is in the local.properties file

## Requirements:
- Git: https://git-scm.com/book/id/v2/Getting-Started-Installing-Git
- Java: https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html
- Maven: http://www.baeldung.com/install-maven-on-windows-linux-mac

## Test env:
Please run command "mvn test" after cloning

## Important update (13th Nov 2017)
In the com/marinatest/world/Hooks.java:
(line 4): replace "import org.junit.After;" with "import cucumber.api.java.After;" in order for the shutDownWebDriver() function to work correctly





