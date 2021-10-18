# Lab 2.3

## Spring Boot

    $./mvnw clean install
    To run it:
    $./mvnw spring-boot:run

    O servidor passa a correr no localhost na porta especificada (default 8000)

### Web applications in Java can be deployed to stand-alone applications servers or embedded servers. Elaborate on when to choose one over the other(and relate with Spring Boot).

    Embedded Servers are useful when you run your Application like an OS process. In this case, you do not need to setup an app server (like tomcat). It can also be used when deploying on cloud services, because you only need to wrap the app server within your jar. The app is responsible for the configuration of the server.  Although it seems very simple, if you wish to install 2 web apps, it is not a good option at all.

    On the other hand, Standalone applications servers give local authentication and it can access all available resources. It is only needed the creation of user accounts. They are used at a local level where security may not be needed.

    In Spring Boot, tomcat is used as its default embedded server.

### Explain, in brief, the “dynamics”of Model-View-Controller approach used in Spring Boot to serve web content.(You may exemplifywith the context of the previous exercises.)

    Spring Boot uses the Model-View-Controller pattern where the application is divided in 3 parts:

    When an HTTP request is made, the Controller receives and processes it. The Model is the middleware between the Controller and the View, which is being controlled by the Controller to update the View. Therefore, with the view, the user is able to see the processed request.

    As we used it in previous exercises, the '@Controller' function handles the requests.

### Inspect the POM.xml for the previous SpringBoot projects. What is the role of the “starters” dependencies?

    It provides all the default dependencies so that we can run the Spring Boot application without adding any other dependencies, it makes the build faster and easier.

### Which annotations are transitively included in the @SpringBootApplication?

    @EnableAutoConfiguration - enable Spring Boot´s auto-configuration mechanism so that the project is ready to be built.
    @ComponentScan - It allows the Spring Boot to identify all Spring annotations.
    @Configuration - It allows to add aditional configurations to our Spring project.

