package com.stephane.sparadrap;

import com.stephane.entity.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(1, "didier", "porte", "54190", "Lens", "0675647564", "q@q.fr", "098475647836455");

        client.setCodePostal("rrrrr");

        System.out.println(client.verifCodePostal());
        System.out.println(client.getCodePostal());
    }
}