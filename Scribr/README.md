# COMP5541 Scribr

## Members
| Name | Student ID |
|------|------------|
| Dunya Oguz | 40181540 |
Muhammad Azman Akhter | 40154969
Hugo Joncour | 40139230
Sarabraj Singh | 29473858
John Purcell | 27217439
Tom Lamouret | 26885446


## Overview
The project follows the standard maven archetype for creating new and simple Java applications. The framework chosen to write the GUI in is <b>Java Swing</b>. We used <b>Apache Netbeans</b> to code and implement the GUI.

## Requirements before Compilation & Execution
1. Java 11 SDK
2. Maven (>=3.6.3)

## Build
Simply execute to compile the application
```bash
mvn clean package
```

## Deployment
Once you have compiled the application, maven will produce a JAR file in the `target` folder where you have the project located. Execute the JAR by running the following command.
```bash
java -cp Scribr-1.0-SNAPSHOT.jar ca.myconcordia.comp5541.scribr.MainUI -classpath <path_to_jdbc_driver.jar>
```

PRO TIP - If you have errors resolvin the classpath to the JDBC driver or SQLITE3 when executing the JAR, load this project into <b>Apache Netbeans</b>, compile and run.

Where <b><path_to_jdbc_driver.jar></b> is the full system path the org.sqlite.jdbc driver. Here is the ArtifactId and GroupId from maven central:
```xml
<groupId>org.xerial</groupId>
<artifactId>sqlite-jdbc</artifactId>
<version>3.34.0</version>
```

## Work to Do
1. Fully implement Word parser based on events entered in the jTextArea
2. Fully implement all features in menus and sub-menus
3. Auto-populate jCheckBoxes on right-hand pane with recent edits
4. Fully integrate SQLITE3 database with all queries to handle and audit user interactions

## FAQ
```url
https://htmlpreview.github.io/?https://github.com/johnpurcell514/COMP-5541_PROJECT/blob/main/SUPPORT/index.html
```

## Report A Bug
```url
https://htmlpreview.github.io/?https://github.com/johnpurcell514/COMP-5541_PROJECT/blob/main/SUPPORT/EmailSupport.html
```