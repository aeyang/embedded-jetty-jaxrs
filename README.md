Experiments with an Embedded Jetty Server and JaxRS
================================================

What is an Embedded Jetty Server? Its just Jetty without the servlet container.
I'm just using Jetty, the server. Therefore:

1. I don't need a web.xml file.
2. I'm starting the Jetty server programatically.
3. There is no WAR file nor any need for one. All your resources are
   explicitly stated when you start your sever.
4. I'm not using Jetty's start script or anything. I'm outputting a jar and
   running the jar using java -jar



Gotchas:
1. So, you can't run java -jar and also give it a classpath. So, I just built a fat jar    and just ran that.
You can either use java -jar or java -cp, not both


Notes:
1. Since this project is small, I won't .gitignore the compiled .class files or dependency jars.
