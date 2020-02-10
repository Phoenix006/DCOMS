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

import java.rmi.*;
public interface RemoteInterface extends Remote
{

    public String[] getUserDetails() throws RemoteException;
  
}
