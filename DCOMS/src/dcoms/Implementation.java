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
import java.rmi.*;                  // for RemoteException
import java.rmi.server.*;           // for UnicastRemoteObject
import java.util.Scanner;
public class Implementation extends UnicastRemoteObject implements RemoteInterface
{
  String[] userDetails = {"First Name: ", "Last Name: ", "IC or Passport Number: "};
  public Implementation() throws RemoteException
  {
    super();
  }
  
  public String[] getUserDetails() throws RemoteException {
     return userDetails;
  }
} 
