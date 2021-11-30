package com.company;

import com.company.services.IRmiServer;
import com.company.services.RmiServerImpl;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Publisher {

    public static void main(String[] args) throws Exception {
            LocateRegistry.createRegistry(1099);
            IRmiServer server = new RmiServerImpl();
            Naming.bind("teste-udp", server);
    }
}
