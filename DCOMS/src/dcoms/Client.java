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
import java.util.Scanner;
public class Client 
{
  public static void main(String args[]) throws RemoteException, NotBoundException
  {
      Registry registry = LocateRegistry.getRegistry("localhost",6789);
      
      RemoteInterface stub = (RemoteInterface) registry.lookup("foodordering");
      
      
      
//      RemoteInterface r = (RemoteInterface) Naming.lookup("rmi://localhost:6789/foodordering");
//      
//      r.getUserDetails();
//      
      
      
     
  }
}