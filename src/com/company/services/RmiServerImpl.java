package com.company.services;

import com.company.utils.UtilService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RmiServerImpl extends UnicastRemoteObject implements IRmiServer {

    UtilService service = new UtilService();

    public RmiServerImpl() throws RemoteException {
        super();
    }

    @Override
    public String getMessage(String txt) throws RemoteException {
        return "Alooo " + txt;
    }


    @Override
    public Double getSum(String expression) throws RemoteException {
        return this.service.getSumByExpression(expression);
    }
}
