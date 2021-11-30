package com.company;

import com.company.services.IRmiServer;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Consumer {

    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
        String url = "rmi://localhost/teste-udp";
        IRmiServer server = (IRmiServer) Naming.lookup(url);
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a expressão(modelo - '1+1'): ");
        String expression = sc.nextLine();
        System.out.println("A resposta de " + expression + " é " + server.getSum(expression));
        System.out.print("Insira a mensagem = ");
        String msg = sc.nextLine();
        System.out.println("Respota do servidor " + server.getMessage(msg));
    }
}
