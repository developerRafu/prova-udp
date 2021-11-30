package com.company.services;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRmiServer extends Remote {
    String getMessage(String txt) throws RemoteException;
    Double getSum(String expression) throws RemoteException;
}
