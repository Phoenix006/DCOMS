/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dcoms;

/**
 *
 * @author TP045621
 */

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Server
{
  public static void main(String args[]) throws RemoteException, MalformedURLException, AlreadyBoundException
  {
    RemoteInterface i = new Implementation();
    
    Registry registry = LocateRegistry.createRegistry(6789);
    registry.bind("foodordering", i);
    
    
    System.out.println("Server ready");
      

  }
}
