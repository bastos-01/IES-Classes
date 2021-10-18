# Lab 2.1

## Install Apache tomcat

    $curl -I 127.0.0.1:8080 
    
    Check:  
    http://localhost:8080

    Check the log:
    $tail logs/catalina.out

## Deployment of the application (log)

    20-Oct-2020 09:18:35.382 INFO [main] org.apache.coyote.AbstractProtocol.init Initializing ProtocolHandler ["http-nio-8080"]
    20-Oct-2020 09:18:35.436 INFO [main] org.apache.catalina.startup.Catalina.load Server initialization in [807] milliseconds
    20-Oct-2020 09:18:35.498 INFO [main] org.apache.catalina.core.StandardService.startInternal Starting service [Catalina]
    20-Oct-2020 09:18:35.498 INFO [main] org.apache.catalina.core.StandardEngine.startInternal Starting Servlet engine: [Apache Tomcat/9.0.39]
    20-Oct-2020 09:18:35.509 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deploying web application directory [/Users/hacker/Desktop/UA/IES/lab2/apache-tomcat-9.0.39/webapps/docs]
    20-Oct-2020 09:18:35.827 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deployment of web application directory [/Users/hacker/Desktop/UA/IES/lab2/apache-tomcat-9.0.39/webapps/docs] has finished in [317] ms
    20-Oct-2020 09:18:35.827 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deploying web application directory [/Users/hacker/Desktop/UA/IES/lab2/apache-tomcat-9.0.39/webapps/manager]
    20-Oct-2020 09:18:35.869 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deployment of web application directory [/Users/hacker/Desktop/UA/IES/lab2/apache-tomcat-9.0.39/webapps/manager] has finished in [42] ms
    20-Oct-2020 09:18:35.869 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deploying web application directory [/Users/hacker/Desktop/UA/IES/lab2/apache-tomcat-9.0.39/webapps/examples]
    20-Oct-2020 09:18:36.205 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deployment of web application directory [/Users/hacker/Desktop/UA/IES/lab2/apache-tomcat-9.0.39/webapps/examples] has finished in [335] ms
    20-Oct-2020 09:18:36.205 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deploying web application directory [/Users/hacker/Desktop/UA/IES/lab2/apache-tomcat-9.0.39/webapps/ROOT]
    20-Oct-2020 09:18:36.229 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deployment of web application directory [/Users/hacker/Desktop/UA/IES/lab2/apache-tomcat-9.0.39/webapps/ROOT] has finished in [24] ms
    20-Oct-2020 09:18:36.230 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deploying web application directory [/Users/hacker/Desktop/UA/IES/lab2/apache-tomcat-9.0.39/webapps/host-manager]
    20-Oct-2020 09:18:36.270 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deployment of web application directory [/Users/hacker/Desktop/UA/IES/lab2/apache-tomcat-9.0.39/webapps/host-manager] has finished in [40] ms
    20-Oct-2020 09:18:36.281 INFO [main] org.apache.coyote.AbstractProtocol.start Starting ProtocolHandler ["http-nio-8080"]
    20-Oct-2020 09:18:36.306 INFO [main] org.apache.catalina.startup.Catalina.start Server startup in [869] milliseconds
    20-Oct-2020 09:42:37.145 INFO [Catalina-utility-2] org.apache.catalina.users.MemoryUserDatabase.backgroundProcess Reloading memory user database [UserDatabase] from updated source [file:/Users/hacker/Desktop/UA/IES/lab2/apache-tomcat-9.0.39/conf/tomcat-users.xml]
    20-Oct-2020 09:49:06.923 INFO [http-nio-8080-exec-7] org.apache.catalina.startup.HostConfig.deployWAR Deploying web application archive [/Users/hacker/Desktop/UA/IES/lab2/apache-tomcat-9.0.39/webapps/tomcat-1.0-SNAPSHOT.war]
    20-Oct-2020 09:49:06.988 INFO [http-nio-8080-exec-7] org.apache.catalina.startup.HostConfig.deployWAR Deployment of web application archive [/Users/hacker/Desktop/UA/IES/lab2/apache-tomcat-9.0.39/webapps/tomcat-1.0-SNAPSHOT.war] has finished in [66] ms

## What are the responsibilities/services of a “servlet container”?

    A servlet container is responsible for managing the lifecycle of servlets, mapping a URL to a particular servlet and ensuring that the URL requester has the correct access-rights.
    A web container handles requests to servlets, Jakarta Server Pages (JSP) files, and other types of files that include server-side code. The Web container creates servlet instances, loads and unloads servlets, creates and manages request and response objects, and performs other servlet-management tasks.


