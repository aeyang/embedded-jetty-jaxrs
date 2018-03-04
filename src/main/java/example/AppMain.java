package example;

import org.glassfish.jersey.server.ResourceConfig;


public class AppMain extends ResourceConfig {
  public AppMain() {
    packages("example");
  }
}