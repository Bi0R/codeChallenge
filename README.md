# Backend Challenge League

This is a Java solution for the Backend Challenge, please follow the instructions below to execute the project.

***
## Install and configure Java

First you need to download the java jdk:

[JDK Download Page](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

This solution uses Java 11, so you will need version 11 or greater.

Once you have jdk installed you still need to add the Java bin folder to you Path variable. So locate the place where java is installed in your machine and add it, for example:

      export PATH=$PATH:/usr/lib/jvm/jdk-11-oracle/bin/

After that create the JAVA_HOME variable for you environment, the value of this will be the root directory of Java installation, example:

    JAVA_HOME=/usr/lib/jvm/jdk-11-oracle
    export JAVA_HOME

You can test that everything is OK byt running **javac -version** in your terminal, you should see the current version installed.

***

## Install and configure maven

Maven will build and download all libraries used automatically. In order to install maven you need JAVA_HOME set up.

First you have to download maven:

[Maven Download Page](https://maven.apache.org/download.cgi)

To install maven you unly need to extract the distribution wherever you want, and then add maven/bin to you path variable:

    export PATH=/opt/apache-maven-3.8.1/bin:$PATH

To test maven just type **mvn -v** you should be able to see the version installed.

***

## Running the Project

You need to extract the project and then go to the root directory, you should be able to see the **pom.xml** file, this file contains information for maven.

Now run **mvn clean install**, you will get all the dependencies for the app and run all the tests, once the process is finished you have to run mvn *spring-boot:run* you will see a message that project is up in port 8080, now you can use the endpoints using curl, postman or your preferred method. The Application includes an H2 Database to test the endpoints


[API](http://localhost:8080/customer/)

Is the same URL the behavior changes based on the http method

## If you were to scale your customer API service to millions of customers how would you build it differently?

Using internationalization for some of the possible texts, hystrix fot exception support, add security. Perhaps the functionality is very basic but maybe using Spring Web flux in other make asyn operations.
