This application uses

 Java11
 Gradle
 AppEngineFlexible environment
 Embedded Jetty

 using embedded jetty in main class (MainServer.java)

 Gradle task:
 Copies webapp directory to build directory

 app.yaml:
 Entrypoint is given in this file which is used to gae to deploy an application.

 MainClass(MainServer):
 We set base url and calls all the servlets and static files

